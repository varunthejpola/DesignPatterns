package com.internal.behavioral.interpreter;

public class AndExpression implements  Expression {

    private Expression e1;
    private Expression e2;

    public AndExpression(Expression e1, Expression e2) {
        this.e1 = e1;
        this.e2= e2;
    }


    @Override
    public boolean interpret(String type) {
        return e1.interpret(type) && e2.interpret(type);
    }
}
