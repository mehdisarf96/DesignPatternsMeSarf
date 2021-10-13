package com.mehdisarf.state.gof;

public class ConcreteStateA implements State {
    @Override
    public void handle() {
        System.out.println("First :D");
    }
}
