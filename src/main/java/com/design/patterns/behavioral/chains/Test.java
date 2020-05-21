package com.design.patterns.behavioral.chains;

/**
 * @author tangxiangwei
 * @date 20/3/6
 */
public class Test {

    public static void main(String[] args) {
        Course course = new Course("java", "article", "video");
        VideoApprover videoApprover = new VideoApprover(null);
        ArticleApprover articleApprover = new ArticleApprover(videoApprover);
        articleApprover.deploy(course);

    }
}
