package com.design.patterns.behavioral.state;

/**
 * @author tangxiangwei
 * @date 20/3/10
 */
public class StopState extends CourseVideoState {

    @Override
    public void play() {
        context.setCourseVideoState(CourseVideoContext.PLAY_STATE);
    }

    @Override
    public void speed() {
        System.out.println("ERROR : 停止状态不能快进");
    }

    @Override
    public void pause() {
        System.out.println("ERROR : 停止状态不能暂停");
    }

    @Override
    public void stop() {
        System.out.println("课程视频停止状态");
    }
}
