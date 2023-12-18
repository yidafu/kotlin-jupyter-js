#!/bin/bash
rm -fr ./src/main/resources/*

mkdir -p ./src/main/resources/darwin-x64
mkdir -p ./src/main/resources/darwin-arm64
# mkdir -p ./src/main/resources/darwin-universal
# mkdir -p ./src/main/resources/linux-x64-musl
mkdir -p ./src/main/resources/linux-x64-gnu
mkdir -p ./src/main/resources/linux-arm-gnueabihf
mkdir -p ./src/main/resources/win32-x64-msvc

# https://gist.github.com/surpher/bbf88e191e9d1f01ab2e2bbb85f9b528
cargo build --release --target x86_64-apple-darwin
cp ./target/x86_64-apple-darwin/release/libswc_jni.dylib  ./src/main/resources/darwin-x64
cargo build --release --target aarch64-apple-darwin
cp ./target/aarch64-apple-darwin/release/libswc_jni.dylib  ./src/main/resources/darwin-arm64
cargo zigbuild --release --target universal2-apple-darwin
# cp ./target/universal2-apple-darwin/release/libswc_jni.dylib  ./src/main/resources/darwin-universal

# Alternative zigbuild
TARGET_CC=x86_64-linux-musl-gcc cargo build --release --target x86_64-unknown-linux-musl
# cp target/x86_64-unknown-linux-musl/release/libswc_jni.so ./src/main/resources/linux-x64-musl

cargo zigbuild --release --target arm-unknown-linux-gnueabihf
cp target/arm-unknown-linux-gnueabihf/release/libswc_jni.so ./src/main/resources/linux-arm-gnueabihf

cargo build --release --target x86_64-unknown-linux-gnu
cp target/x86_64-unknown-linux-gnu/release/libswc_jni.so ./src/main/resources/linux-x64-gnu

cargo build --release --target x86_64-pc-windows-gnu
cargo xwin build --release --target x86_64-pc-windows-msvc
cp target/x86_64-pc-windows-msvc/release/swc_jni.dll ./src/main/resources/win32-x64-msvc
