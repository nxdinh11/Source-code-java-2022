package film_management;

public class show_date {
    private int day;
    private int month;
    private int year;

    public show_date(){

    }

    public show_date(int day, int month, int year){
        if (day >0 && day < 32){
            this.day = day;
        }
        if (month >0 && day < 13){
            this.month = month;
        }
        if (year >0){
            this.year = year;
        }
    }
    public int getDay(){
        return this.day;
    }
    public void setDay(int day){
        this.day = day;
    }

    public void setMonth(int month) {
        this.month = month;
    }

    public int getMonth() {
        return month;
    }

    public void setYear(int year) {
        this.year = year;
    }

    public int getYear() {
        return year;
    }

    @Override
    public String toString() {
        return "show_date{" + "day=" + day + ", month=" + month + ", year=" + year + '}';
    }
}
