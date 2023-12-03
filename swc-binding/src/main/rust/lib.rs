mod util;
mod parse;
mod minify;
mod  transform;
mod print;

use std::sync::Arc;

use swc::{Compiler};
use swc_common::{sync::Lazy, FilePathMapping, SourceMap};

static COMPILER: Lazy<Arc<Compiler>> = Lazy::new(|| {
    let cm = Arc::new(SourceMap::new(FilePathMapping::empty()));

    Arc::new(Compiler::new(cm))
});

fn get_compiler() -> Arc<Compiler> {
    COMPILER.clone()
}
