package cadres;

public class main {
    public static void main(String[] args) {
        nhanVien nhanVien = new nhanVien("dinh", 18, true, "phu yen", "nha bao");
        nhanVien.checkGT(nhanVien.getGioiTinh());
        System.out.println(nhanVien.getDiaChi());



    }
}
