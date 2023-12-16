use jni::objects::{JClass, JString};
use jni::sys::jstring;
use jni::JNIEnv;
use jni_fn::jni_fn;
use serde_json::to_string;
use swc::config::{Options, SourceMapsConfig};
use swc_common::GLOBALS;
use swc_ecma_ast::Program;
use swc_ecma_codegen::Config;

use crate::util::{deserialize_json, get_deserialized, process_output, MapErr};

use crate::get_compiler;

#[jni_fn("dev.yidafu.swc.SwcNative")]
pub fn printSync(mut env: JNIEnv, _: JClass, program: JString, options: JString) -> jstring {
    let program: String = env
        .get_string(&program)
        .expect("Couldn't get java string!")
        .into();
    let opts: String = env
        .get_string(&options)
        .expect("Couldn't get java string!")
        .into();
    // crate::util::init_default_trace_subscriber();

    let c = get_compiler();

    let program: Program = deserialize_json(program.as_str()).unwrap();

    let options: Options = get_deserialized(&opts).unwrap();

    // Defaults to es3
    let codegen_target = options.codegen_target().unwrap_or_default();

    let result = GLOBALS.set(&Default::default(), || {
        c.print(
            &program,
            None,
            options.output_path,
            true,
            options
                .source_maps
                .clone()
                .unwrap_or(SourceMapsConfig::Bool(false)),
            &Default::default(),
            None,
            None,
            options.config.emit_source_map_columns.into_bool(),
            Default::default(),
            Config::default()
                .with_target(codegen_target)
                .with_minify(options.config.minify.into_bool()),
        )
        .convert_err()
    });
    process_output(env, result)
}
