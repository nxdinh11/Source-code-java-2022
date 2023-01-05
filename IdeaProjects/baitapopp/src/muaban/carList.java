package muaban;
import java.util.Scanner;
import java.util.ArrayList;
public class carList {
    public static void main(String[] args) {
        int a, b, c = 0 ;
        Scanner key = new Scanner(System.in);
        ArrayList<car> arr = new ArrayList<car>();
        car car1 = new car();

        System.out.println("Nhap id: ");
        int id  = key.nextInt();
        key.nextLine();
        System.out.println("Nhap ten: ");
        String name = key.nextLine();
        System.out.println("Nhap price: ");
        double price = key.nextDouble();
        System.out.println("Nhap extraOut: ");
        double extraOut = key.nextDouble();
        System.out.println("Nhap quantity: ");
        int quantity = key.nextInt();

        car car2 = new car(id, name , price, extraOut, quantity );
        arr.add(car2);
        for(car obj : arr){
            System.out.println(obj);
        }
    }
}