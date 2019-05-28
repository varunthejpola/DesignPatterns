package com.internal.behavioral.command;


//Concrete command
public class IndianOrder implements CookOrder {

    IndianCook cook = new IndianCook();
    @Override
    public void execute() {
        cook.cooking();

    }
}
