package com.internal.behavioral.command;

//concrete command
public class ContinentalOrder implements CookOrder {

    ContinentalCook cook = new ContinentalCook();

    @Override
    public void execute() {
        cook.cooking();
    }
}
