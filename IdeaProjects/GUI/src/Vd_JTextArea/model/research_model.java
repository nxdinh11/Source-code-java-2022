package Vd_JTextArea.model;

public class research_model {
    private String vanBan;
    private String tuKhoa;
    private String ketQua;

    public research_model(){
        this.vanBan = "";
        this.tuKhoa = "";
        this.ketQua = "";
    }

    public String getVanBan() {
        return vanBan;
    }

    public void setVanBan(String vanBan) {
        this.vanBan = vanBan;
    }

    public String getTuKhoa() {
        return tuKhoa;
    }

    public void setTuKhoa(String tuKhoa) {
        this.tuKhoa = tuKhoa;
    }

    public String getKetQua() {
        return ketQua;
    }

    public void setKetQua(String ketQua) {
        this.ketQua = ketQua;
    }
    public void timKiem(){
        int dem= 0, viTri  = 0;
        while (true){
            int i = this.vanBan.indexOf(this.tuKhoa, viTri);
            if(i == -1){
                //status not found
                break;
            }else{
                dem++;
                viTri = i+1;
            }
        }
        this.ketQua = "Có " + dem +" " +  this.tuKhoa;

    }
}
