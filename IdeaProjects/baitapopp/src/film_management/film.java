package film_management;

public class film {
    private String nameFlim;
    private int year_of_manufacture;
    private double cost;
    private show_date show_date;
    private manufacturer manufacturer;

    public film(String nameFlim, int year_of_manufacture, double cost, show_date show_date, manufacturer manufacturer){
        this.nameFlim = nameFlim;
        this.year_of_manufacture = year_of_manufacture;
        this.cost = cost;
        this.show_date = show_date;
        this.manufacturer = manufacturer;
    }

    public String getNameFlim() {
        return nameFlim;
    }

    public int getYear_of_manufacture() {
        return year_of_manufacture;
    }

    public double getCost() {
        return cost;
    }

    public show_date getShow_date() {
        return show_date;
    }

    public manufacturer getManufacturer() {
        return manufacturer;// trả về
    }

    public void setNameFlim(String nameFlim) {
        this.nameFlim = nameFlim;
    }

    public void setYear_of_manufacture(int year_of_manufacture) {
        this.year_of_manufacture = year_of_manufacture;
    }

    public void setCost(double cost) {
        this.cost = cost;
    }

    public void setShow_date(film_management.show_date show_date) {
        this.show_date = show_date;
    }

    public void setManufacturer(film_management.manufacturer manufacturer) {
        this.manufacturer = manufacturer;
    }
    public String toString() {
        return "film{" +
                "nameFlim='" + nameFlim + '\'' +
                ", year_of_manufacture=" + year_of_manufacture +
                ", cost=" + cost +
                ", show_date=" + show_date +
                ", manufacturer=" + manufacturer +
                '}';
    }
    public boolean checkCost(film get){
        return this.cost < get.cost;
        }
    public double sale(){
        return cost - (cost * 0.2);
    }
}
