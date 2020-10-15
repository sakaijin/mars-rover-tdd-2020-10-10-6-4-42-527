package com.afs.tdd;

import java.util.List;

public class MarsRover {
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
        if (command.equals("M")) {
            move();
        }
        if (command.equals("L")){
            turnLeft();
        }
    }

    private void turnLeft() {
        if (direction.equals("N")){
            direction = "W";
        }
    }

    private void move() {
        if (direction.equals("N")) {
            yLocation++;
        }
    }
}
