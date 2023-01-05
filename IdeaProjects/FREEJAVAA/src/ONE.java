import java.util.Scanner;
public class ONE {
    static Scanner key = new Scanner(System.in);
    public static void main(String[] args) {

        int a= 0,b = 0;
        for(int i = 0; i<4; i++){
            a+= i;
        }
        System.out.println(a);
        System.out.println("==================================");
        for(int i = 0; i<4; i++){
            b+= i;
        }
        System.out.println(b);
    }
}