package ex3_BookManagementSystem;
import java.util.Scanner;
import java.util.Arrays;

public class Book implements IBook{
    private int id;
    private String name;
    private String publishDate;
    private String author;
    private String language;
    private float averagePrice;
    public int []PriceList = new int[5];
    static Scanner key = new Scanner(System.in);
    public Book(){}
    public Book(int id, String name, String publishDate, String author, String language,int []PriceList ){
        this.id = id;
        this.name = name;
        this.publishDate = publishDate;
        this.author = author;
        this.language = language;
        this.averagePrice = averagePrice;
        this.PriceList = PriceList;

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

    public String getPublishDate() {
        return publishDate;
    }

    public void setPublishDate(String publishDate) {
        this.publishDate = publishDate;
    }

    public String getAuthor() {
        return author;
    }

    public void setAuthor(String author) {
        this.author = author;
    }

    public String getLanguage() {
        return language;
    }

    public void setLanguage(String language) {
        this.language = language;
    }

    public float getAveragePrice() {
        return averagePrice;
    }

    public void setAveragePrice(float averagePrice) {
        this.averagePrice = averagePrice;
    }

    public int[] getPriceList() {
        return PriceList;
    }

    public void setPriceList(int[] priceList) {
        PriceList = priceList;
    }

    @Override
    public String toString() {
        return "Book{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", publishDate='" + publishDate + '\'' +
                ", author='" + author + '\'' +
                ", language='" + language + '\'' +
                ", averagePrice=" + averagePrice +
                ", PriceList=" + Arrays.toString(PriceList) +
                '}';
    }

    public void display(){
        System.out.println("Print out all name, publishDay, author, language, averagePrice ");
        System.out.println(this.name + " "+ this.publishDate + " " +this.author+" "+this.language+" "+this.averagePrice+ " ");
    }

    public float calculate(){

        for(int a : PriceList){
            averagePrice += a;
        }
        return averagePrice = averagePrice / PriceList.length;
    }

}