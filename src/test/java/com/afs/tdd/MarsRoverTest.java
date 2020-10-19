package com.afs.tdd;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertThrows;

class ClientTest {
    @Test
    void should_x_0_y_1_N_when_enterCommands_M_given_x_0_y_0_N() throws CommandNotDefinedException {
        Client client = new Client(0, 0, "N");
        CommandSplitter commandsSplit = new CommandSplitter();
        client.enterCommands(commandsSplit.splitCommands("M"));

        int xLocation = client.getXLocation();
        int yLocation = client.getYLocation();
        String direction = client.getDirection();

        assertEquals(0, xLocation);
        assertEquals(1, yLocation);
        assertEquals("N", direction);
    }

    @Test
    void should_x_0_y_0_W_when_enterCommands_L_given_x_0_y_0_N() throws CommandNotDefinedException {
        Client client = new Client(0, 0, "N");
        CommandSplitter commandsSplit = new CommandSplitter();
        client.enterCommands(commandsSplit.splitCommands("L"));

        int xLocation = client.getXLocation();
        int yLocation = client.getYLocation();
        String direction = client.getDirection();

        assertEquals(0, xLocation);
        assertEquals(0, yLocation);
        assertEquals("W", direction);
    }

    @Test
    void should_x_0_y_0_E_when_enterCommands_R_given_x_0_y_0_N() throws CommandNotDefinedException {
        Client client = new Client(0, 0, "N");
        CommandSplitter commandsSplit = new CommandSplitter();
        client.enterCommands(commandsSplit.splitCommands("R"));

        int xLocation = client.getXLocation();
        int yLocation = client.getYLocation();
        String direction = client.getDirection();

        assertEquals(0, xLocation);
        assertEquals(0, yLocation);
        assertEquals("E", direction);
    }

    @Test
    void should_x_0_y_negative_1_S_when_enterCommands_M_given_x_0_y_0_S() throws CommandNotDefinedException {
        Client client = new Client(0, 0, "S");
        CommandSplitter commandsSplit = new CommandSplitter();
        client.enterCommands(commandsSplit.splitCommands("M"));

        int xLocation = client.getXLocation();
        int yLocation = client.getYLocation();
        String direction = client.getDirection();

        assertEquals(0, xLocation);
        assertEquals(-1, yLocation);
        assertEquals("S", direction);
    }

    @Test
    void should_x_0_y_0_E_when_enterCommands_L_given_x_0_y_0_S() throws CommandNotDefinedException {
        Client client = new Client(0, 0, "S");
        CommandSplitter commandsSplit = new CommandSplitter();
        client.enterCommands(commandsSplit.splitCommands("L"));

        int xLocation = client.getXLocation();
        int yLocation = client.getYLocation();
        String direction = client.getDirection();

        assertEquals(0, xLocation);
        assertEquals(0, yLocation);
        assertEquals("E", direction);
    }

    @Test
    void should_x_0_y_0_W_when_enterCommands_R_given_x_0_y_0_S() throws CommandNotDefinedException {
        Client client = new Client(0, 0, "S");
        CommandSplitter commandsSplit = new CommandSplitter();
        client.enterCommands(commandsSplit.splitCommands("R"));

        int xLocation = client.getXLocation();
        int yLocation = client.getYLocation();
        String direction = client.getDirection();

        assertEquals(0, xLocation);
        assertEquals(0, yLocation);
        assertEquals("W", direction);
    }

    @Test
    void should_x_1_y_0_E_when_enterCommands_M_given_x_0_y_0_E() throws CommandNotDefinedException {
        Client client = new Client(0, 0, "E");
        CommandSplitter commandsSplit = new CommandSplitter();
        client.enterCommands(commandsSplit.splitCommands("M"));

        int xLocation = client.getXLocation();
        int yLocation = client.getYLocation();
        String direction = client.getDirection();

        assertEquals(1, xLocation);
        assertEquals(0, yLocation);
        assertEquals("E", direction);
    }

    @Test
    void should_x_0_y_0_N_when_enterCommands_L_given_x_0_y_0_E() throws CommandNotDefinedException {
        Client client = new Client(0, 0, "E");
        CommandSplitter commandsSplit = new CommandSplitter();
        client.enterCommands(commandsSplit.splitCommands("L"));

        int xLocation = client.getXLocation();
        int yLocation = client.getYLocation();
        String direction = client.getDirection();

        assertEquals(0, xLocation);
        assertEquals(0, yLocation);
        assertEquals("N", direction);
    }

    @Test
    void should_x_0_y_0_S_when_enterCommands_R_given_x_0_y_0_E() throws CommandNotDefinedException {
        Client client = new Client(0, 0, "E");
        CommandSplitter commandsSplit = new CommandSplitter();
        client.enterCommands(commandsSplit.splitCommands("R"));

        int xLocation = client.getXLocation();
        int yLocation = client.getYLocation();
        String direction = client.getDirection();

        assertEquals(0, xLocation);
        assertEquals(0, yLocation);
        assertEquals("S", direction);
    }

    @Test
    void should_x_negative_1_y_0_W_when_enterCommands_M_given_x_0_y_0_W() throws CommandNotDefinedException {
        Client client = new Client(0, 0, "W");
        CommandSplitter commandsSplit = new CommandSplitter();
        client.enterCommands(commandsSplit.splitCommands("M"));

        int xLocation = client.getXLocation();
        int yLocation = client.getYLocation();
        String direction = client.getDirection();

        assertEquals(-1, xLocation);
        assertEquals(0, yLocation);
        assertEquals("W", direction);
    }

    @Test
    void should_x_0_y_0_S_when_enterCommands_L_given_x_0_y_0_W() throws CommandNotDefinedException {
        Client client = new Client(0, 0, "W");
        CommandSplitter commandsSplit = new CommandSplitter();
        client.enterCommands(commandsSplit.splitCommands("L"));

        int xLocation = client.getXLocation();
        int yLocation = client.getYLocation();
        String direction = client.getDirection();

        assertEquals(0, xLocation);
        assertEquals(0, yLocation);
        assertEquals("S", direction);
    }

    @Test
    void should_x_0_y_0_N_when_enterCommands_R_given_x_0_y_0_W() throws CommandNotDefinedException {
        Client client = new Client(0, 0, "W");
        CommandSplitter commandsSplit = new CommandSplitter();
        client.enterCommands(commandsSplit.splitCommands("R"));

        int xLocation = client.getXLocation();
        int yLocation = client.getYLocation();
        String direction = client.getDirection();

        assertEquals(0, xLocation);
        assertEquals(0, yLocation);
        assertEquals("N", direction);
    }

    @Test
    void should_throwCommandNotDefinedException_when_enterCommands_F_given_x_0_y_0_N() {
        Client client = new Client(0, 0, "W");
        CommandSplitter commandsSplit = new CommandSplitter();

        assertThrows(CommandNotDefinedException.class, () -> client.enterCommands(commandsSplit.splitCommands("F")));
    }

    @Test
    void should_x_negative_1_y_1_N_when_enterCommands_MLMR_given_x_0_y_0_N() throws CommandNotDefinedException {
        Client client = new Client(0, 0, "N");
        CommandSplitter commandsSplit = new CommandSplitter();
        client.enterCommands(commandsSplit.splitCommands("MLMR"));

        int xLocation = client.getXLocation();
        int yLocation = client.getYLocation();
        String direction = client.getDirection();

        assertEquals(-1, xLocation);
        assertEquals(1, yLocation);
        assertEquals("N", direction);
    }
}
