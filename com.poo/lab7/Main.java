package com.oop.lab7;

import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {
        Square square = new Square(10);
        Rectangle rectangle = new Rectangle(3,4);
        Triangle triangle = new Triangle(4,5, 3);

        ArrayList<Figure> figure = new ArrayList<>();

        figure.add(square);
        figure.add(rectangle);
        figure.add(triangle);

        System.out.println(FigureController.getBiggestArea(figure).getClass().getName());
        System.out.println(FigureController.getBiggestPerimeter(figure).getClass().getName());

        Figure circle = new Figure(){
            private final float r = 10F;

            float getArea(){
                return (float) (Math.PI * r*r);
            }

            float getPerimeter(){
                return (float) (2 * Math.PI * r);
            }

        };

        System.out.println(circle.getPerimeter());
        System.out.println(circle.getArea());

        figure.add(circle);

        System.out.println(FigureController.getBiggestArea(figure).getClass().getName());
        System.out.println(FigureController.getBiggestPerimeter(figure).getClass().getName());
    }
}
