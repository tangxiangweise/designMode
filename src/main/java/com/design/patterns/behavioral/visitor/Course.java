package com.design.patterns.behavioral.visitor;

/**
 * @author tangxiangwei
 * @date 20/3/6
 */
public abstract class Course {

    private String name;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public  abstract void  accept(IVisitor visitor);
}
