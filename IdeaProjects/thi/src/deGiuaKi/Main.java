package deGiuaKi;

public class Main {
    public static  void main(String[] args) {
        NhanVien[] nhanViens = new NhanVien[3];

        nhanViens[0] = new NhanVien();// với nhanViens[0] = new NhanVien() là 1 instance mới, nhanViens[0] là tên của instance
        nhanViens[1] = new NhanVien();
        nhanViens[2] = new NhanVien();

        System.out.println("Nhap thong tin: ");
        for (int i = 0; i < nhanViens.length; i++) {
            nhanViens[i].nhapThongTin();
        }
        System.out.println("Xuat thong tin: ");
        for (int i = 0; i < nhanViens.length; i++){
            nhanViens[i].inThongTin();
        }

        //check
        System.out.println("In nhan vien hop le: ");
        for (int i = 0; i < nhanViens.length; i++){
            if (nhanViens[i].getThamnien() >= 20 || nhanViens[i].getHeso() > 8)
            {nhanViens[i].inThongTin();}
        }

        //check nv luong cao nhat
        System.out.println("Nhan vien co luong cao nhat: ");
        if (nhanViens[0].luong() > nhanViens[1].luong()){
            if (nhanViens[0].luong() > nhanViens[2].luong()) {
                nhanViens[0].inThongTin();
            }else nhanViens[2].inThongTin();
        }else if (nhanViens[1].luong() > nhanViens[2].luong()){
            nhanViens[1].inThongTin();
        }else nhanViens[2].inThongTin();

    }
}