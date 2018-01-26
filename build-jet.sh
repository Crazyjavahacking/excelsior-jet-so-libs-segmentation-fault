#!/bin/bash -e
export JET_14_HOME="/home/martin/Downloads/jet14.0-pro-x86"

export PATH="$PATH:$JET_14_HOME/bin"

rm -rf build/jet-mainapp

jc =p =a commons-lang.prj
jc =p =a commons-io.prj

jc =p =a apollo-api.prj
jc =p =a apollo-impl.prj


jc =p =a mainapp.prj

#xpack -backend self-contained-directory -source build/jet-mainapp -target build/xpack
