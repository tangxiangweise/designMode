package com.design.patterns.behavioral.state;

/**
 * @author tangxiangwei
 * @date 20/3/10
 */
public abstract class CourseVideoState {

    protected CourseVideoContext context;

    public void setContext(CourseVideoContext context) {
        this.context = context;
    }

    public abstract void play();

    public abstract void speed();

    public abstract void pause();

    public abstract void stop();

}
