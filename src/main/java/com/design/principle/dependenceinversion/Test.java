package com.design.principle.dependenceinversion;

public class Test {

    public static void main(String[] args) {
        Student student = new Student();
        student.studyCourse(new JavaCourse());
        student.studyCourse(new FECourse());
    }
}
