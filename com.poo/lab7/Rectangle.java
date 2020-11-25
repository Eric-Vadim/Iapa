package com.oop.lab7;

public class Rectangle extends Figure {
    float a, b;

    Rectangle(float _a, float _b) {
        a = _a;
        b = _b;
    }

    float getPerimeter() {
        return (a + b) * 2;
    }

    float getArea() {
        return a * b;
    }
}