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
        }

    }
    private void move(){
        if(location.getDirection() == Direction.N){
            this.location.setLocationY(location.getLocationY()+1);
        }
    }
}
