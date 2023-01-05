package muaban;

public class car {
    private int id;
    private String name;
    private double price;
    private double extraOut;
    private int quantity;
    public car(){}

    public car(int id, String name, double price, double extraOut, int quantity) {
        this.id = id;
        this.name = name;
        this.price = price;
        this.extraOut = extraOut;
        this.quantity = quantity;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    public double getExtraOut() {
        return extraOut;
    }

    public void setExtraOut(double extraOut) {
        this.extraOut = extraOut;
    }

    public int getQuantity() {
        return quantity;
    }

    public void setQuantity(int quantity) {
        this.quantity = quantity;
    }
    public String inThongTin(){
        return "car [" +"id "+this.id + ", name " + this.name + ", price "  +this.price + ", extraOut " + this.extraOut + ", quantity "+ this.quantity   +"]";
    }

    public double priceForSale(){
        double gia = 0;
        if(this.quantity >= 50){
            gia = this.price + this.extraOut + this.extraOut * 0.1;
        }
        else
            gia = this.price + this.extraOut;
        return gia;
    }
}