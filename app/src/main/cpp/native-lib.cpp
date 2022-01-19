//
// Created by Alex on 2022/1/16.
//

#include <jni.h>
#include <string>

extern "C" JNIEXPORT jstring JNICALL
Java_com_alex_app_jni_JNIDemoActivity_stringFromJNI(JNIEnv *env, jobject thiz) {
    std::string hello = "hello JNI from C++! ";
    return env->NewStringUTF(hello.c_str());
}