package com.oop.lab5;

public class F extends E {
    protected String f;

    F(String _A, X _X) {
        super(_A, _X);
        f = _A;
    }

    @Override
    public String toString() {
        return "F{" +
                "f='" + f + '\'' +
                "}\n" + super.toString();
    }
}