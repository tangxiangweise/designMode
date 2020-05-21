package com.design.patterns.creational.singleton;

/**
 * @author tangxiangwei
 * @date 20/2/9
 */
public enum EnumInstance {
    INSTANCE;

    private Object data;

    public Object getData() {
        return data;
    }

    public void setData(Object data) {
        this.data = data;
    }

    public static EnumInstance getInstance() {
        return INSTANCE;
    }
}
