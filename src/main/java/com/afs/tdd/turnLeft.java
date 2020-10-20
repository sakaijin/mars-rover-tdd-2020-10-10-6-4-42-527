package com.afs.tdd;

public class turnLeft implements command {
    private receiver receiver;

    turnLeft(receiver receiver) {
        this.receiver = receiver;
    }

    @Override
    public void execute() {
        switch (receiver.getDirection()) {
            case "N":
                receiver.turnWest();
                break;
            case "S":
                receiver.turnEast();
                break;
            case "W":
                receiver.turnSouth();
                break;
            case "E":
                receiver.turnNorth();
                break;
        }
    }
}
