package fr.epita.geometry.datamodel;

public class Parallelogram extends AbstractShape implements IShape {

    private double height;
    private double width;

    public Parallelogram(double height, double width) {
        this.height = height;
        this.width = width;
    }

    public double getHeight() {
        return height;
    }

    public double getWidth(){
        return width;
    }

    public double getArea(){
        return this.height * this.width;
    }

    public double getPerimeter(){
        return this.height * 2 + this.width * 2;
    }

}
