package com.company;

public class Rectangle {
    double x;
    double y;

    Rectangle(double x, double y) {
        this.x = x;
        this.y = y;

    }

    Rectangle(double cube) {
        x = cube;
        y = cube;

    }

    double calculateArea() {

        return x * y;
    }

    void printArea() {
        System.out.println("Площадь данного прямоугольника " + calculateArea());
    }

    boolean isTheSameRectangle(Rectangle v){
        return x==v.x && y==v.y;

    }


}
