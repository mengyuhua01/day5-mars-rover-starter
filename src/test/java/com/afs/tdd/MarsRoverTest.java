package com.afs.tdd;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertThrows;

class MarsRoverTest {
    @Test
    void should_move_when_executeCommands_given_M_Direction_N() {
        //given
        MarsRover marsRover = new MarsRover(new Location(0,0,Direction.N));
        //when
        marsRover.executeCommands("M");
        Location expectedLocation = new Location(0,1,Direction.N);
        //then
        assertEquals(expectedLocation, marsRover.getLocation());
    }

    @Test
    void should_move_when_executeCommands_given_M_Direction_S() {
        //given
        MarsRover marsRover = new MarsRover(new Location(0,0,Direction.S));
        //when
        marsRover.executeCommands("M");
        Location expectedLocation = new Location(0,-1,Direction.S);
        //then
        assertEquals(expectedLocation, marsRover.getLocation());
    }

    @Test
    void should_move_when_executeCommands_given_M_Direction_E() {
        //given
        MarsRover marsRover = new MarsRover(new Location(0,0,Direction.E));
        //when
        marsRover.executeCommands("M");
        Location expectedLocation = new Location(1,0,Direction.E);
        //then
        assertEquals(expectedLocation, marsRover.getLocation());
    }
    @Test
    void should_move_when_executeCommands_given_M_Direction_W() {
        //given
        MarsRover marsRover = new MarsRover(new Location(0,0,Direction.W));
        //when
        marsRover.executeCommands("M");
        Location expectedLocation = new Location(-1,0,Direction.W);
        //then
        assertEquals(expectedLocation, marsRover.getLocation());
    }
    @Test
    void should_turn_left_90_degrees_when_executeCommands_given_L_Direction_N() {
        //given
        MarsRover marsRover = new MarsRover(new Location(0,0,Direction.N));
        //when
        marsRover.executeCommands("L");
        Location expectedLocation = new Location(0,0,Direction.W);
        //then
        assertEquals(expectedLocation, marsRover.getLocation());
    }

    @Test
    void should_turn_left_90_degrees_when_executeCommands_given_L_Direction_S() {
        //given
        MarsRover marsRover = new MarsRover(new Location(0,0,Direction.S));
        //when
        marsRover.executeCommands("L");
        Location expectedLocation = new Location(0,0,Direction.E);
        //then
        assertEquals(expectedLocation, marsRover.getLocation());
    }
    @Test
    void should_turn_left_90_degrees_when_executeCommands_given_L_Direction_E() {
        //given
        MarsRover marsRover = new MarsRover(new Location(0,0,Direction.E));
        //when
        marsRover.executeCommands("L");
        Location expectedLocation = new Location(0,0,Direction.N);
        //then
        assertEquals(expectedLocation, marsRover.getLocation());
    }
    @Test
    void should_turn_left_90_degrees_when_executeCommands_given_L_Direction_W() {
        //given
        MarsRover marsRover = new MarsRover(new Location(0,0,Direction.W));
        //when
        marsRover.executeCommands("L");
        Location expectedLocation = new Location(0,0,Direction.S);
        //then
        assertEquals(expectedLocation, marsRover.getLocation());
    }
    @Test
    void should_turn_right_90_degrees_when_executeCommands_given_R_Direction_N() {
        //given
        MarsRover marsRover = new MarsRover(new Location(0,0,Direction.N));
        //when
        marsRover.executeCommands("R");
        Location expectedLocation = new Location(0,0,Direction.E);
        //then
        assertEquals(expectedLocation, marsRover.getLocation());
    }
    @Test
    void should_turn_right_90_degrees_when_executeCommands_given_R_Direction_S() {
        //given
        MarsRover marsRover = new MarsRover(new Location(0,0,Direction.S));
        //when
        marsRover.executeCommands("R");
        Location expectedLocation = new Location(0,0,Direction.W);
        //then
        assertEquals(expectedLocation, marsRover.getLocation());
    }
    @Test
    void should_turn_right_90_degrees_when_executeCommands_given_R_Direction_E() {
        //given
        MarsRover marsRover = new MarsRover(new Location(0,0,Direction.E));
        //when
        marsRover.executeCommands("R");
        Location expectedLocation = new Location(0,0,Direction.S);
        //then
        assertEquals(expectedLocation, marsRover.getLocation());
    }
    @Test
    void should_turn_right_90_degrees_when_executeCommands_given_R_Direction_W() {
        //given
        MarsRover marsRover = new MarsRover(new Location(0,0,Direction.W));
        //when
        marsRover.executeCommands("R");
        Location expectedLocation = new Location(0,0,Direction.N);
        //then
        assertEquals(expectedLocation, marsRover.getLocation());
    }
    @Test
    void should_move_backward_when_executeCommands_given_B_Direction_N() {
        //given
        MarsRover marsRover = new MarsRover(new Location(0,0,Direction.N));
        //when
        marsRover.executeCommands("B");
        Location expectedLocation = new Location(0,-1,Direction.N);
        //then
        assertEquals(expectedLocation, marsRover.getLocation());
    }
    @Test
    void should_move_backward_when_executeCommands_given_B_Direction_S() {
        //given
        MarsRover marsRover = new MarsRover(new Location(0,0,Direction.S));
        //when
        marsRover.executeCommands("B");
        Location expectedLocation = new Location(0,1,Direction.S);
        //then
        assertEquals(expectedLocation, marsRover.getLocation());
    }
    @Test
    void should_move_backward_when_executeCommands_given_B_Direction_E() {
        //given
        MarsRover marsRover = new MarsRover(new Location(0,0,Direction.E));
        //when
        marsRover.executeCommands("B");
        Location expectedLocation = new Location(-1,0,Direction.E);
        //then
        assertEquals(expectedLocation, marsRover.getLocation());
    }
    @Test
    void should_move_backward_when_executeCommands_given_B_Direction_W() {
        //given
        MarsRover marsRover = new MarsRover(new Location(0,0,Direction.W));
        //when
        marsRover.executeCommands("B");
        Location expectedLocation = new Location(1,0,Direction.W);
        //then
        assertEquals(expectedLocation, marsRover.getLocation());
    }
    @Test
    void should_execute_multiple_commands_and_get_correct_location() {
        //given
        MarsRover marsRover = new MarsRover(new Location(0, 0, Direction.N));
        //when
        marsRover.executeCommands("MMLRB");
        Location expectedLocation = new Location(0, 1, Direction.N);
        //then
        assertEquals(expectedLocation, marsRover.getLocation());
    }
    @Test
    void should_throw_exception_when_executeCommands_given_invalid_command() {
        //given
        MarsRover marsRover = new MarsRover(new Location(0, 0, Direction.N));
        //when & then
        IllegalArgumentException exception = assertThrows(IllegalArgumentException.class, () -> marsRover.executeCommands("EMX"));
        assertEquals("Invalid commands: EMX", exception.getMessage());
    }


}
