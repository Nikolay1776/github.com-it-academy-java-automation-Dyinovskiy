package SquareWithLength;

public class SqrKrug extends Shape{

        private double r;


    public SqrKrug(double r) {
            this.r = r;
        }

        public double sqr() {

            return Math.PI*r*r;
        }
   public double length() {

    return Math.PI*r*2;
}
}
