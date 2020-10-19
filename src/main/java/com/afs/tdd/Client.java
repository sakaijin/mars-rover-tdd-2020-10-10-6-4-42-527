package com.afs.tdd;

import java.util.List;

public class Client {
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
    private invoker invoker = new invoker();

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
        switch (command) {
            case MOVE:
                if (direction.equals(NORTH) || direction.equals(SOUTH)){
                    yLocation = invoker.executeCommand(new commandMoveInYAxis(new receiver(xLocation,yLocation,direction)));
                }
                else {
                    xLocation = invoker.executeCommand(new commandMoveInXAxis(new receiver(xLocation, yLocation, direction)));
                }
                break;
            case LEFT:
                if (direction.equals(NORTH) || direction.equals(SOUTH)){
                    direction = invoker.changeDirection(new turnLeftInYAxis(new receiver(direction)));
                }
                else {
                    direction = invoker.changeDirection(new turnLeftInXAxis(new receiver(direction)));
                }
                break;
            case RIGHT:
                if (direction.equals(NORTH) || direction.equals(SOUTH)){
                    direction = invoker.changeDirection(new turnRightInYAxis(new receiver(direction)));
                }
                else {
                    direction = invoker.changeDirection(new turnRightInXAxis(new receiver(direction)));
                }
                break;
            default:
                throw new CommandNotDefinedException();
        }
    }
}
