package com.design.patterns.behavioral.mediator;

import java.util.Date;

/**
 * @author tangxiangwei
 * @date 20/3/3
 */
public class StudyGroup {

    public static void showMessage(User user, String message) {
        System.out.println(new Date().toString() + " [" + user.getName() + "] : " + message);
    }


}
