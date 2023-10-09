package src.domain.model;

public class Rect extends Square{
    private int height = 0;

    @Override
    public int getHeight() {
        return height;
    }
    @Override
    public void setHeight (int newHeight){
        if (newHeight >= 0)
            height= newHeight;
    }
    @Override
    public int getArea(){
        return getWidth()*getHeight();
    }

    @Override
    public int getPerimeter(){
        return (2*getWidth()+2*getHeight());
    }
    public Rect (int newX, int newY, int newWidht, int newHeight){
        super (newX, newY, newWidht);
        setWidth(newHeight);
    }
    public Rect (int newWidht, int newHeight){

        this (0,0,newWidht, newHeight);
    }
}
