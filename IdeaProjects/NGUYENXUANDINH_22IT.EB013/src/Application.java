public class Application extends Software{
    private double price;
    private double sold;

    public Application(){}
    public Application(String name , double size, int releaseYear, String platform, double price, double sold){
        super(name, size, releaseYear, platform);
        this.price = price;
        this.sold = sold;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    public double getSold() {
        return this.sold;
    }

    public void setSold(double sold) {
        this.sold = sold;
    }

    @Override
    public String toString() {
        return "Application{name= " + getName()+", size  = "+ getSize() + ", releaseYear = "+
                getReleaseYear() +", platform = "+ getPlatform()+ ", price = "+ getPrice() +", sold = " + getSold() + "}";
    }
    public  double discount(){
        if(2022 - getReleaseYear() >4){
            return getPrice() - getPrice() * 0.3;
        }
        else return getPrice() - getPrice() * 0.1;
    }
}
