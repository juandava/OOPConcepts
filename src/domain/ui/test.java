package src.domain.ui;

import src.domain.model.Shape;
import src.domain.model.Square;

public class test {
    public static void main (String[] args){
        var Square = new Square(); //constructor - Instancia
        Square.setX(50);
        Square.setWidth(-100);
        System.out.println(Square.getWidth());
        System.out.println(Square.getX());


        //var Shape1 = new Shape(-200,10);
        //var Shape2 = new Shape(20,1500);
        //System.out.println("Ins #1 x = "+Shape1.x+ " y = "+Shape1.y);
        //System.out.println("Ins #2 x = "+Shape2.x+ " y = "+Shape2.y);

        //System.out.println("Sum Ins#1 = "+Shape1.getAdd());
        //System.out.println("Sum Ins#2 = "+Shape2.getAdd());

        //Shape1.setX(-200);
        //System.out.println(Shape1.getX());

    }

}
