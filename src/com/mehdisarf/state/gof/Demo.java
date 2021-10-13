package com.mehdisarf.state.gof;

public class Demo {
    public static void main(String[] args) {

        Context context = new Context();

        context.setA(new FirstConcreteA());
        context.request();

        context.setA(new SecondConcreteA());
        context.request();
    }
}
