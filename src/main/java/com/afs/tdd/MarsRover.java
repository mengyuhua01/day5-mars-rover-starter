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
            move();
        } else if (command.equals("L")) {
            turnLeft();
        } else if (command.equals("R")) {
            turnRight();
        }
    }
    private void move(){
        Direction direction = location.getDirection();
        if(direction == Direction.N){
            this.location.setLocationY(location.getLocationY()+1);
        } else if (direction == Direction.S) {
            this.location.setLocationY(location.getLocationY()-1);
        } else if (direction == Direction.E) {
            this.location.setLocationX(location.getLocationX()+1);
        }else  if (direction == Direction.W){
            this.location.setLocationX(location.getLocationX()-1);
        }
    }
    private void turnLeft(){
        this.location.setDirection(location.getDirection().turnLeft());
    }
    private void turnRight(){
        this.location.setDirection(location.getDirection().turnRight());
    }
}
