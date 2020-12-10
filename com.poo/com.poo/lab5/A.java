package com.oop.lab5;

public class A {
    protected String a;
    protected X x = new X("xxx");
    A(String _A, X _X){
        a = _A;
        x = _X;
    }

    @Override
    public String toString() {
        return "A{" +
                "a='" + a + "'|" + x.toString() +
                '}';
    }
}