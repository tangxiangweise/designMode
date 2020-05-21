package com.design.patterns.behavioral.interpreter;

/**
 * @author tangxiangwei
 * @date 20/3/2
 */
public class Test {

    public static void main(String[] args) {
        String inputStr = "6 100 11 + *";
        ExpressionParser expressionParser = new ExpressionParser();
        int result = expressionParser.parse(inputStr);
        System.out.println("解释器计算结果：" + result);

    }
}
