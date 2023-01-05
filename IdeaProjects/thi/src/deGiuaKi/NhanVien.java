package deGiuaKi;

import java.util.Scanner;

public class NhanVien {
    private String hoten;
    private int namsinh;
    private int heso;
    private int thamnien;

    public NhanVien(){}

    public NhanVien(String hoten, int namsinh, int heso, int thamnien) {
        this.hoten = hoten;
        this.namsinh = namsinh;
        this.heso = heso;
        this.thamnien = thamnien;
    }

    public String getHoten() {
        return hoten;
    }
    public void setHoten(String hoten) {
        this.hoten = hoten;
    }
    public int getHeso() {
        return heso;
    }
    public void setHeso(int heso) {
        this.heso = heso;
    }
    public int getNamsinh() {
        return namsinh;
    }
    public void setNamsinh(int namsinh) {
        this.namsinh = namsinh;
    }
    public int getThamnien() {
        return thamnien;
    }
    public void setThamnien(int thamnien) {
        this.thamnien = thamnien;
    }
    public void nhapThongTin(){
        Scanner sc = new Scanner(System.in);
        System.out.println("Nhap thong tin cho nhan vien:");
        System.out.print("Nhap ho ten: ");
        hoten = sc.nextLine();
        System.out.print("Nhap nam sinh: ");
        namsinh = sc.nextInt();
        System.out.print("Nhap he so: ");
        heso = sc.nextInt();
        System.out.print("Nhap tham nien: ");
        thamnien = sc.nextInt();
    }
    public int luong() {
        return heso * 150000 + thamnien *30000;
    }
    public void inThongTin() {
        System.out.println("Ho ten: " +hoten+", nam sinh: " +namsinh +", he so: "
                +heso + ", tham nien: " +thamnien);
    }
}