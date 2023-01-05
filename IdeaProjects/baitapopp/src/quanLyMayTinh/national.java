package quanLyMayTinh;

public class national {
    private String tenQuocGia;
    private String maQuocGia;

    public national(){

    }
    public national(String tenQuocGia, String maQuocGia){
        this.maQuocGia = maQuocGia;
        this.tenQuocGia = tenQuocGia;
    }

    public String getMaQuocGia() {
        return maQuocGia;
    }

    public String getTenQuocGia() {
        return tenQuocGia;
    }

    public void setTenQuocGia(String tenQuocGia) {
        this.tenQuocGia = tenQuocGia;
    }

    public void setMaQuocGia(String maQuocGia) {
        this.maQuocGia = maQuocGia;
    }

    @Override
    public String toString() {
        return "national{" +
                "tenQuocGia='" + tenQuocGia + '\'' +
                ", maQuocGia='" + maQuocGia + '\'' +
                '}';
    }
}
