package com.afs.tdd;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

class DemoTest {
    @Test
    void should_x_0_y_1_N_when_executeCommand_M_given_x_0_y_0_N() {
        MarsRover marsRover = new MarsRover(0, 0, "N");
        CommandSplitter commandsSplit = new CommandSplitter();
        marsRover.executeCommand(commandsSplit.splitCommands("M"));

        int xLocation = marsRover.getXLocation();
        int yLocation = marsRover.getYLocation();
        String direction = marsRover.getDirection();

        assertEquals(xLocation, 0);
        assertEquals(yLocation, 1);
        assertEquals(direction, "N");
    }

    @Test
    void should_x_0_y_0_W_when_executeCommand_L_given_x_0_y_0_N() {
        MarsRover marsRover = new MarsRover(0, 0, "N");
        CommandSplitter commandsSplit = new CommandSplitter();
        marsRover.executeCommand(commandsSplit.splitCommands("L"));

        int xLocation = marsRover.getXLocation();
        int yLocation = marsRover.getYLocation();
        String direction = marsRover.getDirection();

        assertEquals(xLocation, 0);
        assertEquals(yLocation, 0);
        assertEquals(direction, "W");
    }

    @Test
    void should_x_0_y_0_E_when_executeCommand_R_given_x_0_y_0_N() {
        MarsRover marsRover = new MarsRover(0, 0, "N");
        CommandSplitter commandsSplit = new CommandSplitter();
        marsRover.executeCommand(commandsSplit.splitCommands("R"));

        int xLocation = marsRover.getXLocation();
        int yLocation = marsRover.getYLocation();
        String direction = marsRover.getDirection();

        assertEquals(xLocation, 0);
        assertEquals(yLocation, 0);
        assertEquals(direction, "E");
    }

    @Test
    void should_x_0_y_negative_1_S_when_executeCommand_M_given_x_0_y_0_S() {
        MarsRover marsRover = new MarsRover(0, 0, "S");
        CommandSplitter commandsSplit = new CommandSplitter();
        marsRover.executeCommand(commandsSplit.splitCommands("R"));

        int xLocation = marsRover.getXLocation();
        int yLocation = marsRover.getYLocation();
        String direction = marsRover.getDirection();

        assertEquals(xLocation, 0);
        assertEquals(yLocation, -1);
        assertEquals(direction, "S");
    }


}
