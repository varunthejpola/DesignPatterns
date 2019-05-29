package com.internal.behavioral.interpreter;

public class MainTest {

    public static void main(String args[]) {

        Expression e1 = new TerminalExpression("I am varun thej pola");

        System.out.println( e1.interpret("varun") );

        System.out.println( e1.interpret("hola") );

        Expression e2 = new TerminalExpression("T am hola");

        Expression e3 = new OrExpression(e1,e2);

        System.out.println( e3.interpret("pola") );

        Expression e4 = new AndExpression(e1,e2);

        System.out.println( e4.interpret("pola"));
        System.out.println( e4.interpret("am"));

    }
}
