package quanLyMayTinh;

public class manufacturer {
    private String tenHangSanXuat;
    private national national;


    public manufacturer (){

    }
    public manufacturer(String tenHangSanXuat, national national){
        this.tenHangSanXuat = tenHangSanXuat;
        this.national = national;
    }

    public String getTenHangSanXuat() {
        return tenHangSanXuat;
    }


    public quanLyMayTinh.national getNational() {
        return national;
    }

    public void setTenHangSanXuat(String tenHangSanXuat) {
        this.tenHangSanXuat = tenHangSanXuat;
    }

    public void setNational(national national) {
        this.national = national;
    }

    @Override
    public String toString() {
        return "manufacturer{" +
                "tenHangSanXuat='" + tenHangSanXuat + '\'' +
                ", national=" + national +
                '}';
    }
}
