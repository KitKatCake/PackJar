package com.example.demo2;

import java.lang.reflect.InvocationTargetException;

/**
 * <h3>PackJar</h3>
 * <p></p>
 *
 * @author : 12705
 * @date : 2021-01-03 14:04
 **/
public class Demo {
    public static void fun(String c) throws ClassNotFoundException, NoSuchMethodException, IllegalAccessException, InvocationTargetException, InstantiationException {
        Object obj = Class.forName(c).getDeclaredConstructor().newInstance();
        System.out.println("Object created for class:"
                + obj.getClass().getName());
    }

    public static void main(String[] args) throws ClassNotFoundException, NoSuchMethodException, InvocationTargetException, InstantiationException, IllegalAccessException {
        fun("com.example.demo2.A");

        System.out.println(String.class.getClassLoader());

        System.out.println(Demo.class.getClassLoader());

        Class clz = Class.forName("com.example.demo2.Demo");

        ClassLoader loader = clz.getClassLoader();

//        Class clzz = Class.forName("java.lang.String", true, loader);
        Class clzz = Class.forName("java.lang.String", false, loader);

        System.out.print("Class represented by c1: "
                + clzz.toString());
    }
}
