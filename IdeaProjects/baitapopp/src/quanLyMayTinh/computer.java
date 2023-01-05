package quanLyMayTinh;

public class computer {
    private manufacturer manufacturer;
    private ngay ngay;
    private double giaBan;
    private double thoiGianBaoHanh;
    private String tenMayTinh;
    public computer(manufacturer manufacturer,ngay ngay, double giaBan, double thoiGianBaoHanh, String tenMayTinh) {
        this.manufacturer = manufacturer;
        this.ngay = ngay;
        this.giaBan = giaBan;
        this.thoiGianBaoHanh = thoiGianBaoHanh;
        this.tenMayTinh = tenMayTinh;
    }

    public void setManufacturer(quanLyMayTinh.manufacturer manufacturer) {
        this.manufacturer = manufacturer;
    }

    public void setNgay(quanLyMayTinh.ngay ngay) {
        this.ngay = ngay;
    }

    public void setGiaBan(double giaBan) {
        this.giaBan = giaBan;
    }

    public void setThoiGianBaoHanh(double thoiGianBaoHanh) {
        this.thoiGianBaoHanh = thoiGianBaoHanh;
    }

    public quanLyMayTinh.manufacturer getManufacturer() {
        return manufacturer;
    }

    public quanLyMayTinh.ngay getNgay() {
        return ngay;
    }

    public double getGiaBan() {
        return giaBan;
    }

    public double getThoiGianBaoHanh() {
        return thoiGianBaoHanh;
    }

    public String getTenMayTinh(){
        return this.tenMayTinh;
    }

    public void setTenMayTinh(String tenMay) {
        this.tenMayTinh = tenMay;
    }

    @Override
    public String toString() {
        return "computer{" +
                "manufacturer=" + manufacturer +
                ", ngay=" + ngay +
                ", giaBan=" + giaBan +
                ", thoiGianBaoHanh=" + thoiGianBaoHanh +
                '}';
    }
    public boolean checkCost(double x){
        return this.giaBan < x;
    }
}
