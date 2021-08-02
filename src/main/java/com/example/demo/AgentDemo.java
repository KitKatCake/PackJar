package com.example.demo;

import java.lang.instrument.Instrumentation;

/**
 * <h3>PackJar</h3>
 * <p></p>
 *
 * @author : 12705
 * @date : 2021-01-02 22:10
 **/
public class AgentDemo {
    public static void premain(String agentArgs, Instrumentation inst) {
        System.out.println("------ premain方法 有两个入参 ------ agentArgs:" + agentArgs + " inst:" + inst.toString());
    }

    public static void premain(String agentArgs) {
        System.out.println("------ premain方法，有一个入参 ------ agentArgs:" + agentArgs);
    }

}
