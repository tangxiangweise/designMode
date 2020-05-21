package com.design.patterns.behavioral.templatemethod;

/**
 * @author tangxiangwei
 * @date 20/2/26
 */
public class FECourse extends ACourse {

    @Override
    void packageCourse() {
        System.out.println("提供课程前端代码");
        System.out.println("提供课程的图片等多媒体素材");
    }

    @Override
    protected boolean needWriteArticle() {
        return true;
    }
}
