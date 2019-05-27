package com.internal.behavioral.chainofresponsibilities;

public class Cook extends Servant{

    @Override
    public void taskPerform(Task work) {
        if(work.equals(Task.COOKING)) {
            System.out.println("Cooking has been performed by cook");
        } else {
           getSuccessor().taskPerform(work);
        }
    }
}
