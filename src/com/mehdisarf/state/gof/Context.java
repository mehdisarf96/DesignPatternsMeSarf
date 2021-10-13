package com.mehdisarf.state.gof;

public class Context {

    private A a;

    public void request(){ // want to behave differently based on 'a'.
        a.handle(); // delegates to 'A a' to handle.
    }

    public A getA() {
        return a;
    }

    public void setA(A a) {
        this.a = a;
    }
}
