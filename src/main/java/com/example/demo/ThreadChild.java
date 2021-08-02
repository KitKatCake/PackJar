package com.example.demo;

/**
 * <h3>PackJar</h3>
 * <p></p>
 *
 * @author : 12705
 * @date : 2021-01-03 12:46
 **/
public class ThreadChild extends Thread {
    @Override
    public void run() {
        System.out.println("In clean up code");
        System.out.println("In shutdown hook");
    }

    public static void main(String[] args) {
        Runtime current = Runtime.getRuntime();
        current.addShutdownHook(new ThreadChild());
        for (int i = 0; i < 10; i++) {
            System.out.println("2 X " + i + " = " + 2 * i);
        }
    }
}
