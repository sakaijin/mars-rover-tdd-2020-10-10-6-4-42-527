package com.afs.tdd;

public class turnLeftInYAxis implements command{

    private receiver receiver;

    turnLeftInYAxis(receiver receiver) {
        this.receiver = receiver;
    }

    @Override
    public int move() {
        return 0;
    }

    @Override
    public String change() {
        if (receiver.getDirection().equals("N")){
            receiver.turnWest();
            return receiver.getDirection();
        }
        else {
            receiver.turnEast();
            return receiver.getDirection();
        }
    }
}
