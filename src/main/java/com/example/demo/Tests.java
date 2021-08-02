package com.example.demo;

import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;

/**
 * <h3>PackJar</h3>
 * <p></p>
 *
 * @author : 12705
 * @date : 2021-01-03 13:17
 **/
public class Tests {
//    public static void main(String[] args) throws NoSuchMethodException, InvocationTargetException, IllegalAccessException {
//        Check check = new Check();
////        Class clz = check.getClass();
//
////        Method m = clz.getDeclaredMethod("private_method");
////
////        m.setAccessible(true);
////
////        m.invoke(check);
//
//        Method m;
//
//        Method[] methods = Check.class.getDeclaredMethods();
//
//        for (int i = 0; i < methods.length; i++) {
//            String meth = new String(methods[i].toString());
//            if (meth.startsWith("private")) {
//                String s = methods[i].toString();
//                int a = s.indexOf(".");
//
//                int b = s.indexOf("(");
//
//                String method_name = s.substring(a + 1, b);
//
//                System.out.println("Method Name = "
//                        + method_name);
//
//                m = Check.class.getDeclaredMethod(method_name);
//
//                m.setAccessible(true);
//
//                m.invoke(check);
//
//            }
//        }

    public static void main(String[] args) throws NoSuchMethodException {
        Check c = new Check();
        Method m;

        // Using getDeclareMethod() method
        Method[] method
                = Check.class.getDeclaredMethods();

        for (int i = 0; i < method.length; i++) {
            String meth
                    = new String(method[i].toString());
            if (meth.startsWith("private")) {

                String s = method[i].toString();

                int a = s.indexOf(".");
                int b = s.indexOf("(");

                // Method name retrieved
                String method_name = s.substring(a + 1, b);

                // Print method name
                System.out.println("Method Name = "
                        + method_name);

                // Using getDeclareMethod() method
                m = Check.class.getDeclaredMethod(method_name);

                // Using setAccessible() method
                m.setAccessible(true);

                // Using invoke() method
                try {
                    m.invoke(c);
                } catch (IllegalAccessException e) {
                    e.printStackTrace();
                } catch (InvocationTargetException e) {
                    e.printStackTrace();
                }
            }
        }
    }
}
