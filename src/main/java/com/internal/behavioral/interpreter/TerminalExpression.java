package com.internal.behavioral.interpreter;

public class TerminalExpression implements Expression {

    String data;

    public TerminalExpression(String data) {
        this.data = data;
    }

    @Override
    public boolean interpret(String type) {
        return data.contains(type);
    }
}
