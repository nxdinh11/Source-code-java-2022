
import java.util.*;
class rectangle{
    private double width, height;
    rectangle(double widthval, double heightval){
        width = widthval;
        height  = heightval;
    }
    double area(){
        return width * height;
    }
}

public class one{
    public static void main(String[] args) {
        rectangle rec1, rec2;// khai báo kiểu dữ liệu

        Scanner keyboard = new Scanner(System.in);
        System.out.print("Nhập chiều dài: ");
        int a = keyboard.nextInt();
        System.out.print("Nhập chiều rộng: ");
        int b = keyboard.nextInt();

        rec1 = new rectangle(a,b);// với new rectangle() như là 1 instance mới

        System.out.println("area of rec1:" + rec1.area());


    }
}


