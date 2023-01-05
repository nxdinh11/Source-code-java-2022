package EX6CHAM.MOT;

public class circle extends shape {
    private double radius =1.0;
    public circle(){}
    public circle(String color , boolean isFilled, double radius){
        super(color, isFilled);
        this.radius = radius;
    }

    public double getRadius() {
        return radius;
    }

    public void setRadius(double radius) {
        this.radius = radius;
    }
    public double getArea(){
        return this.radius * this.radius * 3.1416;
    }
    public double getParameter(){
        return this.radius * 2*3.1416;
    }
}
