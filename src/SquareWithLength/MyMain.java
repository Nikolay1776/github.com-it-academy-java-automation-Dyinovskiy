package SquareWithLength;

public class MyMain  {

    public static void main(String[] args) {
        Shape[] shapes = new Shape[3];
        shapes[0] = new SqrPramoug(9,5);
        shapes[1] = new SqrTreug(9,12);
        shapes[2] = new SqrKrug(17);

        for (Shape shape : shapes ){
        System.out.println(shape.sqr());
        System.out.println(shape.length());
        }
    }
   }
