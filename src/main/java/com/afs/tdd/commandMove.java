package com.afs.tdd;

public class commandMove implements command {

    private static final String NORTH = "N";
    private static final String SOUTH = "S";
    private static final String EAST = "E";
    private static final String WEST = "W";
    private receiver receiver;

    commandMove(receiver receiver) {
        this.receiver = receiver;
    }

    @Override
    public void execute() {
        switch (receiver.getDirection()){
            case NORTH:
                receiver.moveNorth();
                break;
            case SOUTH:
                receiver.moveSouth();
                break;
            case EAST:
                receiver.moveEast();
                break;
            case WEST:
                receiver.moveWest();
                break;
        }
    }
}
