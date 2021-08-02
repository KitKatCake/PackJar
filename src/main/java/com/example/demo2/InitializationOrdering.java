package com.example.demo2;

/**
 * <h3>PackJar</h3>
 * <p></p>
 *
 * @author : 12705
 * @date : 2021-01-03 21:53
 **/
public class InitializationOrdering {
    private long a;

    public InitializationOrdering(long a) {
        this.a = 1;
    }

    public long getA() {
        return this.a;
    }
}
