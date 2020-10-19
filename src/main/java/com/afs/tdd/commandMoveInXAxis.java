package com.afs.tdd;

public class commandMoveInXAxis implements command{

    private receiver receiver;

    commandMoveInXAxis(receiver receiver) {
        this.receiver = receiver;
    }

    @Override
    public int move() {
        if (receiver.getDirection().equals("E")){
            receiver.moveEast();
            return receiver.getxLocation();
        }
        receiver.moveWest();
        return receiver.getxLocation();
    }

    @Override
    public String change() {
        return null;
    }
}
