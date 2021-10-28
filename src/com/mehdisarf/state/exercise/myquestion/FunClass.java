package com.mehdisarf.state.exercise.myquestion;

public class FunClass {
    private int x;
    private int y;

    public FunClass(int x, int y) {
        this.x = x;
        this.y = y;
    }

    public void print() {
        if (x == 1 && y == 1) {
            System.out.println("XY");
        } else if (x == 1 && y == 0) {
            System.out.println("X");
        } else if (x == 0 && y == 1) {
            System.out.println("Y");
        } else if (x == 0 && y == 0) {
            System.out.println("nothing");
        }
    }

    // implement some business logic.
    public int sum() {
        return x + y;
    }

    public int getX() {
        return x;
    }

    public void setX(int x) {
        this.x = x;
    }

    public int getY() {
        return y;
    }

    public void setY(int y) {
        this.y = y;
    }
}