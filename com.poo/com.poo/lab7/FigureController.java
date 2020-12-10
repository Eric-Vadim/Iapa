package com.oop.lab7;

import java.util.ArrayList;

public class FigureController {

    static Figure getBiggestArea(ArrayList<Figure> figures){
        Figure result = null;
        for (Figure figure : figures) {
            if (result == null) {
                result = figure;
            }
            else if(figure.getArea() > result.getArea()) {
                result = figure;
            }
        }
        return result;
    }

    static Figure getBiggestPerimeter(ArrayList<Figure> figures){
        Figure result = null;
        for (Figure figure : figures) {
            if (result == null) {
                result = figure;
            }
            else if(figure.getPerimeter() > result.getPerimeter()) {
                result = figure;
            }
        }
        return result;
    }

}