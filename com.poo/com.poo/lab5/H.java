package com.oop.lab5;

public class H extends G{
    protected String h;
    private final X x = new X("420420");

    H(String _A, X _X) {
        super(_A, _X);
        h = _A;
    }

    @Override
    public String toString() {
        return "H{" +
                "h='" + h + "'|"  + x.toString() +
                "}\n" + super.toString();
    }
}