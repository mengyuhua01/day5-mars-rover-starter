package com.afs.tdd;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

class DemoTest {
    @Test
    void should_move_when_executeCommand_given_M_Direction_N() {
        //given
        MarsRover marsRover = new MarsRover(new Location(0,0,Direction.N));
        //when
        marsRover.executeCommand("M");
        Location expectedLocation = new Location(0,1,Direction.N);
        //then
        assertEquals(expectedLocation, marsRover.getLocation());
    }

    @Test
    void should_move_when_executeCommand_given_M_Direction_S() {
        //given
        MarsRover marsRover = new MarsRover(new Location(0,0,Direction.S));
        //when
        marsRover.executeCommand("M");
        Location expectedLocation = new Location(0,-1,Direction.S);
        //then
        assertEquals(expectedLocation, marsRover.getLocation());
    }

    @Test
    void should_move_when_executeCommand_given_M_Direction_E() {
        //given
        MarsRover marsRover = new MarsRover(new Location(0,0,Direction.E));
        //when
        marsRover.executeCommand("M");
        Location expectedLocation = new Location(1,0,Direction.E);
        //then
        assertEquals(expectedLocation, marsRover.getLocation());
    }
    @Test
    void should_move_when_executeCommand_given_M_Direction_W() {
        //given
        MarsRover marsRover = new MarsRover(new Location(0,0,Direction.W));
        //when
        marsRover.executeCommand("M");
        Location expectedLocation = new Location(-1,0,Direction.W);
        //then
        assertEquals(expectedLocation, marsRover.getLocation());
    }
    @Test
    void should_turn_left_90_degrees_when_executeCommand_given_L_Direction_N() {
        //given
        MarsRover marsRover = new MarsRover(new Location(0,0,Direction.N));
        //when
        marsRover.executeCommand("L");
        Location expectedLocation = new Location(0,0,Direction.W);
        //then
        assertEquals(expectedLocation, marsRover.getLocation());
    }
}
