package ex4_MarksmanagementSystem;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Scanner;
public class Main {
    static int id = 0;
    static Scanner key = new Scanner(System.in);
    static ArrayList<studentsMark> arrayList = new ArrayList<>();
    public static void menu(){
        System.out.println("Please select an option\n");
        System.out.println("1. Insert new Students");
        System.out.println("2. View list of Students");
        System.out.println("3. Average Mark");
        System.out.println("4. Exit\n");

    }
    public static void input(){
        studentsMark studentsMark =  new studentsMark();
        id++;

        System.out.println("Input your full name");
        String name = key.nextLine();
        System.out.println("Input your class");
        String classs = key.nextLine();
        System.out.println("Input your semester");
        int  semester = key.nextInt();key.nextLine();

        System.out.println("Input your 5 subjectmarks");
        int []a = new int[5];
        for(int i = 0; i<studentsMark.getSubjectMarkLst().length; i++){
            a[i] = key.nextInt();
        }
        key.nextLine();
        studentsMark stm= new studentsMark(id,name,classs,  semester, a);
        arrayList.add(stm);
    }
    public static void inThongTin(){
        for(studentsMark obj : arrayList){
            obj.display();
        }
    }
    public static void inThongTin2(){
        for(studentsMark obj : arrayList){
            System.out.println(obj.aveCal());
            obj.display();
        }
    }

    public static void main(String[] args) {
        menu();
        int a;
        do {
            System.out.println("Your Option");
            a= key.nextInt();key.nextLine();

            switch (a) {
                case 1 -> input();
                case 2 -> inThongTin();
                case 3 -> inThongTin2();
                case 4 -> System.out.println("Exit sucessfully");
                default -> {
                }
            }
        }while(a!=4);
    }
}
