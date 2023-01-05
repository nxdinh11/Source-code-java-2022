package sinhVien;

import java.util.Objects;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        String abc;int dem = 1;
        Scanner key = new Scanner(System.in);

            sinhVien[] sv = new sinhVien[3];
            sv[0] = new sinhVien();
            sv[1] = new sinhVien();
            sv[2] = new sinhVien();

            do {
                System.out.println("===============================Menu===============================");
                System.out.println("=              1. Nhap thong tin 3 sinh vien                     =");
                System.out.println("=              2. In thong tin 3 sinh vien                       =");
                System.out.println("=              3. In sinh vien du dieu kien len lop              =");
                System.out.println("=              4. In sinh vien co diem trung binh cao nhat       =");
                System.out.println("=              5. In danh sach theo chieu tang dan diem tb       =");
                System.out.println("=              6. In sinh vien co ten trung nhau                 =");
                System.out.println("=              7. Thoat chuong trinh cua ban.                    =");
                System.out.println("==================================================================");
                System.out.print("Chon chuc nang: ");
                abc = key.nextLine();
                switch (abc){
                    case "1":
                        for(sinhVien a : sv){
                            a.nhapThongTin();
                        }break;
                    case "2":
                        for(sinhVien a : sv){
                            System.out.println(a.inThongTin());
                        }break;
                    case "3":

                        for(sinhVien obj: sv){
                            if(obj.diemTb() > 5 && obj.getDiemTin()> 0 &&obj.getDiemToan() > 0 &&obj.getDiemAnh()>0){
                                System.out.println("sinh vien ten "+ obj.getHoTen()+ "du dieu kien len lop");
                                dem++;
                            }
                        }
                        if(dem == 1) System.out.println("o lai lop het");
                        break;
                    case "4":
                        double maxx  = 0;
                        for (sinhVien obj:sv) {
                            maxx = Math.max(maxx, obj.diemTb());
                        }
                        System.out.println("diem trung binh cao nhat la "+ maxx  );break;
                    case "5":
                        for(int i = 0 ; i< sv.length-1; i++){
                            for(int j = 1; j<sv.length; j++){
                                sinhVien a = sv[i];
                                if(sv[i].diemTb() > sv[j].diemTb()){
                                    sv[i] = sv[j];
                                    sv[j] = a;
                                }
                            }
                        }
                        for(sinhVien a : sv){
                            System.out.println(a.inThongTin());
                        }
                        break;
                    case "6":
                        for(int i = 0 ; i< sv.length-1; i++){
                            for(int j = 1; j<sv.length; j++){
                                int a = sv[i].getHoTen().compareToIgnoreCase(sv[j].getHoTen());
                                if(a == 0 && sv[i].diemTb() != sv[j].diemTb()){
                                    System.out.println("sinhvien cung ten la: " + sv[i]+"\n"+ sv[j]);
                                }
                            }
                        }
                        break;
                    case "7":
                        System.out.println("Press c to exit program: ");
                        abc = key.nextLine();break;
                    default:
                }

            } while (!Objects.equals(abc, "c"));
        }
}
