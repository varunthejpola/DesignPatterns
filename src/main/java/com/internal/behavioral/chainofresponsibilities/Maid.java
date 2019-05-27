package com.internal.behavioral.chainofresponsibilities;

public class Maid  extends Servant{

    @Override
    public void taskPerform(Task work) {
        if(work.equals(Task.CLEANING)) {
            System.out.println("Maid cleaned the house");
        } else {
            getSuccessor().taskPerform(work);
        }
    }
}
