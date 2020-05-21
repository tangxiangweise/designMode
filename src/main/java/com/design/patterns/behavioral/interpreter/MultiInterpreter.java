package com.design.patterns.behavioral.interpreter;

/**
 * @author tangxiangwei
 * @date 20/3/2
 */
public class MultiInterpreter implements Interpreter {

    private Interpreter firstExpression, secondExpression;

    public MultiInterpreter(Interpreter firstExpression, Interpreter secondExpression) {
        this.firstExpression = firstExpression;
        this.secondExpression = secondExpression;
    }

    @Override
    public int interpreter() {
        return firstExpression.interpreter() * secondExpression.interpreter();
    }

    @Override
    public String toString() {
        return "*";
    }
}
