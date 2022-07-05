package fr.epita.geometry.datamodel;

public class Triangle {

    private double sideA;
    private double sideB;
    private double height;
    private double base;

    public Triangle(double sideA, double sideB, double height, double base) {
        this.sideA = sideA;
        this.sideB = sideB;
        this.height = height;
        this.base = base;
    }

    public double getSideA() {
        return sideA;
    }

    public double getSideB() {
        return sideB;
    }

    public double getHeight() {
        return height;
    }

    public double getBase() {
        return base;
    }


    public double getPerimeter(){
        return this.sideA + this.sideB + this.base;
    }

    public double getArea(){
        return this.base * this.height / 2 ;
    }

}
