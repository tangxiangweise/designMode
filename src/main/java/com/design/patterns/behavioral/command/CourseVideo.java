package com.design.patterns.behavioral.command;

/**
 * @author tangxiangwei
 * @date 20/3/2
 */
public class CourseVideo {

    private String name;

    public CourseVideo(String name) {
        this.name = name;
    }

    public void open() {
        System.out.println(name + " 视频打开");
    }

    public void close() {
        System.out.println(name + " 视频关闭");
    }

}
