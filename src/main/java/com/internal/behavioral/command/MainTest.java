package com.internal.behavioral.command;

import java.util.ArrayList;
import java.util.List;

public  class MainTest {

    public static void main(String [] args) {
        Waiter waiter = new Waiter();

        CookOrder order1 = new IndianOrder();
        CookOrder order2 = new ContinentalOrder();
        CookOrder order3 = new IndianOrder();

        List<CookOrder> orders = new ArrayList<>();
        orders.add(order1);
        orders.add(order2);
        orders.add(order3);

        waiter.takeOrder(orders);
    }
}
