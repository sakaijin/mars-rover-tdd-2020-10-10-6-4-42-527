package com.afs.tdd;

public class turnRightInYAxis implements command {
    private receiver receiver;

    turnRightInYAxis(receiver receiver) {
        this.receiver = receiver;
    }

    @Override
    public int move() {
        return 0;
    }

    @Override
    public String change() {
        if (receiver.getDirection().equals("N")){
            receiver.turnEast();
            return receiver.getDirection();
        }
        else {
            receiver.turnWest();
            return receiver.getDirection();
        }
    }
}
