package com.afs.tdd;

public class turnLeftInXAxis implements command{

    private receiver receiver;

    turnLeftInXAxis(receiver receiver) {
        this.receiver = receiver;
    }

    @Override
    public int move() {
        return 0;
    }

    @Override
    public String change() {
        if (receiver.getDirection().equals("E")){
            receiver.turnNorth();
            return receiver.getDirection();
        }
        else {
            receiver.turnSouth();
            return receiver.getDirection();
        }
    }
}