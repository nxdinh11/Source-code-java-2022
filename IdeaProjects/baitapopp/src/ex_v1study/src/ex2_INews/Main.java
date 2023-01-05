package ex2_INews;


import java.util.ArrayList;
import java.util.Scanner;
public class Main {
    public static Scanner key = new Scanner(System.in);
    static ArrayList<News> arrayList = new ArrayList<>();
    static News news = new News();
    public static void menu(){
        System.out.println("1. Insert news");
        System.out.println("2. View list news");
        System.out.println("3. Average rate");
        System.out.println("4. Exit");
    }
    public static void nhap(){

        int id = 1;
        System.out.println("News "+ id++ );
        key.nextLine();
        System.out.println("Nhap title ");
        String title = key.nextLine();
        System.out.println("Nhap publishDate");
        String publishDate = key.nextLine();
        System.out.println("Nhap author");
        String author = key.nextLine();
        System.out.println("Nhap content");
        String content = key.nextLine();
        System.out.println("Nhap 3 danh gia tu 1 toi 5 sao");
        int []a = new int[news.getRateList().length];
        for(int i = 0; i<a.length; i++){
            a[i] = key.nextInt();
        }
        News news1 = new News(id,title, publishDate, author,content ,a );
        arrayList.add(news1);
    }
        static void inThongTin(){
            for(News obj: arrayList){
                obj.Display();
            }
        }
    static void inThongTin2(){
        for(News obj: arrayList){//mỗi phần tử trong mảng đồng nghĩa với 1 instance news1
            obj.calculate();
            obj.Display();
        }
    }
    public static void main(String[] args) {

        menu();
        int abc;
        do {
            System.out.println("chon ");
            abc = key.nextInt();
            switch (abc) {
                case 1:
                    nhap();
                    break;
                case 2:
                    inThongTin();
                    break;
                case 3:
                    inThongTin2();
                    break;
            }
        }while(abc != 4);
    }
}
