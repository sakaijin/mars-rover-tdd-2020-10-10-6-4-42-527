package com.afs.tdd;

public class turnRightInYAxis implements command {
    private receiver receiver;

    turnRightInYAxis(receiver receiver) {
        this.receiver = receiver;
    }

    @Override
    public void execute() {
        if (receiver.getDirection().equals("N")){
            receiver.turnEast();
        }else{
            receiver.turnWest();
        }
    }
}
