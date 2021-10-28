package com.mehdisarf.state.exercise.solution;

public class Walking implements TravelState {
    @Override
    public Object handleGetEta() {
        System.out.println("Calculating ETA (walking)");
        return 4;
    }

    @Override
    public Object handleGetDirection() {
        System.out.println("Calculating Direction (walking)");
        return 4;
    }
}
