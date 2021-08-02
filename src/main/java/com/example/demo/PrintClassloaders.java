package com.example.demo;

import java.util.ArrayList;
import java.util.List;
import java.util.logging.Logger;

/**
 * <h3>PackJar</h3>
 * <p></p>
 *
 * @author : 12705
 * @date : 2021-01-02 22:34
 **/
public class PrintClassloaders {
    public static void main(String[] args) throws ClassNotFoundException {
        List<Integer> list = new ArrayList<>();
        list.add(1);
        printClassLoaders();
    }

//    public static void printClassLoaders() {
//        System.out.println("Classloader of this class:" + PrintClassloaders.class.getClassLoader());
//        System.out.println("Classloader of this class:" + Logger.class.getClassLoader());
//        System.out.println("Classloader of this class:" + ArrayList.class.getClassLoader());
//    }

    public static void printClassLoaders() throws ClassNotFoundException {

        System.out.println("Classloader of this class:"
                + PrintClassloaders.class.getClassLoader());

        System.out.println("Classloader of Logging:"
                + Logger.class.getClassLoader());

        System.out.println("Classloader of ArrayList:"
                + ArrayList.class.getClassLoader());
    }
}
