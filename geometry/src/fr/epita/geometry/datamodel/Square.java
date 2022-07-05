package fr.epita.geometry.datamodel;

public class Square extends Parallelogram {

    private double side;

    public Square(double side) {
        super(side, side);
        this.side = side;
    }

    public double getSide() {
        return side;
    }


    public double getArea() {
        return this.side * this.side; // Math.pow(this.side, 2)
    }

    public double getPerimeter() {
        return 4 * this.side;
    }


}
