package sinhvienArraylist;

import java.util.Scanner;
public class sinhVien {
    private String hoTen;
    private int namSinh;
    private double diemToan;
    private double diemAnh;
    private double diemTin;
    private double diemTrungBinh;

    public sinhVien(){}
    public sinhVien(double diemTrungBinh){
        this.diemTrungBinh = diemTrungBinh;
    }
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

    public double getDiemTrungBinh() {
        return diemTrungBinh;
    }

    public void setDiemTrungBinh(double diemTrungBinh) {
        this.diemTrungBinh = diemTrungBinh;
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
                ", diemTrungBinh=" + diemTrungBinh +
                '}';
    }

    Scanner key = new Scanner(System.in);
    public double diemTb(){
        return (getDiemAnh() + getDiemTin() + getDiemToan())/3;
    }

}

