package vd2.vd1;
public class HinhTron extends Hinh{
    private double r;
    public HinhTron(){}
    public HinhTron(ToaDo toado, double r){
        super(toado);
        this.r = r;
    }

    public double getR() {
        return r;
    }

    public void setR(double r) {
        this.r = r;
    }

    @Override
    public String toString() {
        return "HinhTron{" +
                "r=" + r +
                '}';
    }
    public double tinhDienTich(){
        return Math.PI*this.r*this.r;
    }
    public  double tinhkc2Diem(){
        return  0 ;
    }
    public double tinhkc2Diem(ToaDo xx){
        return 0;
    }
}