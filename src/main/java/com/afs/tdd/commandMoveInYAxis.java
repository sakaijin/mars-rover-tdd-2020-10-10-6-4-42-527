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
        }
        else{
            receiver.moveSouth();
        }
    }

//    @Override
//    public int move() {
//        if (receiver.getDirection().equals("N")){
//            receiver.moveNorth();
//            return receiver.getyLocation();
//        }
//        receiver.moveSouth();
//        return receiver.getyLocation();
//    }
//
//    @Override
//    public String change() {
//        return null;
//    }
}
