package com.mehdisarf.state.exercise.myquestion;

public class FunClassWithStatePattern {
    private int x;
    private int y;

    private State xyState;

    public FunClassWithStatePattern(int x, int y) {
        this.x = x;
        this.y = y;

        if (x == 1 && y == 1) {
            xyState = new XY();
        } else if (x == 1 && y == 0) {
            xyState = new X();
        } else if (x == 0 && y == 1) {
            xyState = new Y();
        } else if (x == 0 && y == 0) {
            xyState = new Nothing();
        }
    }

    public void print() {
        xyState.handlePrint(); //delegate to xyState to handle the request.
    }

    // implement some business logic.
    public int sum() {
        return x + y;
    }

    public void setX(int x) {
        this.x = x;

        if (x == 1 && this.y == 1) {
            xyState = new XY();
        } else if (x == 1 && this.y == 0) {
            xyState = new X();
        } else if (x == 0 && this.y == 1) {
            xyState = new Y();
        } else if (x == 0 && this.y == 0) {
            xyState = new Nothing();
        }
    }

    public void setY(int y) {
        this.y = y;

        if (this.x == 1 && y == 1) {
            xyState = new XY();
        } else if (this.x == 1 && y == 0) {
            xyState = new X();
        } else if (this.x == 0 && y == 1) {
            xyState = new Y();
        } else if (this.x == 0 && y == 0) {
            xyState = new Nothing();
        }
    }

    public int getX() {
        return x;
    }

    public int getY() {
        return y;
    }

    public State getXyState() {
        return xyState;
    }
}
