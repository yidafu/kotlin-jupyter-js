use std::path::Path;

use anyhow::Context;
use jni::objects::{JClass, JString};
use jni::sys::{jboolean, jstring};
use jni::JNIEnv;
use jni_fn::jni_fn;
use serde_json::to_string;
use swc::config::Options;
use swc_common::FileName;
use swc_ecma_ast::Program;

use crate::util::{deserialize_json, get_deserialized, process_output, try_with, MapErr};

use crate::get_compiler;

#[jni_fn("dev.yidafu.swc.SwcNative")]
pub fn transformSync(
    mut env: JNIEnv,
    _: JClass,
    code: JString,
    is_module: jboolean,
    options: JString,
) -> jstring {
    let s: String = env
        .get_string(&code)
        .expect("Couldn't get java string!")
        .into();
    let opts: String = env
        .get_string(&options)
        .expect("Couldn't get java string!")
        .into();
    let c = get_compiler();

    let mut options: Options = get_deserialized(&opts).unwrap();

    if !options.filename.is_empty() {
        options.config.adjust(Path::new(&options.filename));
    }

    let error_format = options.experimental.error_format.unwrap_or_default();
    let is_module = is_module == 1;
    let result = try_with(
        c.cm.clone(),
        !options.config.error.filename.into_bool(),
        error_format,
        |handler| {
            c.run(|| {
                if is_module {
                    let program: Program =
                        deserialize_json(s.as_str()).context("failed to deserialize Program")?;
                    c.process_js(handler, program, &options)
                } else {
                    let fm = c.cm.new_source_file(
                        if options.filename.is_empty() {
                            FileName::Anon
                        } else {
                            FileName::Real(options.filename.clone().into())
                        },
                        s,
                    );
                    c.process_js_file(fm, handler, &options)
                }
            })
        },
    )
    .convert_err();

    process_output(env, result)
}

#[jni_fn("dev.yidafu.swc.SwcNative")]
pub fn transformFileSync(
    mut env: JNIEnv,
    _: JClass,
    filepath: JString,
    is_module: jboolean,
    options: JString,
) -> jstring {
    let s: String = env
        .get_string(&filepath)
        .expect("Couldn't get java string!")
        .into();
    let opts: String = env
        .get_string(&options)
        .expect("Couldn't get java string!")
        .into();
    let c = get_compiler();

    let mut options: Options = get_deserialized(&opts).unwrap();

    if !options.filename.is_empty() {
        options.config.adjust(Path::new(&options.filename));
    }

    let error_format = options.experimental.error_format.unwrap_or_default();
    let is_module = is_module == 1;

    let result = try_with(
        c.cm.clone(),
        !options.config.error.filename.into_bool(),
        error_format,
        |handler| {
            c.run(|| {
                if is_module {
                    let program: Program =
                        deserialize_json(s.as_str()).context("failed to deserialize Program")?;
                    c.process_js(handler, program, &options)
                } else {
                    let fm = c.cm.load_file(Path::new(&s)).expect("failed to load file");
                    c.process_js_file(fm, handler, &options)
                }
            })
        },
    )
    .convert_err();

    process_output(env, result)
}
