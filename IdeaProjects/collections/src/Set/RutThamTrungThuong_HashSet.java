package Set;
import java.util.*;

public class RutThamTrungThuong_HashSet {
    Set<String> thungPhieuDuThuong  = new HashSet<String>();
    public RutThamTrungThuong_HashSet(){}
    public boolean themMaDuThuong(String x){
        return this.thungPhieuDuThuong.add(x);
    }

    public boolean xoaMaDuThuong(String y){
        return this.thungPhieuDuThuong.remove(y);
    }

    public boolean checkMaCoTonTaiKhong(String z){
        return this.thungPhieuDuThuong.contains(z);
    }
    public void xoaTatCaPhieu(){
        this.thungPhieuDuThuong.clear();
    }

    public int totalPhieu(){
        return this.thungPhieuDuThuong.size();
    }

    public String rutPhieu() {

        Random ran = new Random();
        int viTri = ran.nextInt(this.thungPhieuDuThuong.size());
        String ketQua  = (String) this.thungPhieuDuThuong.toArray()[viTri];
        return ketQua;
    }
    public void inTatCa(){
        System.out.println(Arrays.toString(this.thungPhieuDuThuong.toArray()));
    }


    public static void main(String[] args) {
        RutThamTrungThuong_HashSet rt = new RutThamTrungThuong_HashSet();
        int luaChon = 0;
        do {
            System.out.println("--------------------------------------");
            System.out.println("MENU: ");
            System.out.println("1. Thêm mã số dự thưởng.");
            System.out.println("2. Xóa mã số dự thưởng.");
            System.out.println("3. Kiểm tra mã số dự thưởng có tồn tại hay không?");
            System.out.println("4. Xóa tất cả các phiếu dự thưởng.");
            System.out.println("5. Số lượng phiếu dự thưởng.");
            System.out.println("6. Rút thăm trúng thưởng.");
            System.out.println("7. In ra tất cả các phiếu.");
            System.out.println("0. Thoát khỏi chương trình");
            Scanner key = new Scanner(System.in);
            luaChon = key.nextInt();
            key.nextLine();



            if (luaChon == 1 || luaChon == 2 || luaChon == 3) {

                if (luaChon == 1) {
                    System.out.println("thêm mã dự thưởng: ");
                   String input = key.nextLine();
                    rt.themMaDuThuong(input);
                }
             else if (luaChon == 2) {
                System.out.println("xóa mã dự thưởng: ");
                String input = key.nextLine();
                rt.xoaMaDuThuong(input);
            } else {
                System.out.println("Chọn mã muốn kiểm tra: ");
                String input = key.nextLine();
                rt.checkMaCoTonTaiKhong(input);
              }
            }
            else if(luaChon == 4){
                System.out.println("clear all phieu du thuong: ");
                rt.xoaTatCaPhieu();
            }
            else if(luaChon == 5){
                System.out.println("Lay so luong phieu co trong thung: ");
                rt.totalPhieu();
            }
            else if(luaChon ==6){
                System.out.print("ma trung thuong la: "+ rt.rutPhieu());

            } else if (luaChon ==7 ) {
                System.out.println("co tat ca ");
                rt.inTatCa();
            }

        }
        while (luaChon != 0 );


    }

}
