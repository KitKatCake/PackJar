package com.example.demo2;

import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.ConcurrentMap;

/**
 * <h3>PackJar</h3>
 * <p></p>
 *
 * @author : 12705
 * @date : 2021-01-03 22:21
 **/
public class Test2 {
    public static void main(String[] args) {
        ConcurrentMap<String, String> map = new ConcurrentHashMap<>();

        map.put("foo", "bar");
        map.put("han", "solo");
        map.put("r2", "d2");
        map.put("c3", "p0");

        map.forEach((k, v) -> System.out.printf("%s = %s\n", k, v));

        String value = map.putIfAbsent("c3", "p1");

        System.out.println(value);

        System.out.println(map.get("c3"));

        String values = map.getOrDefault("hi", "there");

        System.out.println(values);

        map.replaceAll((k, v) -> "r2".equals(k) ? "d3" : v);

        System.out.println(map.get("r2"));


    }
}
