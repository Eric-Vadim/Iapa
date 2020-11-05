package com.oop.lab5;

public class G extends F{
    protected String g;

    G(String _A, X _X) {
        super(_A, _X);
        g = _A;
    }

    @Override
    public String toString() {
        return "G{" +
                "g='" + g + '\'' +
                "}\n" + super.toString();
    }
}
