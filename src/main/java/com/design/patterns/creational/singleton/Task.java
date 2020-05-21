package com.design.patterns.creational.singleton;

/**
 * @author tangxiangwei
 * @date 20/2/7
 */
public class Task implements Runnable {

    public void run() {
        LazySingleton lazySingleton = LazySingleton.getInstance();
        System.out.println(Thread.currentThread().getName() + " " + lazySingleton);
    }
}
