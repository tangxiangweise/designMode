package com.design.patterns.creational.builde;

/**
 * @author tangxiangwei
 * @date 20/2/7
 */
public class Test {

    public static void main(String[] args) {
        Course course = new Course.CourseBuilder().buildCourseName("测试1").buildCourseVideo("测试2").build();
        System.out.println(course);
    }
}
