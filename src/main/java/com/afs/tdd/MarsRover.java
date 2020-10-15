package com.afs.tdd;

import java.util.List;

public class MarsRover {
    private static final String NORTH = "N";
    private static final String SOUTH = "S";
    private static final String EAST = "E";
    private static final String WEST = "W";
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

    public void executeCommand(List<String> commands) throws CommandNotDefinedException {
        for (String command : commands) {
            readSingleCommand(command);
        }
    }

    private void readSingleCommand(String command) throws CommandNotDefinedException {
        if (command.equals(MOVE)) {
            move();
        }
        else if (command.equals(LEFT)) {
            turnLeft();
        }
        else if (command.equals(RIGHT)) {
            turnRight();
        }
        else {
            throw new CommandNotDefinedException("Command Not Defined.");
        }
    }

    private void turnRight() {
        if (isNorth()) {
            direction = EAST;
        }
        else if (isSouth()){
            direction = WEST;
        }
        else if (isEast()){
            direction = SOUTH;
        }
        else if (isWest()){
            direction = NORTH;
        }
    }

    private void turnLeft() {
        if (isNorth()) {
            direction = WEST;
        }
        else if (isSouth()){
            direction = EAST;
        }
        else if (isEast()){
            direction = NORTH;
        }
        else if (isWest()){
            direction = SOUTH;
        }
    }

    private void move() {
        if (isNorth()) {
            yLocation++;
        }
        if (isSouth()){
            yLocation--;
        }
        if (isEast()){
            xLocation++;
        }
        if (isWest()){
            xLocation--;
        }
    }

    private boolean isNorth() {
        return direction.equals(NORTH);
    }

    private boolean isSouth() {
        return direction.equals(SOUTH);
    }

    private boolean isEast() {
        return direction.equals(EAST);
    }

    private boolean isWest() {
        return direction.equals(WEST);
    }
}
