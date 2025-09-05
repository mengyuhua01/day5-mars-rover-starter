package com.afs.tdd;

public enum Direction {
    N, E, S, W;
    public Direction turnLeft(){
        return switch (this){
            case N -> W;
            case S -> E;
            case E -> N;
            case W -> S;
        };
    }
}
