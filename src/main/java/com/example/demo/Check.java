package com.example.demo;

/**
 * <h3>PackJar</h3>
 * <p></p>
 *
 * @author : 12705
 * @date : 2021-01-03 13:16
 **/
public class Check {
    private void private_method(){
        System.out.println("Private Method "
                + "called from outside");
    }

    public void printData()
    {
        System.out.println("Public Method");
    }

    private void Demo_private_Method()
    {
        System.out.println("Private Method "
                + "called from outside");
    }
}
