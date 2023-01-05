package sinhvienArraylist;
import java.util.ArrayList;
import java.util.Comparator;
import java.util.Collections;

public class danhSachSinhVien extends sinhVien{
    private ArrayList<sinhVien> arr;
    public danhSachSinhVien(){
        this.arr = new ArrayList<>();
    }
    public danhSachSinhVien(ArrayList<sinhVien> danhSach){
        this.arr = danhSach;
    }

    public ArrayList<sinhVien> getArr() {
        return arr;
    }

    public void setArr(ArrayList<sinhVien> arr) {
        this.arr = arr;
    }

    public void themSinhVien(sinhVien sv){
        this.arr.add(sv);
    }

    @Override
    public String toString() {
        return "danhSachSinhVien{" + arr +
                '}';
    }
    public String inThongTin(){
        return "hoTen " + getHoTen() + ", namSinh " + getNamSinh()+ ", diemTb " + diemTb();
    }

    public void inSinhVien(){
         for(sinhVien obj : this.arr){
             System.out.println(obj);
         }
    }
    public void indiemtb(){
        for(sinhVien obj : this.arr){
            System.out.println(obj.diemTb());
        }
    }
    public void indiemtbcaonhat(){
        arr.sort(Comparator.comparing(sinhVien::getHoTen));
    }

}
