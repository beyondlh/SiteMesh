package com.test;

import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;

/**
 * Created by lh on 2016/3/9.
 */
@Retention(RetentionPolicy.RUNTIME)
public @interface MyAnnotation {
    String hello() default "hello";

    String world() default "world";
}
