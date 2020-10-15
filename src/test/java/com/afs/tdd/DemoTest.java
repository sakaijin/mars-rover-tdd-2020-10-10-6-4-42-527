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

        assertEquals(0, xLocation);
        assertEquals(1, yLocation);
        assertEquals("N", direction);
    }

    @Test
    void should_x_0_y_0_W_when_executeCommand_L_given_x_0_y_0_N() {
        MarsRover marsRover = new MarsRover(0, 0, "N");
        CommandSplitter commandsSplit = new CommandSplitter();
        marsRover.executeCommand(commandsSplit.splitCommands("L"));

        int xLocation = marsRover.getXLocation();
        int yLocation = marsRover.getYLocation();
        String direction = marsRover.getDirection();

        assertEquals(0, xLocation);
        assertEquals(0, yLocation);
        assertEquals("W", direction);
    }

    @Test
    void should_x_0_y_0_E_when_executeCommand_R_given_x_0_y_0_N() {
        MarsRover marsRover = new MarsRover(0, 0, "N");
        CommandSplitter commandsSplit = new CommandSplitter();
        marsRover.executeCommand(commandsSplit.splitCommands("R"));

        int xLocation = marsRover.getXLocation();
        int yLocation = marsRover.getYLocation();
        String direction = marsRover.getDirection();

        assertEquals(0, xLocation);
        assertEquals(0, yLocation);
        assertEquals("E", direction);
    }

    @Test
    void should_x_0_y_negative_1_S_when_executeCommand_M_given_x_0_y_0_S() {
        MarsRover marsRover = new MarsRover(0, 0, "S");
        CommandSplitter commandsSplit = new CommandSplitter();
        marsRover.executeCommand(commandsSplit.splitCommands("M"));

        int xLocation = marsRover.getXLocation();
        int yLocation = marsRover.getYLocation();
        String direction = marsRover.getDirection();

        assertEquals(0, xLocation);
        assertEquals(-1, yLocation);
        assertEquals("S", direction);
    }

    @Test
    void should_x_0_y_0_E_when_executeCommand_L_given_x_0_y_0_S() {
        MarsRover marsRover = new MarsRover(0, 0, "S");
        CommandSplitter commandsSplit = new CommandSplitter();
        marsRover.executeCommand(commandsSplit.splitCommands("L"));

        int xLocation = marsRover.getXLocation();
        int yLocation = marsRover.getYLocation();
        String direction = marsRover.getDirection();

        assertEquals(0, xLocation);
        assertEquals(0, yLocation);
        assertEquals("E", direction);
    }

    @Test
    void should_x_0_y_0_W_when_executeCommand_R_given_x_0_y_0_S() {
        MarsRover marsRover = new MarsRover(0, 0, "S");
        CommandSplitter commandsSplit = new CommandSplitter();
        marsRover.executeCommand(commandsSplit.splitCommands("R"));

        int xLocation = marsRover.getXLocation();
        int yLocation = marsRover.getYLocation();
        String direction = marsRover.getDirection();

        assertEquals(0, xLocation);
        assertEquals(0, yLocation);
        assertEquals("W", direction);
    }

    @Test
    void should_x_1_y_0_E_when_executeCommand_M_given_x_0_y_0_E() {
        MarsRover marsRover = new MarsRover(0, 0, "E");
        CommandSplitter commandsSplit = new CommandSplitter();
        marsRover.executeCommand(commandsSplit.splitCommands("M"));

        int xLocation = marsRover.getXLocation();
        int yLocation = marsRover.getYLocation();
        String direction = marsRover.getDirection();

        assertEquals(1, xLocation);
        assertEquals(0, yLocation);
        assertEquals("E", direction);
    }

    @Test
    void should_x_0_y_0_N_when_executeCommand_L_given_x_0_y_0_E() {
        MarsRover marsRover = new MarsRover(0, 0, "E");
        CommandSplitter commandsSplit = new CommandSplitter();
        marsRover.executeCommand(commandsSplit.splitCommands("L"));

        int xLocation = marsRover.getXLocation();
        int yLocation = marsRover.getYLocation();
        String direction = marsRover.getDirection();

        assertEquals(0, xLocation);
        assertEquals(0, yLocation);
        assertEquals("N", direction);
    }

    @Test
    void should_x_0_y_0_S_when_executeCommand_R_given_x_0_y_0_E() {
        MarsRover marsRover = new MarsRover(0, 0, "E");
        CommandSplitter commandsSplit = new CommandSplitter();
        marsRover.executeCommand(commandsSplit.splitCommands("R"));

        int xLocation = marsRover.getXLocation();
        int yLocation = marsRover.getYLocation();
        String direction = marsRover.getDirection();

        assertEquals(0, xLocation);
        assertEquals(0, yLocation);
        assertEquals("S", direction);
    }

    @Test
    void should_x_negative_1_y_0_W_when_executeCommand_M_given_x_0_y_0_W() {
        MarsRover marsRover = new MarsRover(0, 0, "W");
        CommandSplitter commandsSplit = new CommandSplitter();
        marsRover.executeCommand(commandsSplit.splitCommands("M"));

        int xLocation = marsRover.getXLocation();
        int yLocation = marsRover.getYLocation();
        String direction = marsRover.getDirection();

        assertEquals(-1, xLocation);
        assertEquals(0, yLocation);
        assertEquals("E", direction);
    }

}
