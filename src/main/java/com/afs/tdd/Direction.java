package com.afs.tdd;

public enum Direction {
    N, E, S, W;
    public Direction turnLeft(){
        switch (this){
            case N : return W;
            default : throw new RuntimeException("Invalid direction");
        }
    }
}
