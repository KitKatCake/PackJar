package com.example.demo;

/**
 * <h3>PackJar</h3>
 * <p></p>
 *
 * @author : 12705
 * @date : 2021-01-03 13:37
 **/
public class MainTest {

    static int count = 0;

    static void mainCaller() {
        System.out.println("mainCaller!");
        count++;
        if (count < 3) {
            Gtest.main(null);
        }
    }

}
