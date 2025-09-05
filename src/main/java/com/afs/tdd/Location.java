package com.afs.tdd;

import java.util.Objects;

public class Location {
    private int locationX;
    private int locationY;
    private Direction direction;

    public Location(int locationX, int locationY, Direction direction) {
        this.locationX = locationX;
        this.locationY = locationY;
        this.direction = direction;
    }

    public int getLocationX() {
        return locationX;
    }

    public int getLocationY() {
        return locationY;
    }

    public Direction getDirection() {
        return direction;
    }

    public void setLocationY(int locationY) {
        this.locationY = locationY;
    }

    public void setLocationX(int locationX) {
        this.locationX = locationX;
    }

    public void setDirection(Direction direction) {
        this.direction = direction;
    }
    public boolean equals(Object obj) {
        if (this == obj) return true;
        if (obj == null || getClass() != obj.getClass()) return false;

        Location location = (Location) obj;
        return locationX == location.locationX &&
                locationY == location.locationY &&
                direction == location.direction;
    }
    @Override
    public int hashCode() {
        return Objects.hash(locationX, locationY, direction);
    }

}
