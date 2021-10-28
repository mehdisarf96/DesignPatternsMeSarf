package com.mehdisarf.state.exercise.solution;

public class Demo {
    public static void main(String[] args) {

        DirectionService service = new DirectionService(new Driving());
        service.getEta();
        service.getDirection();

        service.setTravelMode(new Transit());
        service.getEta();
        service.getDirection();

        service.setTravelMode(new Walking());
        service.getEta();
        service.getDirection();

        service.setTravelMode(new Bicycling());
        service.getEta();
        service.getDirection();
    }
}
