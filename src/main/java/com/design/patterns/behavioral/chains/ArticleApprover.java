package com.design.patterns.behavioral.chains;

/**
 * @author tangxiangwei
 * @date 20/3/6
 */
public class ArticleApprover extends Approver {

    public ArticleApprover(Approver approver) {
        super(approver);
    }

    @Override
    void deploy(Course course) {
        if (course.getArticle() != null) {
            System.out.println(course.getName() + "含有手记，批准");
            if (approver != null) {
                approver.deploy(course);
            }
        } else {
            System.out.println(course.getName() + "缺少手记，驳回");
            return;
        }
    }
}
