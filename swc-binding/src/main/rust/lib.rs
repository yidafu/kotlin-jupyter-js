use std::any::type_name;
use std::path::Path;
use std::sync::Arc;

use anyhow::Context;
use combine::error::StringStreamError;
use jni::errors::{Error, Exception};
use jni::objects::{JClass, JString};
use jni::sys::{jboolean, jstring};
use jni::JNIEnv;
use jni_fn::jni_fn;
use serde::de::DeserializeOwned;
use swc::config::ParseOptions;
use swc::{config::Options, try_with_handler, Compiler};
use swc_common::comments::Comments;
use swc_common::Mark;
use swc_common::{sync::Lazy, FileName, FilePathMapping, SourceMap, GLOBALS};
use swc_ecma_ast::Program;
use swc_ecma_transforms_base::resolver;
use swc_ecma_visit::VisitMutWith;

pub fn deserialize_json<T>(json: &str) -> Result<T, serde_json::Error>
where
    T: DeserializeOwned,
{
    let mut deserializer = serde_json::Deserializer::from_str(json);
    deserializer.disable_recursion_limit();

    T::deserialize(&mut deserializer)
}
// format!("{:?}", err)
pub trait MapErr<T>: Into<Result<T, anyhow::Error>> {
    fn convert_err(self) -> jni::errors::Result<T> {
        self.into().map_err(|err| {
            jni::errors::Error::ParseFailed(
                StringStreamError::UnexpectedParse,
                format!("{:?}", err),
            )
        })
    }
}

impl<T> MapErr<T> for Result<T, anyhow::Error> {}

// pub trait MapErr<T> : Result<T, anyhow::Error> {
//     fn convert_err(self) -> jni::errors::Result<T> {
//                 self.into()
//             .map_err(|err| jni::errors::Error::ParseFailed(StringStreamError::UnexpectedParse, format!("{:?}", err)))
//     }
// }

pub fn get_deserialized<T, B>(buffer: B) -> jni::errors::Result<T>
where
    T: DeserializeOwned,
    B: AsRef<[u8]>,
{
    let mut deserializer = serde_json::Deserializer::from_slice(buffer.as_ref());
    deserializer.disable_recursion_limit();

    let v = T::deserialize(&mut deserializer)
        .with_context(|| {
            format!(
                "Failed to deserialize buffer as {}\nJSON: {}",
                type_name::<T>(),
                String::from_utf8_lossy(buffer.as_ref())
            )
        })
        .convert_err()?;

    Ok(v)
}

static COMPILER: Lazy<Arc<Compiler>> = Lazy::new(|| {
    let cm = Arc::new(SourceMap::new(FilePathMapping::empty()));

    Arc::new(Compiler::new(cm))
});

fn get_compiler() -> Arc<Compiler> {
    COMPILER.clone()
}

#[jni_fn("dev.yidafu.swc.SwcNative")]
pub fn parseSync(
    mut env: JNIEnv,
    _: JClass,
    code: JString,
    options: JString,
    filename: JString,
) -> jstring {
    let src: String = env
        .get_string(&code)
        .expect("Couldn't get java string!")
        .into();
    let c = get_compiler();
    let options: String = env
        .get_string(&options)
        .expect("Couldn't get java string!")
        .into();
    let filenameR: String = env
        .get_string(&filename)
        .expect("Couldn't get java string!")
        .into();
    let refOptions = options.as_bytes();
    let options: ParseOptions = get_deserialized(refOptions).unwrap();
    let filename = FileName::Anon;
    if filenameR.is_empty() {
        FileName::Anon
    } else {
        FileName::Real(filenameR.into())
    };

    let program = GLOBALS
        .set(&Default::default(), || {
            try_with_handler(c.cm.clone(), Default::default(), |handler| {
                let fm = c.cm.new_source_file(filename, src);
                let comments = if options.comments {
                    Some(c.comments() as &dyn Comments)
                } else {
                    None
                };
                let mut p = c.parse_js(
                    fm,
                    handler,
                    options.target,
                    options.syntax,
                    options.is_module,
                    comments,
                )?;

                p.visit_mut_with(&mut resolver(
                    Mark::new(),
                    Mark::new(),
                    options.syntax.typescript(),
                ));

                Ok(p)
            })
        })
        .unwrap();

    let ast_json = serde_json::to_string(&program).unwrap();
    let output = env
        .new_string(ast_json)
        .expect("Couldn't create java string!");

    output.into_raw()
}

