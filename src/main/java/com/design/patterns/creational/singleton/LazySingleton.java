package com.design.patterns.creational.singleton;

import java.lang.reflect.Constructor;
import java.lang.reflect.Field;

/**
 * @author tangxiangwei
 * @date 20/2/7
 */
public class LazySingleton {

    private static LazySingleton lazySingleton = null;

    private LazySingleton() {
        if (lazySingleton != null)
            throw new RuntimeException("单例构造器禁止反射调用");
    }

    public synchronized static LazySingleton getInstance() {
        if (lazySingleton == null) {
            lazySingleton = new LazySingleton();
        }
        return lazySingleton;
    }

    public static void main(String[] args) throws Exception {
        Class<?> clazz = LazySingleton.class;
        Constructor<?> constructor = clazz.getDeclaredConstructor();
        constructor.setAccessible(true);

        LazySingleton instance = LazySingleton.getInstance();

        Field flag = instance.getClass().getDeclaredField("flag");
        flag.setAccessible(true);
        flag.set(instance, true);
        LazySingleton newInstance = (LazySingleton) constructor.newInstance();


        System.out.println(instance);
        System.out.println(newInstance);
        System.out.println(newInstance == instance);

    }
}
