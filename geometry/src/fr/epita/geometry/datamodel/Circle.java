package fr.epita.geometry.datamodel;

public class Circle extends AbstractShape implements IShape{

    private double radius;

    public Circle(double radius) {
        this.radius = radius;
    }

    public double getRadius() {
        return radius;
    }


    public double getArea(){
        return Math.PI * this.radius * this.radius;
    }

    public double getPerimeter(){
        return Math.PI * 2 * this.radius;
    }


    @Override
    public String toString() {
        return "Circle{" +
                "radius=" + radius +
                '}';
    }
}
