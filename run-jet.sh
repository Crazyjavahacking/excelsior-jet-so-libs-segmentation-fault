#!/bin/bash -e

cp build/jet-commons-io/commons-io-2.6.so     build/jet-mainapp
cp build/jet-commons-lang/commons-lang-3.7.so build/jet-mainapp

cp build/jet-apollo-api/apollo-api.so   build/jet-mainapp
cp build/jet-apollo-impl/apollo-impl.so build/jet-mainapp

./build/jet-mainapp/mainapp
