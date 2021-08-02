package com.example.demo2;

import java.lang.annotation.Annotation;
import java.lang.reflect.Method;

/**
 * <h3>PackJar</h3>
 * <p></p>
 *
 * @author : 12705
 * @date : 2021-01-03 16:24
 **/
public class Main {
    public static void main(String[] args) throws NoSuchMethodException {
        @TypeAnnoDemo String str = "I am annotated with a type annotation";
        System.out.println(str);
        abc();
        newMethod();

    }

    @Words(word = "First" ,value = 1)
    @Words(word = "Second" ,value = 2)
    public static void newMethod() throws NoSuchMethodException {
        Main obj = new Main();
        Class<?> clz = obj.getClass();

        Method m = clz.getMethod("newMethod");

        Annotation anno = m.getAnnotation(MyRepeatedAnnos.class);

        System.out.println(anno);
    }

    public static @TypeAnnoDemo int abc() {
        System.out.println("This function's  return type is annotated");
        return 0;
    }
}
