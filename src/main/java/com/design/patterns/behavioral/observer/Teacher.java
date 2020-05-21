package com.design.patterns.behavioral.observer;

import java.util.Observable;
import java.util.Observer;

/**
 * @author tangxiangwei
 * @date 20/3/2
 */
public class Teacher implements Observer {

    private String name;

    public Teacher(String name) {
        this.name = name;
    }

    @Override
    public void update(Observable o, Object arg) {
        Course course = (Course) o;
        Question question = (Question) arg;
        System.out.println(name + "老师的" + course.getName() + "课程接受到一个" + question.getUserName() + "提交的问答 " + question.getContent());
    }

}
