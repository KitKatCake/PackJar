package com.example.demo;

import java.lang.reflect.Array;
import java.util.Arrays;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;

/**
 * <h3>PackJar</h3>
 * <p></p>
 *
 * @author : 12705
 * @date : 2021-01-03 13:41
 **/
public class Gtest {
    public static void main(String[] args) {
//        System.out.println("main");
//        MainTest.mainCaller();

        Map<String, String> map = new HashMap<>();

        map.put("GFG", "geeksforgeeks.org");
        map.put("Practice", "practice.geeksforgeeks.org");
        map.put("Code", "code.geeksforgeeks.org");
        map.put("Quiz", "quiz.geeksforgeeks.org");

        for (Map.Entry<String, String> entry : map.entrySet()) {
            System.out.println("Key = " + entry.getKey() +
                    ", Value = " + entry.getValue());
        }

        for (String key : map.keySet()) {
            System.out.println("key: " + key);
        }

        for (String value : map.values()) {
            System.out.println("values: " + value);
        }

        Iterator<Map.Entry<String, String>> itr = map.entrySet().iterator();
        while (itr.hasNext()) {
            Map.Entry<String, String> entry = itr.next();
            System.out.println("Key = " + entry.getKey() + ", Value = " + entry.getValue());
        }

        map.forEach((k, v) -> System.out.println("key = " + k + " , value = " + v));

        int[] intArray = new int[10];

        Array.setInt(intArray, 0, 10);

        System.out.println(Arrays.toString(intArray));

        int sizeOfArray = 3;
        int[] intArrays = (int[]) Array.newInstance(int.class, sizeOfArray);

        Array.setInt(intArrays, 0, 10);
        Array.setInt(intArrays, 1, 20);
        Array.setInt(intArrays, 2, 30);

        System.out.println(Arrays.toString(intArrays));

        System.out.println("Element at index 0: "
                + Array.getInt(intArrays, 0));
        System.out.println("Element at index 1: "
                + Array.getInt(intArrays, 1));
        System.out.println("Element at index 2: "
                + Array.getInt(intArrays, 2));
    }
}
