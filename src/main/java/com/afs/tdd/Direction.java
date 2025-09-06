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
    public Direction turnRight(){
        return switch (this){
            case N -> E;
            case S -> W;
            case E -> S;
            case W -> N;
        };
    }
    public int[] getMovement() {
        return switch (this) {
            case N -> new int[]{0, 1};
            case S -> new int[]{0, -1};
            case E -> new int[]{1, 0};
            case W -> new int[]{-1, 0};
        };
    }
    public int[] getBackwardMovement() {
        return switch (this) {
            case N -> new int[]{0, -1};
            case S -> new int[]{0, 1};
            case E -> new int[]{-1, 0};
            case W -> new int[]{1, 0};
        };
    }
}
