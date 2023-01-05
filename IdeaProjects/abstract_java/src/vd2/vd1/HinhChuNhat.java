package vd2.vd1;
public class HinhChuNhat extends Hinh{
    private int chieuDai;
    private int chieuRong;

    public HinhChuNhat(){}

    public HinhChuNhat(ToaDo toaDo, int dai, int rong){
        super(toaDo);
        this.chieuDai = dai;
        this.chieuRong = rong;
    }

    public int getChieuDai() {
        return chieuDai;
    }

    public void setChieuDai(int chieuDai) {
        this.chieuDai = chieuDai;
    }

    public int getChieuRong() {
        return chieuRong;
    }

    public void setChieuRong(int chieuRong) {
        this.chieuRong = chieuRong;
    }

    @Override
    public String toString() {
        return "HinhChuNhat{" +
                "chieuDai=" + chieuDai +
                ", chieuRong=" + chieuRong +
                '}';
    }
    public double tinhDienTich(){
        return this.chieuRong*this.chieuDai;
    }
    public double tinhkc2Diem(){
        return 0;
    }
    public double tinhkc2Diem(ToaDo x ){
        return 0;
    }

}