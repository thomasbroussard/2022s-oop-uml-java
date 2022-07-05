package fr.epita.geometry.launchers;

import fr.epita.geometry.datamodel.Circle;
import fr.epita.geometry.datamodel.Rectangle;
import fr.epita.geometry.datamodel.Square;
import fr.epita.geometry.datamodel.Triangle;

import java.util.Arrays;
import java.util.List;

public class Main {

    public static void main(String[] args) {

        Square square1 = new Square(20);
        Square square2 = new Square(20);
        Square square3 = new Square(20);

        List<Square> squares = Arrays.asList(square1, square2, square3);
        double globalArea = 0;
        for (Square square : squares){
            globalArea = globalArea + square.getArea();
        }


        Triangle triangle1 = new Triangle(10, 20, 30, 20);
        Triangle triangle2 = new Triangle(10,30, 20, 10);
        Triangle triangle3 = new Triangle(10, 60, 10, 10);


        Triangle[] triangles = new Triangle[]{triangle1, triangle2, triangle3};
        for (Triangle triangle : triangles){
            globalArea = globalArea + triangle.getArea();
        }


        Circle circle1 = new Circle(10);
        Circle circle2 = new Circle(11);
        Circle circle3 = new Circle(12);


    }

//    public static double calculateGlobalArea(List<Something> shapes){
//        //to be implemented
//    }
}