#[jni_fn("dev.yidafu.swc.SwcNative")]
pub fn parseFileSync(mut env: JNIEnv, _: JClass, filepath: JString, options: JString) -> jstring {
    let c = get_compiler();
    let options: String = env
        .get_string(&options)
        .expect("Couldn't get java string!")
        .into();
    let filepathR: String = env
        .get_string(&filepath)
        .expect("Couldn't get java string!")
        .into();
    let refOptions = options.as_bytes();
    let options: ParseOptions = get_deserialized(refOptions).unwrap();

    let program = GLOBALS
        .set(&Default::default(), || {
            try_with_handler(c.cm.clone(), Default::default(), |handler| {
                let comments = if options.comments {
                    Some(c.comments() as &dyn Comments)
                } else {
                    None
                };
                let fm =
                    c.cm.load_file(Path::new(filepathR.as_str()))
                        .expect("failed to read program file");
                let mut p = c.parse_js(
                    fm,
                    handler,
                    options.target,
                    options.syntax,
                    options.is_module,
                    comments,
                )?;

                p.visit_mut_with(&mut resolver(
                    Mark::new(),
                    Mark::new(),
                    options.syntax.typescript(),
                ));

                Ok(p)
            })
        })
        .unwrap();

    let ast_json = serde_json::to_string(&program).unwrap();
    let output = env
        .new_string(ast_json)
        .expect("Couldn't create java string!");

    output.into_raw()
}

#[jni_fn("dev.yidafu.swc.SwcNative")]
pub fn transformSync(
    mut env: JNIEnv,
    _: JClass,
    code: JString,
    is_module: jboolean,
    options: JString,
) -> jstring {
    let src: String = env
        .get_string(&code)
        .expect("Couldn't get java string!")
        .into();
    let options_str: String = env
        .get_string(&options)
        .expect("Couldn't get java string!")
        .into();
    let options: Options = deserialize_json(&options_str).unwrap();
    let c = get_compiler();

    let output = match is_module {
        1 => {
            let fm = c.cm.new_source_file(FileName::Anon, src);
            GLOBALS.set(&Default::default(), || {
                try_with_handler(c.cm.clone(), Default::default(), |handler| {
                    c.process_js_file(fm, handler, &options)
                })
            })
        }
        _ => {
            let program: Program =
                deserialize_json(src.as_str()).expect("failed to deserialize Program");

            GLOBALS.set(&Default::default(), || {
                try_with_handler(c.cm.clone(), Default::default(), |handler| {
                    c.process_js(handler, program, &options)
                })
            })
        }
    };

    env.new_string(output.unwrap().code)
        .expect("Couldn't create Java String")
        .into_raw()
}

#[jni_fn("dev.yidafu.swc.SwcNative")]
pub fn transformFileSync(
    mut env: JNIEnv,
    _: JClass,
    filepath: JString,
    is_module: jboolean,
    options: JString,
) -> jstring {
    let c = get_compiler();

    let s: String = env
        .get_string(&filepath)
        .expect("Couldn't get java string!")
        .into();
    let options_str: String = env
        .get_string(&options)
        .expect("Couldn't get java string!")
        .into();

    let mut options: Options = deserialize_json(&options_str).unwrap();

    if !options.filename.is_empty() {
        options.config.adjust(Path::new(&options.filename));
    }
    // let error_format = options.experimental.error_format.unwrap_or_default();
    println!("isModule ==> {}", is_module);
    let output = match is_module {
        1 => {
            let program: Program =
                deserialize_json(s.as_str()).expect("failed to deserialize Program");

            GLOBALS.set(&Default::default(), || {
                try_with_handler(c.cm.clone(), Default::default(), |handler| {
                    c.process_js(handler, program, &options)
                })
            })
        }
        _ => {
            let fm = c.cm.load_file(Path::new(&s)).expect("failed to load file");
            GLOBALS.set(&Default::default(), || {
                try_with_handler(c.cm.clone(), Default::default(), |handler| {
                    c.process_js_file(fm, handler, &options)
                })
            })
        }
    };

    env.new_string(output.unwrap().code)
        .expect("Couldn't create Java String")
        .into_raw()
}
