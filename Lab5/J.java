package com.oop.lab5;

public class J extends I{
    protected String j;

    J(String _A, X _X) {
        super(_A, _X);
        j = _A;
    }

    @Override
    public String toString() {
        return "J{" +
                "j='" + super.b + '\'' +
                "}\n" + super.toString();
    }
}