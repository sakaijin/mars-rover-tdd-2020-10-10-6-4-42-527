package com.afs.tdd;

public class commandMoveInXAxis implements command{

    private receiver receiver;

    commandMoveInXAxis(receiver receiver) {
        this.receiver = receiver;
    }

    @Override
    public void execute() {
        if (receiver.getDirection().equals("E")){
            receiver.moveEast();
        }else{
            receiver.moveWest();
        }
    }
}
