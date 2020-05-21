package com.design.patterns.behavioral.visitor;

/**
 * @author tangxiangwei
 * @date 20/3/6
 */
public interface IVisitor {

    void visit(FreeCourse course);

    void visit(CodingCourse course);

}
