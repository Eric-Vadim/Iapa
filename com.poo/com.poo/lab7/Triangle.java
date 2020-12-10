package com.oop.lab7;

public class Triangle extends Figure {
    float a, b, c;

    Triangle(float _a, float _b, float _c) {
        a = _a;
        b = _b;
        c = _c;
    }

    float getPerimeter() {
        return a + b + c;
    }

    float getArea() {
        float s = getPerimeter() / 2;
        return (float) Math.sqrt(s * (s - a) * (s - b) * (s - c));
    }
}
