package com.design.patterns.behavioral.state;

/**
 * @author tangxiangwei
 * @date 20/3/10
 */
public class CourseVideoContext {

    private CourseVideoState courseVideoState;

    public final static PlayState PLAY_STATE = new PlayState();

    public final static StopState STOP_STATE = new StopState();

    public final static SpeedState SPEED_STATE = new SpeedState();

    public final static PauseState PAUSE_STATE = new PauseState();


    public CourseVideoState getCourseVideoState() {
        return courseVideoState;
    }

    public void setCourseVideoState(CourseVideoState courseVideoState) {
        this.courseVideoState = courseVideoState;
        this.courseVideoState.setContext(this);
    }

    public void play() {
        courseVideoState.play();
    }

    public void speed() {
        courseVideoState.speed();
    }

    public void pause() {
        courseVideoState.pause();
    }

    public void stop() {
        courseVideoState.stop();
    }

}
