package mypointt;

import java.util.Scanner;

public class BenhNhan {
    private String hoVaTen;
    private String queQuan;
    private int namSinh;
    public BenhNhan() {}
    public int getNamSinh() {
        return namSinh;
    }

    public void setHoVaTen(String hoVaTen) {
        this.hoVaTen = hoVaTen;
    }

    public void setQueQuan(String queQuan) {
        this.queQuan = queQuan;
    }

    public void setNamSinh(int namSinh) {
        this.namSinh = namSinh;
    }
    Scanner sc = new Scanner(System.in);
    public void  getNhapthongtinBenhNhan() {


        System.out.println("Nhap thong tin benh nhan");
        System.out.print("ho va ten:");
        setHoVaTen(sc.nextLine());
        System.out.print("que quan: ");
        setQueQuan(sc.nextLine());
        System.out.print("nam sinh: ");
        setNamSinh(sc.nextInt());

    }
    public void getInthongtinBenhnhan(){
        System.out.printf("%-18s %-18s %-18s",hoVaTen,queQuan,namSinh);
    }
}
