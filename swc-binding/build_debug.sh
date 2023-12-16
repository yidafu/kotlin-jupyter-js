#!/bin/bash
cargo build  --target x86_64-apple-darwin
rm -fr ./src/main/resources/darwin-x64
mkdir ./src/main/resources/darwin-x64
cp ./target/x86_64-apple-darwin/debug/libswc_jni.dylib ./src/main/resources/darwin-x64