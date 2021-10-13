package com.mehdisarf.state.gof;

public class Demo {
    public static void main(String[] args) {

        Context context = new Context();

        context.setState(new ConcreteStateA());
        context.request();

        context.setState(new ConcreteStateB());
        context.request();
    }
}
