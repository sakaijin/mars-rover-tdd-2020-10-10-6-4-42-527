package com.afs.tdd;

public class commandMove implements command {

    private receiver receiver;

    commandMove(receiver receiver) {
        this.receiver = receiver;
    }

    @Override
    public void execute() {
        switch (receiver.getDirection()){
            case "N":
                receiver.moveNorth();
                break;
            case "S":
                receiver.moveSouth();
                break;
            case "E":
                receiver.moveEast();
                break;
            case "W":
                receiver.moveWest();
                break;
        }
    }
}
