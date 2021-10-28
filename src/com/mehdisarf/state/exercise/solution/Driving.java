package com.mehdisarf.state.exercise.solution;

public class Driving implements TravelState {
    @Override
    public Object handleGetEta() {
        System.out.println("Calculating ETA (driving)");
        return 1;
    }

    @Override
    public Object handleGetDirection() {
        System.out.println("Calculating Direction (driving)");
        return 1;
    }
}
