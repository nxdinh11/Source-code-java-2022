package deGiuaKi.doAgain;
import java.util.Scanner;

public class nhanVien {
    private String hoTen;
    private int namSinh;
    private int heSo;
    private int thamNien;

    public nhanVien(){}
    public nhanVien(String hoTen, int namSinh, int heSo, int thamNien){
        this. hoTen = hoTen;
        this.namSinh = namSinh;
        this.hoTen = hoTen;
        this.thamNien = thamNien;
    }

    public String getHoTen() {
        return hoTen;
    }

    public void setHoTen(String hoTen) {
        this.hoTen = hoTen;
    }

    public int getNamSinh() {
        return namSinh;
    }

    public void setNamSinh(int namSinh) {
        this.namSinh = namSinh;
    }

    public int getHeSo() {
        return heSo;
    }

    public void setHeSo(int heSo) {
        this.heSo = heSo;
    }

    public int getThamNien() {
        return thamNien;
    }

    public void setThamNien(int thamNien) {
        this.thamNien = thamNien;
    }
    Scanner key = new Scanner(System.in);


    public void inThongToin() {
        System.out.println("Ho ten: " +hoTen+", nam sinh: " +namSinh +", he so: "
                +heSo + ", tham nien: " +thamNien);
    }

    public void nhapThongTin(){
        System.out.println("input your full name: ");
        String name  = key.nextLine();
        this.hoTen = name;

        System.out.println("input your year of birth: ");
        int year = key.nextInt();
        this.namSinh = year;

        System.out.println("Input your heSo luong: ");
        int heSo  = key.nextInt();
        this.heSo = heSo;

        System.out.println("input your thamNien: ");
        this.thamNien  = key.nextInt();



    }


}
