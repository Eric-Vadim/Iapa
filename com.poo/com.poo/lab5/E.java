package com.oop.lab5;

public class E extends D{
    protected String e;

    E(String _A, X _X) {
        super(_A, _X);
        e = _A;
    }

    @Override
    public String toString() {
        return "E{" +
                "e='" + e + '\'' +
                "}\n" + super.toString();
    }
}