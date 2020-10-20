package com.afs.tdd;

public class turnRightInXAxis implements command {
    private receiver receiver;

    turnRightInXAxis(receiver receiver) {
        this.receiver = receiver;
    }

    @Override
    public void moveOrChangeDirection() {
        if (receiver.getDirection().equals("E")){
            receiver.turnSouth();
        }else{
            receiver.turnNorth();
        }
    }
}
