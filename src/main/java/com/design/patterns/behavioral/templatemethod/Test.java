package com.design.patterns.behavioral.templatemethod;

/**
 * @author tangxiangwei
 * @date 20/2/26
 */
public class Test {

    public static void main(String[] args) {
        System.out.println("后端设计模式课程start......");
        ACourse designCount = new DesignPatternsCourse();
        designCount.makeCourse();
        System.out.println("后端设计模式课程end......");

        System.out.println("前端课程start......");
        ACourse feCourse = new FECourse();
        feCourse.makeCourse();
        System.out.println("前端课程end......");
    }
}
