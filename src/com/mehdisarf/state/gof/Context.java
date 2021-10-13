package com.mehdisarf.state.gof;

public class Context {

    private State state;

    public void request() { // want to behave differently based on 'state'.
        state.handle(); // delegates to 'state' to handle.
    }

    public State getState() {
        return this.state;
    }

    public void setState(State state) {
        this.state = state;
    }
}
