package com.oop.lab5;

public class C extends B{
    protected String c;

    C(String _A, X _X) {
        super(_A, _X);
        c = _A;
    }

    @Override
    public String toString() {
        return "C{" +
                "c='" + c + '\'' +
                "}\n" + super.toString();
    }
}
