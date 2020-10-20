package com.afs.tdd;

import java.util.List;

public class Client {
    private static final String MOVE = "M";
    private static final String LEFT = "L";
    private static final String RIGHT = "R";
    private int xLocation;
    private int yLocation;
    private String direction;

    public Client(int xLocation, int yLocation, String direction) {
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

    public void enterCommands(List<String> commands) throws CommandNotDefinedException {
        for (String command : commands) {
            readSingleCommand(command);
        }
    }

    private void readSingleCommand(String command) throws CommandNotDefinedException {
        receiver currentCoordinates = new receiver(xLocation, yLocation, direction);
        switch (command) {
            case MOVE:
                    new commandMove(currentCoordinates).execute();
                    this.yLocation = currentCoordinates.getYLocation();
                    this.xLocation = currentCoordinates.getXLocation();
                break;
            case LEFT:
                    new turnLeft(currentCoordinates).execute();
                    this.direction = currentCoordinates.getDirection();
                break;
            case RIGHT:
                    new turnRight(currentCoordinates).execute();
                    this.direction = currentCoordinates.getDirection();
                break;
            default:
                throw new CommandNotDefinedException();
        }
    }
}
