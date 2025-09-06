package com.afs.tdd;

public class MarsRover {
    private  final Location location;
    MarsRover(Location location) {
        this.location = location;
    }
    public  Location getLocation() {
        return location;
    }
    public  void executeCommand(String command) {
        if(command.equals("M")){
            moveForward();
        } else if (command.equals("L")) {
            turnLeft();
        } else if (command.equals("R")) {
            turnRight();
        }else if(command.equals("B")){
             moveBackward();
        }
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
