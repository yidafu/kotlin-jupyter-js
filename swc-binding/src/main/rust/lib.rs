use std::path::Path;
use std::sync::Arc;

use anyhow::Context;
use jni::objects::{JClass, JString};
use jni::sys::{jboolean, jstring};
use jni::JNIEnv;
use jni_fn::jni_fn;
use serde::de::DeserializeOwned;
use swc::{config::Options, try_with_handler, Compiler};
use swc_common::{sync::Lazy, FileName, FilePathMapping, SourceMap, GLOBALS};
use swc_ecma_ast::Program;

pub fn deserialize_json<T>(json: &str) -> Result<T, serde_json::Error>
where
    T: DeserializeOwned,
{
    let mut deserializer = serde_json::Deserializer::from_str(json);
    deserializer.disable_recursion_limit();

    T::deserialize(&mut deserializer)
}

static COMPILER: Lazy<Arc<Compiler>> = Lazy::new(|| {
    let cm = Arc::new(SourceMap::new(FilePathMapping::empty()));

    Arc::new(Compiler::new(cm))
});

fn get_compiler() -> Arc<Compiler> {
    COMPILER.clone()
}

#[jni_fn("dev.yidafu.swc.SwcNative")]
pub fn sayHello(mut env: JNIEnv, _: JClass, input: JString) -> jstring {
    let input: String = env
        .get_string(&input)
        .expect("Couldn't get java string!")
        .into();

    let output = env
        .new_string(format!("Hello, {}!", input))
        .expect("Couldn't create java string!");

    output.into_raw()
}

#[jni_fn("dev.yidafu.swc.SwcNative")]
pub fn parseSync(mut env: JNIEnv, _: JClass, code: JString, options: JString, filename: JString) -> jstring {
    let input: String = env
        .get_string(&code)
        .expect("Couldn't get java string!")
        .into();

    let output = env
        .new_string(format!("Hello, {}!", input))
        .expect("Couldn't create java string!");

    output.into_raw()
}

#[jni_fn("dev.yidafu.swc.SwcNative")]
pub fn parseFileSync(mut env: JNIEnv, _: JClass, filepath: JString, options: JString) -> jstring {
    let path: String = env
        .get_string(&filepath)
        .expect("Couldn't get java string!")
        .into();
    let c = get_compiler();
    let fm =    c.cm.load_file(Path::new(path.as_str())).unwrap();
    let output = GLOBALS
        .set(&Default::default(), || {
            try_with_handler(c.cm.clone(), Default::default(), |handler| {
                c.process_js_file(fm, handler, &Default::default())
            })
        })
        .unwrap();

    let output = env
        .new_string(output.code)
        .expect("Couldn't create Java String");
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
    code: JString,
    is_module: jboolean,
    options: JString,
) -> jstring {
    let c = get_compiler();
    let src: String = env.get_string(&code).expect("").into();
    let input = c.cm.new_source_file(FileName::Anon, src);
    let output = GLOBALS
        .set(&Default::default(), || {
            try_with_handler(c.cm.clone(), Default::default(), |handler| {
                c.process_js_file(input, handler, &Default::default())
            })
        })
        .unwrap();

    let output = env
        .new_string(output.code)
        .expect("Couldn't create Java String");
    output.into_raw()
}
