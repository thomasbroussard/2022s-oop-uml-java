package fr.epita.geometry.datamodel;

public class Rectangle implements IShape {

    private Parallelogram parallelogram;

    public Rectangle(double width, double height){
        this.parallelogram = new Parallelogram(width, height);
    }

    public double getHeight(){
        return this.parallelogram.getHeight();
    }

    public double getWidth(){
        return this.parallelogram.getWidth();
    }

    public double getArea(){
        return this.parallelogram.getArea();
    }

    public double getPerimeter(){
        return this.parallelogram.getPerimeter();
    }

}
