package src.domain.model;

public class Square extends Shape {
    private int Width = 0;
    public int getWidth (){
        return Width;
    }
    public void setWidth (int newWidth){
        if (newWidth >= 0)
            Width = newWidth;
    }
    public int getHeight (){
        return getWidth();
    }
    public void setHeight (int newHeight){
        setWidth(newHeight);
    }

}
