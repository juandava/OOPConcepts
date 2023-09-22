package src.domain.model;

public class Rect extends Square{
    private int Height = 0;

    @Override
    public int getHeight() {
        return Height;
    }
    @Override
    public void setHeight (int newHeight){
        if (newHeight >= 0)
            Height= newHeight;
        aaaa

    }
}
