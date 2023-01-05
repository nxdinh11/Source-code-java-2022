import java.util.Scanner;

public class SIX {

    static Scanner key = new Scanner(System.in);
    public static void main(String[] args) {

        int n = key.nextInt();

        int dem;

        for (int i = 2; i <= n; i++) {
            dem = 0;
            while (n % i == 0) {
                dem++;
                n /= i;
            }
            if (dem != 0){
                System.out.print(i);
                if (dem > 1) System.out.print("^" + dem);
                if (n > i) {
                    System.out.print(" * ");
                }
            }
        }
    }
}