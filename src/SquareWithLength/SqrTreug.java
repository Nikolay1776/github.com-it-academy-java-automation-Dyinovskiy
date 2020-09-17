package SquareWithLength;

public class SqrTreug extends Shape {
    private double a;
    private double b;
    private double c;
    private double h;

    public SqrTreug(double a, double h) {
        this.a = a;
        this.h =h;
    }

    public double sqr() {

        return a*h/2;
    }
    public double length() {

        return a + b + c;
    }
}
