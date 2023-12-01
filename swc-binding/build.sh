#!/bin/bash

# https://gist.github.com/surpher/bbf88e191e9d1f01ab2e2bbb85f9b528
cargo build --release --target x86_64-apple-darwin
cargo build --release --target aarch64-apple-darwin

# Alternative zigbuild
TARGET_CC=x86_64-linux-musl-gcc cargo build --release --target x86_64-unknown-linux-musl
cargo build --release --target x86_64-unknown-linux-gnu

cargo build --release --target x86_64-pc-windows-gnu
cargo xwin build --release --target x86_64-pc-windows-msvc
