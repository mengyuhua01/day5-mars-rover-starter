package com.afs.tdd;

public enum Direction {
    N, E, S, W;
    public Direction turnLeft(){
        switch (this){
            case N : return W;
            case S:  return E;
            default : throw new RuntimeException("Invalid direction");
        }
    }
}
