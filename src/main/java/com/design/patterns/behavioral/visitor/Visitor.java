package com.design.patterns.behavioral.visitor;

/**
 * @author tangxiangwei
 * @date 20/3/6
 */
public class Visitor implements IVisitor {

    @Override
    public void visit(FreeCourse course) {
        System.out.println("课程名称：" + course.getName());
    }

    @Override
    public void visit(CodingCourse course) {
        System.out.println("实战课程名称：" + course.getName() + "价格：" + course.getPrice());
    }

}
