package com.afs.tdd;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

class DemoTest {
    @Test
    void should_x_0_y_1_N_when_commandsExecuted_M_given_x_0_y_0_N() {
        MarsRover marsRover = new MarsRover(0,0,"N");

        int xLocation = marsRover.getXLocation();
        int yLocation = marsRover.getYLocation();
        String direction = marsRover.getDirection();

        assertEquals(xLocation, 0);
        assertEquals(yLocation, 1);
        assertEquals(direction, "N");
    }
}
