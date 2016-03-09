package com.test;

import java.lang.annotation.Annotation;
import java.lang.reflect.Method;

/**
 * Created by lh on 2016/3/9.
 */
public class App {
    public static void main(String[] args) throws Exception{
        MyTest myAnnotationTest = new MyTest();
        Class<MyTest> C = MyTest.class;
        // 获得output方法对应的Method对象
        Method method = C.getMethod("output",new Class[]{});

        // 判断此方法上面是不是被MyAnnotation注解所修饰
        if(method.isAnnotationPresent(MyAnnotation.class)){
            // 调用output方法
            method.invoke(myAnnotationTest,new Object[]{});

            // 获得output方法(method就表示output方法)上面修饰它的MyAnnotation注解

            MyAnnotation myAnnotation = method.getAnnotation(MyAnnotation.class);


            // 获得myAnnotation注解里面的hellow和world属性值
            String hello = myAnnotation.hello();
            String world = myAnnotation.world();

            System.out.println(hello + "," + world);
        }


        // 获得所有修饰output方法的注解组成的数组
        Annotation[] annotations = method.getAnnotations();

        // 遍历该数组(这里能访问并打印出来的肯定都是@Retention(value=SOURCE)类型的注解，
        // 因为其他类型的注解通过反射是访问不到的，因此这里只会打印出MyAnnotation和Deprecated两个注解，而SuppressWarnings却不会被打印出来)
        for (Annotation annotation : annotations) {
            // annotation.annotationType()是获得注解类型
            System.out.println(annotation.annotationType().getName());
        }
    }
}
