package com.internal.behavioral.command;

import java.util.List;

//Invoker
public class Waiter {
    public void takeOrder(List<CookOrder> orders) {
        orders.forEach(order -> order.execute());
    }
}
