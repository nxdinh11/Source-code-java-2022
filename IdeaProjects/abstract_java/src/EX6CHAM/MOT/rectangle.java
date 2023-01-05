package EX6CHAM.MOT;

public class rectangle extends shape {
    private double width = 1.0;
    private double length = 1.0;

    public rectangle(){}
    public rectangle(double width, double length){
        this.width = width;
        this.length = length;
    }
    public rectangle(String colored, boolean isFill, double width, double length){
        super(colored, isFill);
        this.width = width;
        this.length = length;
    }

    public double getWidth() {
        return width;
    }

    public void setWidth(double width) {
        this.width = width;
    }

    public double getLength() {
        return length;
    }

    public void setLength(double length) {
        this.length = length;
    }

    @Override
    public String toString() {
        return "rectangle{" +
                "width=" + width +
                ", length=" + length +
                '}';
    }

    @Override
    public double getArea() {
        return 0;
    }

    @Override
    public double getParameter() {
        return 0;
    }

}
