package com.design.patterns.creational.singleton;

import java.io.*;
import java.lang.reflect.Constructor;

/**
 * @author tangxiangwei
 * @date 20/2/7
 */
public class Test {


    public static void main(String[] args) throws Exception {
//        LazySingleton lazySingleton = LazySingleton.getInstance();
//        Thread thread1 = new Thread(new Task());
//        Thread thread2 = new Thread(new Task());
//        thread1.start();
//        thread2.start();
//        System.out.println("program end");
//        HungrySingleton instance = HungrySingleton.getInstance();
//        ObjectOutputStream oos = new ObjectOutputStream(new FileOutputStream("singleton_file"));
//        oos.writeObject(instance);
//
        File file = new File("singleton_file");
        ObjectInputStream ois = new ObjectInputStream(new FileInputStream(file));
//        /**
//         * 原理入口 readObject
//         */
//        HungrySingleton newInstance = (HungrySingleton) ois.readObject();
//
//        System.out.println(instance == newInstance);

        Class<?> clazz = HungrySingleton.class;
        Constructor<?> constructor = clazz.getDeclaredConstructor();
        constructor.setAccessible(true);
        Object newInstance = constructor.newInstance();

        HungrySingleton instance = HungrySingleton.getInstance();

        System.out.println(instance == newInstance);
    }
}
