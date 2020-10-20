package com.afs.tdd;

public class turnLeftInXAxis implements command{

    private receiver receiver;

    turnLeftInXAxis(receiver receiver) {
        this.receiver = receiver;
    }

    @Override
    public void execute() {
        if (receiver.getDirection().equals("E")){
            receiver.turnNorth();
        }else {
            receiver.turnSouth();
        }
    }
}