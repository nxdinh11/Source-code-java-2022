package sinhVien;

import java.util.Scanner;
public class sinhVien {
    private String hoTen;
    private int namSinh;
    private double diemToan;
    private double diemAnh;
    private double diemTin;

    public sinhVien(){}
    public sinhVien(String hoTen, int namSinh, double diemToan, double diemAnh, double diemTin){
        this.hoTen = hoTen;
        this.namSinh = namSinh;
        this.diemToan = diemToan;
        this.diemAnh = diemAnh;
        this.diemTin = diemTin;
    }
    public String getHoTen(){
        return this.hoTen;
    }
    public void setHoTen(String hoTen){
        this.hoTen = hoTen;
    }

    public int getNamSinh() {
        return namSinh;
    }

    public void setNamSinh(int namSinh) {
        this.namSinh = namSinh;
    }

    public double getDiemToan() {
        return diemToan;
    }

    public void setDiemToan(double diemToan) {
        this.diemToan = diemToan;
    }

    public double getDiemAnh() {
        return diemAnh;
    }

    public void setDiemAnh(double diemAnh) {
        this.diemAnh = diemAnh;
    }

    public double getDiemTin() {
        return diemTin;
    }

    public void setDiemTin(double diemTin) {
        this.diemTin = diemTin;
    }

    @Override
    public String toString() {
        return "sinhVien{" +
                "hoTen='" + hoTen + '\'' +
                ", namSinh=" + namSinh +
                ", diemToan=" + diemToan +
                ", diemAnh=" + diemAnh +
                ", diemTin=" + diemTin +
                '}';
    }
    Scanner key = new Scanner(System.in);
    public void nhapThongTin(){
        System.out.println("Nhap ho va ten: ");
        boolean check;
        do {
            try{
                do {
                    this.hoTen = key.nextLine();
                    check = true;
                }while(hoTen.isEmpty());
            }catch (Exception e){
                check = false;
            }
        }while (!check);
        System.out.println("Nhap nam sinh: ");
        this.namSinh  = key.nextInt();
        key.nextLine();
        System.out.println("Nhap diem toan: ");
        this.diemToan = key.nextDouble();
        System.out.println("Nhap diem Anh: ");
        this.diemAnh = key.nextDouble();
        System.out.println("Nhap diem Tin: ");
        this.diemTin = key.nextDouble();
        key.nextLine();
    }
    public double diemTb(){
        return (this.diemTin + this.diemAnh + this.diemToan)/3;
    }
    public String inThongTin(){
        return "hoTen " + this.hoTen + ", namSinh " + this.namSinh+ ", diemTb " + diemTb();
    }
}
/*chúng ta không thuộc về nhau kdjfhds không thuộc về nhau  */