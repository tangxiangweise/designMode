package com.design.patterns.behavioral.command;

/**
 * @author tangxiangwei
 * @date 20/3/2
 */
public class Test {

    public static void main(String[] args) {
        Staff staff = new Staff();

        CourseVideo courseVideo = new CourseVideo("java");

        OpenCourseVideoCommand openCourseVideoCommand = new OpenCourseVideoCommand(courseVideo);
        CloseCourseVideoCommand closeCourseVideoCommand = new CloseCourseVideoCommand(courseVideo);
        staff.addCommand(closeCourseVideoCommand);
        staff.addCommand(openCourseVideoCommand);

        staff.executeCommands();

    }
}
