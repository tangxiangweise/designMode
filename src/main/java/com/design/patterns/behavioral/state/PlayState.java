package com.design.patterns.behavioral.state;

import java.util.HashMap;
import java.util.Map;

/**
 * @author tangxiangwei
 * @date 20/3/10
 */
public class PlayState extends CourseVideoState {

    @Override
    public void play() {
        System.out.println("正常播放课程视频状态");
    }

    @Override
    public void speed() {
        context.setCourseVideoState(CourseVideoContext.SPEED_STATE);
    }

    @Override
    public void pause() {
        context.setCourseVideoState(CourseVideoContext.PAUSE_STATE);
    }

    @Override
    public void stop() {
        context.setCourseVideoState(CourseVideoContext.STOP_STATE);
    }

    public static void main(String[] args) {
        Map<String, String> map = new HashMap<>(12);
    }
}
