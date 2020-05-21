package com.design.patterns.creational.singleton;

/**
 * 静态内部类
 *
 * @author tangxiangwei
 * @date 20/2/7
 */
public class StaticInnerClassSingleton {

    private StaticInnerClassSingleton() {
        if (InnerClass.instance != null)
            throw new RuntimeException("单例构造器禁止反射调用");
    }

    /**
     * InnerClass 类对象初始化锁
     */
    private static class InnerClass {
        private static StaticInnerClassSingleton instance = new StaticInnerClassSingleton();
    }

    public static StaticInnerClassSingleton getInstance() {
        return InnerClass.instance;
    }
}
