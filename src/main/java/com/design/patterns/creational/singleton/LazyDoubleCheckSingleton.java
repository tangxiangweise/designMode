package com.design.patterns.creational.singleton;

/**
 * 双重检查懒汉单例模式
 *
 * @author tangxiangwei
 * @date 20/2/7
 */
public class LazyDoubleCheckSingleton {

    private volatile static LazyDoubleCheckSingleton lazySingleton = null;

    private LazyDoubleCheckSingleton() {
    }

    public static LazyDoubleCheckSingleton getInstance() {
        if (lazySingleton == null) {
            synchronized (LazyDoubleCheckSingleton.class) {
                if (lazySingleton == null) {
                    /**
                     * 指令重排序 2 3 顺序颠倒
                     * 1. 分配内存给这个对象
                     * 2. 初始化对象
                     * 3. 设置lazySingleton 指向刚分配的内存地址
                     */
                    lazySingleton = new LazyDoubleCheckSingleton();
                }
            }
        }
        return lazySingleton;
    }
}
