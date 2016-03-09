package com.test;

@MyAnnotation(hello = "beijing", world = "shanghai")
public class MyTest {
    @MyAnnotation(hello = "tianjing", world = "xian")
    @Deprecated
    @SuppressWarnings("unchecked")
    public void output() {
        System.out.println("output something!");
    }
}

