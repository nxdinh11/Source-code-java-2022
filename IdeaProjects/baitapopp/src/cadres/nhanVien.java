package cadres;

public class nhanVien extends canBo{
    private String congViec;
    public nhanVien(){}
    public nhanVien(String hoTen, int tuoi, boolean gioiTinh, String diaChi,String congViec ){
        super(hoTen, tuoi,  gioiTinh,  diaChi);
        this.congViec = congViec;
    }

    public void setCongViec(String congViec) {
        this.congViec = congViec;
    }

    public String getCongViec() {
        return congViec;
    }

    @Override
    public String toString() {
        return "nhanVien{" +
                "congViec='" + congViec + '\'' +
                '}';
    }

}
