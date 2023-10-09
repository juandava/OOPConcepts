package src.domain.model;

public class Triangle extends Shape{

    private int sideSize1 = 0;
    private int sideSize2 = 0;
    private int sideSize3 = 0;

    public int getSideSize1 (){
        return sideSize1;
    }
    public void setSideSize1 (int newSideSize){
        if (newSideSize>= 0)
            sideSize1 = newSideSize;
    }
    public int getSideSize2 (){
        return sideSize1;
    }
    public void setSideSize2 (int newSideSize2){
        if (newSideSize2>= 0)
            sideSize2 = newSideSize2;
    }
    public int getSideSize3 (){
        return sideSize3;
    }
    public void setSideSize3 (int newSideSize3){
        if (newSideSize3>= 0)
            sideSize3 = newSideSize3;
    }
    @Override
    public int getArea(){
        double semiperimetro= (getSideSize1() + getSideSize2() + getSideSize3()) / 2.0;
        return (int) Math.sqrt((semiperimetro * (semiperimetro - getSideSize1()) * (semiperimetro - getSideSize2()) * (semiperimetro - getSideSize3())));
    }

    @Override
    public int getPerimeter(){
        return (int) (getSideSize1() + getSideSize2() + getSideSize3());
    }


}
