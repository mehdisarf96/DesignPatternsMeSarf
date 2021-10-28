package com.mehdisarf.state.exercise.solution;

public class DirectionService {

    private TravelState travelState;

    public DirectionService(TravelState travelState) {
        this.travelState = travelState;
    }

    public Object getEta() {
        return travelState.handleGetEta();
    }

    public Object getDirection() {
        return travelState.handleGetDirection();
    }

    public TravelState getTravelMode() {
        return travelState;
    }

    public void setTravelMode(TravelState travelState) {
        this.travelState = travelState;
    }
}
