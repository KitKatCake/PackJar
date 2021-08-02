package com.example.demo;

import java.lang.reflect.Constructor;
import java.lang.reflect.Field;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.util.Map;

/**
 * <h3>PackJar</h3>
 * <p></p>
 *
 * @author : 12705
 * @date : 2021-01-03 12:53
 **/
public class Test {
    public static void main(String[] args) throws ClassNotFoundException, NoSuchMethodException, InvocationTargetException, IllegalAccessException, NoSuchFieldException {
       // Class clz = Class.forName("com.example.demo.Student");

//        Student student = new Student();
//
//        Class clz = student.getClass();
//
//        System.out.println(clz.getName());
//
//        Method[] methods = clz.getDeclaredMethods();
//
//        for (Method m : methods) {
//            System.out.println(m.getName());
//        }
//
//        Field[] fields = clz.getDeclaredFields();
//
//        for (Field f : fields) {
//            System.out.println(f.getName());
//        }
//
//
//        Constructor constructor = clz.getDeclaredConstructor();
//
//        System.out.println(constructor.getName());


        Test obj = new Test();

        Class clzz = obj.getClass();

        System.out.println("The name of class is " +
                clzz.getName());

        Constructor constructor1 = clzz.getConstructor();

        System.out.println("The name of constructor is " +
                constructor1.getName());

        System.out.println("The public methods of class are : ");

        Method[] methods = clzz.getMethods();

        for (Method m:methods){
            System.out.println(m.getName());
        }

        Method method = clzz.getDeclaredMethod("method2", int.class);

        method.invoke(obj,19);

        Field field = clzz.getDeclaredField("s");

        field.setAccessible(true);

        field.set(obj,"JAVA");

        Method method1 = clzz.getDeclaredMethod("method1");

        method1.invoke(obj);

        Method method2 = clzz.getDeclaredMethod("method3");

        method2.setAccessible(true);

        method2.invoke(obj);







    }

    private String s;
    public Test()  {  s = "GeeksforGeeks"; }

    public void method1()  {
        System.out.println("The string is " + s);
    }

    private void method3() {
        System.out.println("Private method invoked");
    }

    public void method2(int n)  {
        System.out.println("The number is " + n);
    }


}
