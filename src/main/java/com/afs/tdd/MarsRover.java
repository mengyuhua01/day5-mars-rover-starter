package com.afs.tdd;

public class MarsRover {
    private  final Location location;
    public MarsRover(Location location) {
        this.location = location;
    }
    public  Location getLocation() {
        return location;
    }
    public void executeCommands(String commands){
        if (!isCommandsValid(commands)){
            throw  new IllegalArgumentException("Invalid commands: " + commands);
        }
        for(char command : commands.toCharArray()){
            executeCommand(command);
        }
    }
    private  void executeCommand(char command) {
        switch (command) {
            case 'M' -> moveForward();
            case 'B' -> moveBackward();
            case 'L' -> turnLeft();
            case 'R' -> turnRight();
        }
    }
    private boolean isCommandsValid(String commands){
        return commands.matches("[MBLR]*");
    }
    private void moveForward(){
        int[] movement = location.getDirection().getMovement();
        location.setLocationX(location.getLocationX() + movement[0]);
        location.setLocationY(location.getLocationY() + movement[1]);
    }

    private void moveBackward() {
        int[] movement = location.getDirection().getBackwardMovement();
        location.setLocationX(location.getLocationX() + movement[0]);
        location.setLocationY(location.getLocationY() + movement[1]);
    }

    private void turnLeft(){
        this.location.setDirection(location.getDirection().turnLeft());
    }

    private void turnRight(){
        this.location.setDirection(location.getDirection().turnRight());
    }
}
