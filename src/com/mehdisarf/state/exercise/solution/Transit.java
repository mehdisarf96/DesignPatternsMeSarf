package com.mehdisarf.state.exercise.solution;

public class Transit implements TravelState {
    @Override
    public Object handleGetEta() {
        System.out.println("Calculating ETA (transit)");
        return 3;
    }

    @Override
    public Object handleGetDirection() {
        System.out.println("Calculating Direction (transit)");
        return 3;
    }
}
