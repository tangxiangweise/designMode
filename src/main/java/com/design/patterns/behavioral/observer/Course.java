package com.design.patterns.behavioral.observer;

import java.util.Observable;

/**
 * 被观察对象
 *
 * @author tangxiangwei
 * @date 20/3/2
 */
public class Course extends Observable {

    private String name;

    public Course(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public void produceQuestion(Course course, Question question) {
        System.out.println(question.getUserName() + " 在 " + course.getName() + "上提交了一个问题");
        setChanged();
        notifyObservers(question);
    }


}
