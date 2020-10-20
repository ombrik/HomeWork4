package com.company;

public class Main {

    public static void main(String[] args) {

        Rectangle cube1 = new Rectangle(2);
        Rectangle cube2 = new Rectangle(4,6);
        Rectangle cube3 = new Rectangle(4,6);

        cube1.printArea();
        cube2.printArea();
        cube3.printArea();


        System.out.println(cube1.isTheSameRectangle(cube2));
        System.out.println(cube1.isTheSameRectangle(cube3));
        System.out.println(cube2.isTheSameRectangle(cube3));


    }
}
