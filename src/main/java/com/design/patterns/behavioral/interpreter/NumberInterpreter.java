package com.design.patterns.behavioral.interpreter;

/**
 * @author tangxiangwei
 * @date 20/3/2
 */
public class NumberInterpreter implements Interpreter {
    private int number;

    public NumberInterpreter(int number) {
        this.number = number;
    }

    public NumberInterpreter(String number) {
        this.number = Integer.parseInt(number);
    }

    @Override
    public int interpreter() {
        return number;
    }
}
