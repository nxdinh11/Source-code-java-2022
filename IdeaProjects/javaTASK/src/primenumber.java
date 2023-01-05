import java.util.Scanner;

public class primenumber {
    public void findprime(int n){
        boolean check  = true;
        for(int i = 2; i<= n/2; i++ ){
            if(n % i == 0){
                check =  false;
                break;
            }
        }
        String b = (!check) ? "not prime":"prime";
        System.out.println(b);
//    if(!check){
//        System.out.println("not prime number");
//    }
//    else System.out.println("prime number. ");

    }

    public static void main(String[] args) {
        Scanner key = new Scanner(System.in);
        int n = key.nextInt();
        primenumber abc = new primenumber();
        abc.findprime(n);
    }
}
