package com.design.patterns.behavioral.mediator;

/**
 * @author tangxiangwei
 * @date 20/3/3
 */
public class User {

    private String name;

    public User(String name) {
        this.name = name;
    }

    public void sendMessage(String message) {
        StudyGroup.showMessage(this, message);
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}
