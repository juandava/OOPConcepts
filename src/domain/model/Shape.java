package src.domain.model;

public class Shape {
    private int x = 0;
    private int y = 0;
   public Shape(int newX, int newY){  //método constructor
       setX(newX);
       setY(newY);

    }
    public Shape(){

    }

    public void setX(int newX){
        if (newX >=0 && newX <=1000)
        x=newX;
    }
    public int getX(){
        return x;
    }
    public void setY(int newY){
        if (newY >=0 && newY <=1000)
            x=newY;
    }
    public int getY(){
        return y;
    }


}
