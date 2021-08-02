package com.example.demo;

/**
 * <h3>PackJar</h3>
 * <p></p>
 *
 * @author : 12705
 * @date : 2021-01-03 12:43
 **/
public class ShutDownHook {
    public static void main(String[] args) {
        Runtime.getRuntime().addShutdownHook(new Thread(
                () -> {
                    System.out.println("Shutdown Hook is running !");
                }
        ));
        System.out.println("Application Terminating ...");
    }

}
