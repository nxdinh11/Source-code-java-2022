package EX6CHAM.MOT;

public abstract class shape {
    private String color = "red";
    private Boolean isFilled = true;
    public shape(){}
    public shape(String color, Boolean isFilled){
        this.color = color;
        this.isFilled = isFilled;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public Boolean getFilled() {
        return isFilled;
    }

    public void setFilled(Boolean filled) {
        isFilled = filled;
    }

    @Override
    public String toString() {
        return "shape{" +
                "color='" + color + '\'' +
                ", isFilled=" + isFilled +
                '}';
    }
    public abstract double getArea();
    public abstract double getParameter();


}
