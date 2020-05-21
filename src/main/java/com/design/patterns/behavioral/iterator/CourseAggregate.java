package com.design.patterns.behavioral.iterator;

/**
 * @author tangxiangwei
 * @date 20/2/26
 */
public interface CourseAggregate {

    void addCourse(Course course);

    void removeCourse(Course course);

    CourseIterator getCourseIterator();

}
