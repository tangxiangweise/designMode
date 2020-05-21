package com.design.patterns.behavioral.state;

/**
 * @author tangxiangwei
 * @date 20/3/10
 */
public class PauseState extends CourseVideoState {

    @Override
    public void play() {
        context.setCourseVideoState(CourseVideoContext.PLAY_STATE);
    }

    @Override
    public void speed() {
        context.setCourseVideoState(CourseVideoContext.SPEED_STATE);
    }

    @Override
    public void pause() {
        System.out.println("暂停课程视频状态");
    }

    @Override
    public void stop() {
        context.setCourseVideoState(CourseVideoContext.STOP_STATE);
    }
}
