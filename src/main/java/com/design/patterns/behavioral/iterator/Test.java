package com.design.patterns.behavioral.iterator;

/**
 * @author tangxiangwei
 * @date 20/2/26
 */
public class Test {

    public static void main(String[] args) {
        CourseAggregate courseAggregate = new CourseAggregateImpl();
        Course course = new Course("测试");
        courseAggregate.addCourse(course);
        courseAggregate.addCourse(new Course("java"));
        courseAggregate.addCourse(new Course("fe"));

        printCourses(courseAggregate);
        courseAggregate.removeCourse(course);
        printCourses(courseAggregate);

    }

    public static void printCourses(CourseAggregate courseAggregate) {
        CourseIterator iterator = courseAggregate.getCourseIterator();
        while (!iterator.isLastCourse()) {
            Course course = iterator.nextCourse();
            System.out.println(course.getName());
        }
    }
}
