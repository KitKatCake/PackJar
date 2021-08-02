package com.example.demo3;

import com.example.demo.ThreadChild;

/**
 * <h3>PackJar</h3>
 * <p></p>
 *
 * @author : 12705
 * @date : 2021-01-21 16:00
 **/
public class A {
    Thread t = null;

    public static void main(String[] args) throws InterruptedException {
        new Thread("Thread -1") {
            @Override
            public void run() {
                System.out.println(Thread.currentThread().getName());
            }
        }.start();


//        Thread thread = new Thread(new Runnable() {
//            @Override
//            public void run() {
//                System.out.println(Thread.currentThread().getName());
//            }
//        });
//        thread.start();
//        thread.join();
//
//


        A a = new A();

        if (Thread.currentThread().getName().equals("Thread -1")) {
            a.t.join();
        }

        Thread.sleep(500);

        System.out.println(Thread.currentThread().getName());


    }

    public A() {
        t = new Thread();
    }
}
