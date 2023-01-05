package vd2.vd1;
public abstract class Hinh{
    private ToaDo toaDo;

    public Hinh(){}
    public Hinh(ToaDo toaDo){
        this.toaDo = toaDo;
    }

    public ToaDo getToaDo() {
        return toaDo;
    }

    public void setToaDo(ToaDo toaDo) {
        this.toaDo = toaDo;
    }

    @Override
    public String toString() {
        return "Hinh{" +
                "toaDo=" + toaDo +
                '}';
    }
    public abstract double tinhDienTich();//all methods of abstract must be declared in class extend.
    public abstract double tinhkc2Diem();
    public abstract double tinhkc2Diem(ToaDo x );

}