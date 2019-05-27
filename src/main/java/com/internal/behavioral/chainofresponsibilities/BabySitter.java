package com.internal.behavioral.chainofresponsibilities;

public class BabySitter extends Servant{

    @Override
    public void taskPerform(Task work) {
        if(work.equals(Task.BABYCAREING)) {
            System.out.println("Baby has been taking care");
        } else {
            getSuccessor().taskPerform(work);
        }
    }
}
