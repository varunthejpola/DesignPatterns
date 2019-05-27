package com.internal.behavioral.chainofresponsibilities;

public abstract class Servant {

    private Servant successor;

    public Servant getSuccessor() {
        return successor;
    }

    public void setSuccessor(Servant successor) {
        this.successor = successor;
    }

    public abstract void taskPerform(Task work);
}
