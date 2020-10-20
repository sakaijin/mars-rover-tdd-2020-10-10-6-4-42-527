package com.afs.tdd;

public class turnRight implements command {
    private static final String NORTH = "N";
    private static final String SOUTH = "S";
    private static final String EAST = "E";
    private static final String WEST = "W";
    private receiver receiver;

    turnRight(receiver receiver) {
        this.receiver = receiver;
    }

    @Override
    public void execute() {
        switch (receiver.getDirection()) {
            case SOUTH:
                receiver.turnWest();
                break;
            case NORTH:
                receiver.turnEast();
                break;
            case WEST:
                receiver.turnNorth();
                break;
            case EAST:
                receiver.turnSouth();
                break;
        }
    }
}
