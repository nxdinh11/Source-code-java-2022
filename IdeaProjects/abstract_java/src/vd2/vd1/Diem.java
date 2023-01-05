package vd2.vd1;

import static java.lang.Math.sqrt;

public class Diem extends Hinh{
    public Diem(ToaDo toadoo){
        super(toadoo);
    }

    public double tinhDienTich(){
        return 1;
    }

    @Override
    public double tinhkc2Diem() {
        return 0;
    }

    public  double tinhkc2Diem(ToaDo other ){
        return sqrt((super.getToaDo().getX() - other.getX())*(super.getToaDo().getX() - other.getX()) +
                (super.getToaDo().getY() - other.getY())*(super.getToaDo().getY() - other.getY()));
    }
}