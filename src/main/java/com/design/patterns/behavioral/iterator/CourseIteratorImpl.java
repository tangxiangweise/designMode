package com.design.patterns.behavioral.iterator;

import java.util.List;

/**
 * @author tangxiangwei
 * @date 20/2/26
 */
public class CourseIteratorImpl implements CourseIterator {

    private List<Course> courses;

    int position;
    Course course;

    public CourseIteratorImpl(List<Course> courses) {
        this.courses = courses;
    }

    @Override
    public Course nextCourse() {
        System.out.println("返回课程，位置是: " + position);
        Course course = courses.get(position);
        position++;
        return course;
    }

    @Override
    public boolean isLastCourse() {
        if (position < courses.size()) {
            return false;
        }
        return true;
    }
}
