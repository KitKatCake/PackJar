package com.example.demo2;

/**
 * <h3>PackJar</h3>
 * <p></p>
 *
 * @author : 12705
 * @date : 2021-01-03 21:47
 **/
public class SecretHolder {
    private int SECRET_VALUE = 0;

    public boolean secretIsDisclosed() {
        return SECRET_VALUE == 1;
    }
}
