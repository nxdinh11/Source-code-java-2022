package deGiuaKi.doAgain;

import java.util.Scanner;
import java.util.Scanner;
public class main {
    public static void main(String[] args) {
        nhanVien[] arr1 = new nhanVien[3];

        arr1[0]= new nhanVien();
        arr1[1] = new nhanVien();
        arr1[2] = new nhanVien();

        for(int i = 0; i < arr1.length; i++){
            System.out.println("nhap tien nguoi "  +(i + 1));
            arr1[i].nhapThongTin();
        }

        for (int i = 0; i<arr1.length; i++){
            arr1[i].inThongToin();
        }

        System.out.println(arr1[0].getHoTen());
    }
}
