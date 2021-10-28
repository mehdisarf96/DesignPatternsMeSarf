package com.mehdisarf.state.exercise.solution;

public class Bicycling implements TravelState {
    @Override
    public Object handleGetEta() {
        System.out.println("Calculating ETA (bicycling)");
        return 2;
    }

    @Override
    public Object handleGetDirection() {
        System.out.println("Calculating Direction (bicycling)");
        return 2;
    }
}
