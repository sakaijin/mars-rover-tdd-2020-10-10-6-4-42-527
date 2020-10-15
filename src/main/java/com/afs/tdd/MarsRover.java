package com.afs.tdd;

import java.util.List;

public class MarsRover {
    private static final String NORTH = "N";
    private static final String MOVE = "M";
    private static final String LEFT = "L";
    private static final String RIGHT = "R";
    private int xLocation;
    private int yLocation;
    private String direction;

    public MarsRover(int xLocation, int yLocation, String direction) {
        this.xLocation = xLocation;
        this.yLocation = yLocation;
        this.direction = direction;
    }

    public int getXLocation() {
        return xLocation;
    }

    public int getYLocation() {
        return yLocation;
    }

    public String getDirection() {
        return direction;
    }

    public void executeCommand(List<String> commands) {
        commands.forEach(this::readSingleCommand);
    }

    private void readSingleCommand(String command) {
        if (command.equals(MOVE)) {
            move();
        }
        if (command.equals(LEFT)) {
            turnLeft();
        }
        if (command.equals(RIGHT)) {
            turnRight();
        }
    }

    private void turnRight() {
        if (isNorth()) {
            direction = "E";
        }
    }

    private void turnLeft() {
        if (isNorth()) {
            direction = "W";
        }
        if (direction.equals("S")){
            direction = "E";
        }
    }

    private void move() {
        if (isNorth()) {
            yLocation++;
        }
        if (direction.equals("S")){
            yLocation--;
        }
    }

    private boolean isNorth() {
        return direction.equals(NORTH);
    }
}
