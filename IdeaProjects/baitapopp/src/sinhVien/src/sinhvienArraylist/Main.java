package sinhvienArraylist;

import java.util.Scanner;
import java.util.Objects;
public class Main {
    public static void main(String[] args) {
        Scanner key = new Scanner(System.in);
        danhSachSinhVien dssv = new danhSachSinhVien();
        String abc;
        do {
            System.out.println("1. Nhap thong tin sinh vien");
            System.out.println("2. In thong tin sinh vien ");
            System.out.println("3. In diem trung binh");
            System.out.println("4. In diem trung binh theo thu tu tang dan ");
            System.out.println("5. Exit programme");

                abc = key.nextLine();

            switch (abc) {
                case "1" -> {
                    System.out.println("Nhap ho va ten: ");
                    String hoTen = key.nextLine();
                    System.out.println("Nhap nam sinh: ");
                    int namSinh = key.nextInt();
                    key.nextLine();
                    System.out.println("Nhap diem toan: ");
                    double diemToan = key.nextDouble();
                    System.out.println("Nhap diem Anh: ");
                    double diemAnh = key.nextDouble();
                    System.out.println("Nhap diem Tin: ");
                    double diemTin = key.nextDouble();
                    key.nextLine();
                    sinhVien sv = new sinhVien(hoTen, namSinh, diemToan, diemAnh, diemTin);
                    dssv.themSinhVien(sv);
                }
                case "2" -> {
                    System.out.println("In sinh vien: ");
                    dssv.inSinhVien();
                }
                case "3" -> {
                    System.out.println("in diem trung binh: ");
                    dssv.indiemtb();
                }
                case "4" -> {
                    dssv.indiemtbcaonhat();
                    dssv.inSinhVien();
                }
                case "5" -> {
                    System.out.println("Press c to exit: ");
                    abc = key.nextLine();
                }
                default -> {
                }
            }
        }while(!Objects.equals(abc, "c"));

    }
}
