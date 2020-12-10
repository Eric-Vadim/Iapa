package com.oop.lab5;

public class I extends H {
    protected String i;

    I(String _A, X _X) {
        super(_A, _X);
        i = _A;
    }

    @Override
    public String toString() {
        return "I{" +
                "i='" + i + '\'' +
                "}\n" + super.toString();
    }
}
