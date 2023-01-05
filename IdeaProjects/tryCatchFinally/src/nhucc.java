import java.util.InputMismatchException;
import java.util.Scanner;
public class nhucc {
    static Scanner sc=new Scanner(System.in);
    public static void main(String args[]) {
        String a;
        boolean check = true;
        System.out.println("Enter the name");
        do {
        try {
            a=sc.nextLine();
                try {
                    if(a.isEmpty()){
                       check = false;
                    }
                }catch (Exception e){
                    System.out.println(e);
                }

            System.out.println("You name is "+a);
        }catch(InputMismatchException b) {
            check = false;
        }
        }while(check);
    }
}
