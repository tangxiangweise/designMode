package com.design.principle.openclose;

public class Test {

    public static void main(String[] args) {
        ICourse course = new JavaCourse(1, "java", 301.2);
        IDiscountCourse discountCourse = (IDiscountCourse) course;
        System.out.println(discountCourse.getOriginPrice());
    }
}
