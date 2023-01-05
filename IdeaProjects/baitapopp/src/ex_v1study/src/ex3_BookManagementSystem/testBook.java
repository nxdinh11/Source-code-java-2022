package ex3_BookManagementSystem;

import java.util.Scanner;
import java.util.ArrayList;
public class testBook {
    static int []aa = new int[5];
    static Scanner key = new Scanner(System.in);
    static ArrayList<Book> bookArraysList  = new ArrayList<>();
    static void menu(){
        System.out.println("1.Insert new book");
        System.out.println("2. View list of books");
        System.out.println("3. Average price ");
        System.out.println("4. Return to choose ");
        System.out.println("5. Exit");
    }

    static void insertIn4(){
        Book  book = new Book();
        int id = 0;id++ ;
        System.out.println("Nhap ten");
        String name = key.nextLine();
        System.out.println("Nhap publishDate");
        String publishDate = key.nextLine();
        System.out.println("Nhap autor");
        String author = key.nextLine();
        System.out.println("Nhap language");
        String language = key.nextLine();

        System.out.println("Nhap 5 loai gia: ");
        for(int i = 0 ; i<aa.length; i++){
            aa[i] = key.nextInt();
        }
        Book book1 = new Book(id, name ,publishDate,author,language, aa);
        bookArraysList.add(book1);
    }
    static void inThongTin(){
        for(Book obj: bookArraysList){
            obj.display();
        }
    }
    static void inThongTin2(){
        for(Book obj: bookArraysList){
            obj.calculate();
            obj.display();
        }
    }
    public static void main(String[] args) {
        testBook.menu();
        int option;

            do {
                option = key.nextInt();key.nextLine();

                switch (option) {
                    case 1:
                        insertIn4();
                        break;
                    case 2:
                        inThongTin();
                        break;
                    case 3:
                        inThongTin2();
                        break;
                    default:
                }
            }while (option != 4);
    }
}
