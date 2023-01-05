package ex2_INews;


import java.util.Arrays;
import java.util.Scanner;

public class News implements Inews {
    private int id;
    private String title;
    private String publishDate;
    private String author;
    private String Content;
    private float averageRate;
    private int []rateList = new int[3];

    public static Scanner key = new Scanner(System.in);

    public News(){}

    public News(int id, String title, String publishDate, String author, String content, int []rateList) {
        this.id = id;
        this.title = title;
        this.publishDate = publishDate;
        this.author = author;
        Content = content;
        this.averageRate = averageRate;
        this.rateList = rateList;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
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

    public String getContent() {
        return Content;
    }

    public void setContent(String content) {
        Content = content;
    }

    public float getAverageRate() {
        return averageRate;
    }

    public int[] getRateList() {
        return rateList;
    }

    public void setRateList(int[] rateList) {
        this.rateList = rateList;
    }

    @Override
    public String toString() {
        return "News{" +
                "id=" + id +
                ", title='" + title + '\'' +
                ", publishDate='" + publishDate + '\'' +
                ", author='" + author + '\'' +
                ", Content='" + Content + '\'' +
                ", averageRate=" + averageRate +
                ", rateList=" + Arrays.toString(rateList) +
                '}';
    }

    public void Display(){
        System.out.println("Title " + this.title);
        System.out.println("pulishDate "+ this.publishDate);
        System.out.println("author " + this.author);
        System.out.println("content " + this.Content);
        System.out.println("averageRate " + this.averageRate );
    }
    public float calculate(){
        for(int obj : rateList){
            this.averageRate += obj;
        }
        return this.averageRate /= rateList.length;
    }
}
