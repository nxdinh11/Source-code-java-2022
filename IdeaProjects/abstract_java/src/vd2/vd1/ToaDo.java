package vd2.vd1;

public class ToaDo{
    private int x,y;
    public ToaDo (){}
    public ToaDo(int x, int y){
        this.x = x;
        this.y = y;
    }
    public int getX(){
        return this.x;
    }
    public int getY(){
        return this.y;
    }
    public void setX(int x){
        this.x = x;
    }
    public void sety(int y){
        this.y = y;
    }
    public String toString(){
        return "ToaDo = ("+ "x = "+ this.x + "and y = " + this.y  +  ")";
    }

}