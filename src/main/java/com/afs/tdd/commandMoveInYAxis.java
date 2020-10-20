package com.afs.tdd;

public class commandMoveInYAxis implements command {

    private receiver receiver;

    commandMoveInYAxis(receiver receiver) {
        this.receiver = receiver;
    }

    @Override
    public void moveOrChangeDirection() {
        if (receiver.getDirection().equals("N")){
            receiver.moveNorth();
        }else{
            receiver.moveSouth();
        }
    }
}
