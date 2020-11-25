package com.oop.lab5;

public class B extends A {
    protected String b;

    B(String _A, X _X) {
        super(_A, _X);
        b = _A;
    }

    public String toString() {
        return "B{" +
                "b='" + b + '\'' +
                "}\n" + super.toString();
    }
}