package com.design.patterns.behavioral.observer;

/**
 * @author tangxiangwei
 * @date 20/3/2
 */
public class Test {

    public static void main(String[] args) {
        Course course = new Course("设计模式");
        Teacher teacher = new Teacher("Alpha");
        course.addObserver(teacher);

        Question question = new Question();
        question.setUserName("txw");
        question.setContent("如何成为一个优秀的Java工程师");


        course.produceQuestion(course, question);

    }
}
