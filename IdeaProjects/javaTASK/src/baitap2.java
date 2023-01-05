import java.util.Scanner;
import java.util.ArrayList;
import java.lang.Math;
public class baitap2{

    public void checkprime(int n){
        ArrayList<Integer> arr  = new ArrayList<Integer>();
        int a = 2, b , c = 0 , d  = 0, e, count;
        System.out.print("prime number from 1 to " + n +" la: " );
        while (a <= n){
            count = 1;

            if(a != 0 && a !=1){
                b = 2;
                while (b<= a/2){
                    if(a % b == 0){
                        count = 0;
                        break;
                    }
                b++;
                }
            }
            else{
                System.out.println("not prime number: ");
                count = 0;}
        if(count == 1){
            System.out.print(a + " ");
            arr.add(a);
            d = Math.max(c ,a);

        }
         a++;
        }
        System.out.println("");
        System.out.println("maximum prime is: " + d);

    }
public static void main(String[] args) {
    Scanner key = new Scanner(System.in);
    System.out.println("Nhap so n: ");
    int n = key.nextInt();
    baitap2 abc = new baitap2();
    abc.checkprime(n);
    }
}