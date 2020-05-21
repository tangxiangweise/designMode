package com.design.patterns.behavioral.state;

/**
 * @author tangxiangwei
 * @date 20/3/10
 */
public class SpeedState extends CourseVideoState {

    @Override
    public void play() {
        context.setCourseVideoState(CourseVideoContext.PLAY_STATE);
    }

    @Override
    public void speed() {
        System.out.println("快进播放课程视频状态");
    }

    @Override
    public void pause() {
        context.setCourseVideoState(CourseVideoContext.PAUSE_STATE);
    }

    @Override
    public void stop() {
        context.setCourseVideoState(CourseVideoContext.STOP_STATE);
    }
}
