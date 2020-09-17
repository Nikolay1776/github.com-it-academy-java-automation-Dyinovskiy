package SquareWithLength;

public class SqrPramoug extends Shape{
    private double w;
    private double h;

    public SqrPramoug(double w, double h) {
        this.w = w;
        this.h =h;
    }

     public double sqr() {

               return w*h;
    }
   /* public double length() {

        return (w + h) *2;
    }

    */
}
