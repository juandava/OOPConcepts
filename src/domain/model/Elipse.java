package src.domain.model;

public class Elipse extends Circle{
    private int radious2 = 0;
    public int getRadious2() {
        return radious2;
    }
    public void setRadious2 (int newRadious2){
        if (newRadious2 >= 0)
            radious2= newRadious2;
    }
    @Override
    public int getArea(){
        return (int) (Math.PI*getRadius()*getRadious2());
    }

    @Override
    public int getPerimeter(){
        return (int) (2 * Math.PI * Math.sqrt((double) (getRadius() * getRadius() + getRadious2() *getRadious2()) / 2));
    }

    public Elipse (int newX, int newY, int newRadius,int newRadius2){
        super(newX,newY, newRadius2);
        setRadius (newRadius2);

    }
    public Elipse (int newRadius, int newRadius2){
        this (0,0,newRadius, newRadius2);
    }
}
