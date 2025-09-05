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
        Location currentLocation = new Location(0,1,Direction.N);
        //then
        assertEquals(currentLocation.getLocationX(),marsRover.getLocation().getLocationX());
        assertEquals(currentLocation.getLocationY(),marsRover.getLocation().getLocationY());
        assertEquals(currentLocation.getDirection(),marsRover.getLocation().getDirection());
    }

    @Test
    void should_move_when_executeCommand_given_M_Direction_S() {
        //given
        MarsRover marsRover = new MarsRover(new Location(0,0,Direction.S));
        //when
        marsRover.executeCommand("S");
        Location currentLocation = new Location(0,-1,Direction.S);
        //then
        assertEquals(currentLocation.getLocationX(),marsRover.getLocation().getLocationX());
        assertEquals(currentLocation.getLocationY(),marsRover.getLocation().getLocationY());
        assertEquals(currentLocation.getDirection(),marsRover.getLocation().getDirection());
    }
}
