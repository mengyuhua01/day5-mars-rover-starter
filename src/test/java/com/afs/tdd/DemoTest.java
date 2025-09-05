package com.afs.tdd;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

class DemoTest {
    @Test
    void should_move_when_executeCommand_given_M() {
        //given
        MarsRover marsRover = new MarsRover(new Location(0,0,Direction.N));
        //when
        marsRover.executeCommand(Command.M);
        Location currentLocation = new Location(0,1,Direction.N);
        //then
        assertEquals(currentLocation.getX(),marsRover.getLocation().getX());
        assertEquals(currentLocation.getY(),marsRover.getLocation().getY());
        assertEquals(currentLocation.getDirection(),marsRover.getLocation().getDirection());
    }
}
