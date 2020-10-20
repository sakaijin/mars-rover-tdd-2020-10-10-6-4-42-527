package com.afs.tdd;

public class turnRight implements command {
    private receiver receiver;

    turnRight(receiver receiver) {
        this.receiver = receiver;
    }

    @Override
    public void execute() {
        switch (receiver.getDirection()) {
            case "S":
                receiver.turnWest();
                break;
            case "N":
                receiver.turnEast();
                break;
            case "W":
                receiver.turnNorth();
                break;
            case "E":
                receiver.turnSouth();
                break;
        }
    }
}
