package com.design.patterns.behavioral.visitor;

/**
 * @author tangxiangwei
 * @date 20/3/6
 */
public class FreeCourse extends Course {

    @Override
    public void accept(IVisitor visitor) {
        visitor.visit(this);
    }
}
