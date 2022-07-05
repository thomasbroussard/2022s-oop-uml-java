package fr.epita.geometry.launchers;

import fr.epita.geometry.datamodel.*;

import java.util.*;

public class Main {

    public static void main(String[] args) {

        Square square1 = new Square(20);
        Square square2 = new Square(20);
        Square square3 = new Square(20);

        IShape square1AsShape = square1;



        List<IShape> shapes = Arrays.asList(square1, square2, square3);
        double globalArea = 0;


        Triangle triangle1 = new Triangle(10, 20, 30, 20);
        Triangle triangle2 = new Triangle(10,30, 20, 10);
        Triangle triangle3 = new Triangle(10, 60, 10, 10);

        shapes.addAll(Arrays.asList(triangle1, triangle2, triangle3));

        Circle circle1 = new Circle(10);
        Circle circle2 = new Circle(11);
        Circle circle3 = new Circle(12);

        shapes.addAll(Arrays.asList(circle1, circle2, circle3));

        for(IShape shape : shapes){
            globalArea += shape.getArea();
        }

        System.out.println(globalArea);
    }

//    public static double calculateGlobalArea(List<Something> shapes){
//        //to be implemented
//    }
}
