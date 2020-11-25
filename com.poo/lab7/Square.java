package com.oop.lab7;

public class Square extends Figure {
    float a;

    Square(float _a) {
        a = _a;
    }

    float getPerimeter() {
        return a * 4;
    }

    float getArea() {
        return a * a;
    }
}