package com.design.patterns.behavioral.chains;

/**
 * @author tangxiangwei
 * @date 20/3/6
 */
public abstract class Approver {

    protected Approver approver;

    public Approver(Approver approver) {
        this.approver = approver;
    }

    abstract void deploy(Course course);
}
