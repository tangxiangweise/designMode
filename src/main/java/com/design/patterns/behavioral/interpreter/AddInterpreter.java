package com.design.patterns.behavioral.interpreter;

/**
 * @author tangxiangwei
 * @date 20/3/2
 */
public class AddInterpreter implements Interpreter {

    private Interpreter firstExpression, secondExpression;

    public AddInterpreter(Interpreter firstExpression, Interpreter secondExpression) {
        this.firstExpression = firstExpression;
        this.secondExpression = secondExpression;
    }

    @Override
    public int interpreter() {
        return firstExpression.interpreter() + secondExpression.interpreter();
    }

    @Override
    public String toString() {
        return "+";
    }
}
