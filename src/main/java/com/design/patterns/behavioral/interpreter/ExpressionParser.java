package com.design.patterns.behavioral.interpreter;

import java.util.Stack;

/**
 * @author tangxiangwei
 * @date 20/3/2
 */
public class ExpressionParser {
    private Stack<Interpreter> stack = new Stack<>();



    public int parse(String input) {
        String[] splits = input.split(" ");

        for (String split : splits) {
            
        }
        return 0;
    }
}
