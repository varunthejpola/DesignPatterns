package com.internal.behavioral.chainofresponsibilities;

public class MainTest {

    public static void main(String args[]) {

        Servant cook = new Cook();
        Servant maid = new Maid();
        Servant babySitter = new BabySitter();

        cook.setSuccessor(maid);
        maid.setSuccessor(babySitter);


        cook.taskPerform(Task.BABYCAREING);
        cook.taskPerform(Task.CLEANING);
        cook.taskPerform(Task.COOKING);



    }
}
