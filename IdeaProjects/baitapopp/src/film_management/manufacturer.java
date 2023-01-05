package film_management;

public class manufacturer {
    private String manufacturer_name;//= nguyen xuan dinh
    private String national;//viet nam

    public manufacturer(){

    }
    public manufacturer(String manufacturer_name, String national){
        this.manufacturer_name = manufacturer_name;
        this.national = national;
    }

    public void setManufacturer_name(String manufacturer_name){
        this.manufacturer_name  = manufacturer_name;
    }

    public String getNational() {
        return national;
    }
    public String getManufacturer_name(){
        return manufacturer_name;
    }

    public void setNational(String national) {
        this.national = national;
    }
    public String toString(){
        return " " + this.manufacturer_name + this.national + " ";
    }

}
