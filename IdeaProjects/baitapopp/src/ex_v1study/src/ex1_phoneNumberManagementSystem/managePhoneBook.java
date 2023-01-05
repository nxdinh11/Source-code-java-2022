package ex1_phoneNumberManagementSystem;

import java.util.Scanner;

public class managePhoneBook {
    static phoneBook phoneBook = new phoneBook();
    static Scanner key = new Scanner(System.in);
    static public void menu(){
        System.out.println("1. Insert Phone");
        System.out.println("2. In list Phone");
        System.out.println("3. Remove Phone");
        System.out.println("4. Update Phone");
        System.out.println("5. Search Phone");
        System.out.println("6. Sort");
        System.out.println("7. Exit");
    }
    public static void insertPhone(){
        String a = key.nextLine();
        String b = key.nextLine();
        phoneBook.insertPhone(a, b);
    }
    public static void inInfor(){
        phoneBook.in();
    }
    public static void updatePhone(){
        String a = key.nextLine();
        String b = key.nextLine();
        phoneBook.updatePhone(a, b);
    }
    public static void removePhone(){
        String a = key.nextLine();
        phoneBook.removePhone(a);
    }
    public static void searchPhone(){
        String a = key.nextLine();
        phoneBook.searchPhone(a);
    }
    public static void Sort(){
        phoneBook.sort();
    }
    public static void main(String[] args) {
        menu();
        int obj;
        do {
            obj = key.nextInt();
            key.nextLine();
            switch (obj){
                case 1:
                    insertPhone();break;
                case 2:
                    inInfor();break;
                case 3:
                    removePhone();break;
                case 4:
                    updatePhone();break;
                case 5:
                    searchPhone();break;
                case 6:
                    Sort();break;
                default:
            }
        }while(obj != 7);
        phoneBook.sort();

    }
}
