package com.design.patterns.behavioral.chains;

/**
 * @author tangxiangwei
 * @date 20/3/6
 */
public class VideoApprover extends Approver {

    public VideoApprover(Approver approver) {
        super(approver);
    }

    @Override
    void deploy(Course course) {
        if (course.getVideo() != null) {
            System.out.println(course.getName() + "含有视频，批准");
            if (approver != null) {
                approver.deploy(course);
            }
        } else {
            System.out.println(course.getName() + "缺少视频，驳回");
            return;
        }
    }
}