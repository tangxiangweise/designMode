package com.design.principle.dependenceinversion;

public class Student {


    public void studyCourse(IStudyCourse studyCourse) {
        studyCourse.studyCourse();
    }

}
