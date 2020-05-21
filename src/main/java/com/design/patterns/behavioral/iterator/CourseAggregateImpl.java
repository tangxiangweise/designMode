package com.design.patterns.behavioral.iterator;

import java.util.ArrayList;
import java.util.List;

/**
 * @author tangxiangwei
 * @date 20/2/26
 */
public class CourseAggregateImpl implements CourseAggregate {

    private List<Course> courses = new ArrayList<>();

    @Override
    public void addCourse(Course course) {
        courses.add(course);
    }

    @Override
    public void removeCourse(Course course) {
        courses.remove(course);
    }

    @Override
    public CourseIterator getCourseIterator() {
        return new CourseIteratorImpl(courses);
    }

}
