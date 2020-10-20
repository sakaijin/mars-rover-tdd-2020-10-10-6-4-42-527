package com.afs.tdd;

public class turnLeftInYAxis implements command{

    private receiver receiver;

    turnLeftInYAxis(receiver receiver) {
        this.receiver = receiver;
    }

    @Override
    public void execute() {
        if (receiver.getDirection().equals("N")){
            receiver.turnWest();
        }else{
            receiver.turnEast();
        }
    }
}
