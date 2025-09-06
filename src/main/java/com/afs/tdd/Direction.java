package com.afs.tdd;

public enum Direction {
    N, E, S, W;
    private static final Direction[] DIRECTIONS = values();

    public Direction turnLeft(){
        return DIRECTIONS[(this.ordinal() + 3) % DIRECTIONS.length];
    }
    public Direction turnRight(){
        return DIRECTIONS[(this.ordinal() + 1) % DIRECTIONS.length];
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
