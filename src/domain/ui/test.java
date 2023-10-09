package src.domain.ui;

import src.domain.model.*;

public class test {
    public static void main (String[] args){
        var shapes = new Shape[]{
                new Rect (10, 20),
                new Circle (20),
                new Square(15),
                new Elipse (5, 10),
                new Square(10),
        };
        var sumArea=0;
        for (Shape s: shapes){
            sumArea=s.getArea();
        }
        var avgArea = sumArea/ shapes.length;
        System.out.println("Area promedio: " +avgArea);
    }
}
