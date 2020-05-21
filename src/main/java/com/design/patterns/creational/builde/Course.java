package com.design.patterns.creational.builde;

/**
 * 建造者 demo
 *
 * @author tangxiangwei
 * @date 20/2/7
 */
public class Course {

    private String name;

    private String video;

    public Course(CourseBuilder courseBuilder) {
        this.name = courseBuilder.name;
        this.video = courseBuilder.video;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getVideo() {
        return video;
    }

    public void setVideo(String video) {
        this.video = video;
    }

    @Override
    public String toString() {
        return "Course{" +
                "name='" + name + '\'' +
                ", video='" + video + '\'' +
                '}';
    }

    public static class CourseBuilder {

        private String name;

        private String video;

        public CourseBuilder buildCourseName(String name) {
            this.name = name;
            return this;
        }

        public CourseBuilder buildCourseVideo(String video) {
            this.video = video;
            return this;
        }

        public Course build() {
            return new Course(this);
        }
    }
}
