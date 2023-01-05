package cadres;

public class canBo {
    private String hoTen;
    private int tuoi;
    private boolean gioiTinh;
    private String diaChi;

    public canBo(){

    }

    public canBo (String hoTen, int tuoi, boolean gioiTinh, String diaChi){
        this.hoTen = hoTen;
        this.tuoi = tuoi;
        this.gioiTinh = gioiTinh;
        this.diaChi  = diaChi;
    }
    public void setHoTen(String hoten){
        this.hoTen = hoten;
    }
    public void checkGT(boolean gioiTinh){
        if (gioiTinh==true){
            System.out.println("nam");
        }else {
            System.out.println("nu");
        }
    }
    public String getHoTen() {
        return hoTen;
    }

    public void setDiaChi(String diaChi) {
        this.diaChi = diaChi;
    }

    public String getDiaChi() {
        return diaChi;
    }

    public void setGioiTinh(boolean gioiTinh) {
        this.gioiTinh = gioiTinh;
    }

    public int getTuoi() {
        return tuoi;
    }

    public void setTuoi(int tuoi) {
        this.tuoi = tuoi;
    }
    public boolean getGioiTinh(){
        return gioiTinh;
    }

    @Override
    public String toString() {
        return "canBo{" +
                "hoTen='" + hoTen + '\'' +
                ", tuoi=" + tuoi +
                ", gioiTinh=" + gioiTinh +
                ", diaChi='" + diaChi + '\'' +
                '}';
    }
}