package com.example.demo3;

import javax.crypto.Cipher;
import java.util.HashMap;

/**
 * <h3>PackJar</h3>
 * <p></p>
 *
 * @author : 12705
 * @date : 2021-01-06 19:50
 **/
public class ShapeFactory {
    private static final HashMap<String, Shape> circleMap = new HashMap<>();

    public static Shape getCircle(String color) {
        Circle circle = (Circle) circleMap.get(color);
        if (circle == null) {
            circle = new Circle(color);
            circleMap.put(color, circle);
            System.out.println("Creating circle of color : " + color);
        }

        return circle;
    }
}
