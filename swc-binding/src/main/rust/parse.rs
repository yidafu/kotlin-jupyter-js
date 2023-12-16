use std::path::Path;

use jni::{
    objects::{JClass, JString},
    sys::jstring,
    JNIEnv,
};
use jni_fn::jni_fn;
use swc::config::{ErrorFormat, ParseOptions};
use swc_common::{comments::Comments, FileName, Mark};
use swc_ecma_transforms_base::resolver;

use swc_ecma_visit::VisitMutWith;

use crate::get_compiler;

use crate::util::{get_deserialized, process_result, try_with, MapErr};

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
    let opts: String = env
        .get_string(&options)
        .expect("Couldn't get java string!")
        .into();
    let filename: String = env
        .get_string(&filename)
        .expect("Couldn't get java string!")
        .into();
    // crate::util::init_default_trace_subscriber();
    let c = get_compiler();

    let options: ParseOptions = get_deserialized(&opts).unwrap();
    let filename = if filename.is_empty() {
        FileName::Anon
    } else {
        FileName::Real(filename.into())
    };

    let result = try_with(c.cm.clone(), false, ErrorFormat::Normal, |handler| {
        c.run(|| {
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
    .convert_err();

    process_result(env, result)
}

#[jni_fn("dev.yidafu.swc.SwcNative")]
pub fn parseFileSync(mut env: JNIEnv, _: JClass, filepath: JString, options: JString) -> jstring {
    let opts: String = env
        .get_string(&options)
        .expect("Couldn't get java string!")
        .into();
    let path: String = env
        .get_string(&filepath)
        .expect("Couldn't get java string!")
        .into();

    // crate::util::init_default_trace_subscriber();

    let c = get_compiler();
    let options: ParseOptions = get_deserialized(&opts).unwrap();

    let result = {
        try_with(c.cm.clone(), false, ErrorFormat::Normal, |handler| {
            let fm =
                c.cm.load_file(Path::new(path.as_str()))
                    .expect("failed to read program file");

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
    }
    .convert_err();

    process_result(env, result)
}
