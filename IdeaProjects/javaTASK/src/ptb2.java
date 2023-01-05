import java.util.Scanner;
public class ptb2 {
    public void giai(int a, int b,int c){
        if(a == 0){
            if(b == 0){
                if (c == 0){
                    System.out.println("Phuong trinh co vo so nghiem: ");
                }
                else
                    System.out.println("Phuong trinh vo nghiem:");
            }
            else System.out.println("Phuong trinh co nghiem: " + (float)-c/b);
        }
        else{
            double delta = b*b - 4 * a * c;
            if (delta < 0){
                System.out.println("Phuong trinh vo nghiem:");
            } else if (delta == 0) {
                System.out.println("Phuong trinh co nghiem kep : "+ -b/(2*a));

            } else {
                double x1 = (-b + Math.sqrt(delta))/(a*2);
                double x2 = (-b - Math.sqrt(delta))/(a*2);
                System.out.println("Phuong trinh co 2 nghiem phan biet:" + x1 +" va "+ x2);
            }
        }
    }


    public static void main(String[] args) {
        Scanner key = new Scanner(System.in);
        ptb2 abc = new ptb2();
        System.out.println("Nhap so a: ");
        int a = key.nextInt();
        System.out.println("Nhap so b: ");
        int b = key.nextInt();
        System.out.println("Nhap so c: ");
        int c = key.nextInt();
        abc.giai(a,b,c);

    }
}