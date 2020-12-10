package com.oop.lab5;

public class D extends C{
    protected String d;
    protected X x = new X("696969");

    D(String _A, X _X) {
        super(_A, _X);
        d = _A;
    }

    @Override
    public String toString() {
        return "D{" +
                "d='" + d + "'|"  + x.toString() +
                "}\n" + super.toString();
    }
}