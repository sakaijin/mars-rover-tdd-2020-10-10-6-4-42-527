package com.afs.tdd;

public class turnLeft implements command {
    private static final String NORTH = "N";
    private static final String SOUTH = "S";
    private static final String EAST = "E";
    private static final String WEST = "W";
    private receiver receiver;

    turnLeft(receiver receiver) {
        this.receiver = receiver;
    }

    @Override
    public void execute() {
        switch (receiver.getDirection()) {
            case NORTH:
                receiver.turnWest();
                break;
            case SOUTH:
                receiver.turnEast();
                break;
            case WEST:
                receiver.turnSouth();
                break;
            case EAST:
                receiver.turnNorth();
                break;
        }
    }
}
