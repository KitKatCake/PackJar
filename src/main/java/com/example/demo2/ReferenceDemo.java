package com.example.demo2;

import java.lang.ref.Reference;
import java.lang.ref.ReferenceQueue;
import java.lang.ref.SoftReference;
import java.lang.ref.WeakReference;

/**
 * <h3>PackJar</h3>
 * <p></p>
 *
 * @author : 12705
 * @date : 2021-01-03 15:45
 **/
public class ReferenceDemo {
    public static void main(String[] args) {
//        ReferenceQueue<String> referenceQueue = new ReferenceQueue<>();
//
        String str = new String("abc");
//        SoftReference<String> softReference = new SoftReference<>(str, referenceQueue);
//
//
//        str = null;
//
//        System.gc();
//
//        System.out.println(softReference.get());
//
//
//        Reference<? extends String> reference = referenceQueue.poll();
//
//        System.out.println(reference);

        WeakReference<String> weakReference = new WeakReference<>(str);

//        str = null;
//
//        System.gc();

        String strongReference = weakReference.get();

//        System.out.println(weakReference.get());


    }
}
