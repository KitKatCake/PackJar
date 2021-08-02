package com.example.demo;

import java.lang.instrument.Instrumentation;
import java.util.logging.Logger;

/**
 * <h3>PackJar</h3>
 * <p></p>
 *
 * @author : 12705
 * @date : 2021-01-02 21:29
 **/
public class Hello {
//    public static void premain(String agentArgs, Instrumentation inst){
//        Logger.info("[Agent] In premain method");
//        String className = "com.baeldung.instrumentation.application.MyAtm";
//        transformClass(className,inst);
//    }
    public static void main(String[] args) {
        System.out.println("com.example.demo.Hello World!");

        System.out.println(1+2);

    }



//    public static void agentmain(
//            String agentArgs, Instrumentation inst) {
//
//        LOGGER.info("[Agent] In agentmain method");
//        String className = "com.baeldung.instrumentation.application.MyAtm";
//        transformClass(className,inst);
//    }

}
