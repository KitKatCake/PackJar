package com.example.demo2;

import sun.misc.Unsafe;

import java.io.*;
import java.lang.reflect.Field;
import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.ConcurrentMap;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.atomic.AtomicInteger;
import java.util.concurrent.atomic.LongAccumulator;
import java.util.concurrent.atomic.LongAdder;
import java.util.function.LongBinaryOperator;
import java.util.stream.IntStream;

/**
 * <h3>PackJar</h3>
 * <p></p>
 *
 * @author : 12705
 * @date : 2021-01-03 21:28
 **/
public class Test implements Serializable {
    int i = 10, j = 20;
    transient int k = 30;
    transient static int l = 40;
    transient final int m = 50;

    public static void main(String[] args) throws IOException, ClassNotFoundException, NoSuchFieldException, IllegalAccessException, InstantiationException, InterruptedException {
        Test input = new Test();
        FileOutputStream fileOutputStream = new FileOutputStream("abc.txt");
        ObjectOutputStream outputStream = new ObjectOutputStream(fileOutputStream);
        outputStream.writeObject(input);

        FileInputStream fileInputStream = new FileInputStream("abc.txt");
        ObjectInputStream objectInputStream = new ObjectInputStream(fileInputStream);

        Test test = (Test) objectInputStream.readObject();
        System.out.println("i = " + test.i);
        System.out.println("j = " + test.j);
        System.out.println("k = " + test.k);
        System.out.println("l = " + test.l);
        System.out.println("m = " + test.m);

        Field f = Unsafe.class.getDeclaredField("theUnsafe");

        f.setAccessible(true);

        Unsafe unsafe = (Unsafe) f.get(null);

        SecretHolder secretHolder = new SecretHolder();
        Field field = secretHolder.getClass().getDeclaredField("SECRET_VALUE");
        unsafe.putInt(secretHolder, unsafe.objectFieldOffset(field), 1);


        System.out.println(secretHolder.secretIsDisclosed());

        InitializationOrdering o = (InitializationOrdering) unsafe.allocateInstance(InitializationOrdering.class);

        System.out.println(o.getA());

        // AtomicInteger atomicInteger = new AtomicInteger(0);

        LongAdder longAdder = new LongAdder();

        ExecutorService executorService = Executors.newFixedThreadPool(2);

        // IntStream.range(0,1000).forEach(i->executorService.submit(atomicInteger::incrementAndGet));

//        IntStream.range(0, 1000)
//                .forEach(i -> {
//                    Runnable task = () ->
//                            atomicInteger.updateAndGet(n -> n + 2);
//                    executorService.submit(task);
//                });

//        IntStream.range(0, 1000)
//                .forEach(i -> {
//                    Runnable task = () ->
//                            atomicInteger.accumulateAndGet(i, (n, m) -> n + m);
//                    executorService.submit(task);
//                });

        IntStream.range(0, 1000).forEach(i -> executorService.submit(longAdder::increment));


//        System.out.println(atomicInteger.get());
//        System.out.println(longAdder.sumThenReset());

        LongBinaryOperator operator = (x, y) -> 2 * x + y;

        LongAccumulator accumulator = new LongAccumulator(operator, 0L);

        IntStream.range(0, 10).forEach(i -> executorService.submit(() -> accumulator.accumulate(i)));


        Thread.sleep(3000);
        executorService.shutdown();

        System.out.println(accumulator.getThenReset());

        System.out.println(longAdder.sum());




    }
}
