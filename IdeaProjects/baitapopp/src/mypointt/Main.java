package mypointt;
import java.util.*;
public class Main {
    public static void main(String[] args) {
        ArrayList<BenhAn> benhAnList = new ArrayList<>();
        Scanner sc = new Scanner(System.in);
        int chon;
        do{
            ShowMenu();
            System.out.print("chon: ");
            chon = Integer.parseInt(sc.nextLine());
            switch (chon) {
                case 1: {
                    System.out.println("Nhap so benh an:");
                    int n;
                    n = Integer.parseInt(sc.nextLine());
                    for (int i = 0; i < n; i++) {
                        BenhAn TD = new BenhAn();
                        TD.NhapthongtinBenhAn();
                        benhAnList.add(TD);
                    }
                    break;
                }

                case 2 : {
                    System.out.println("Thong tin benh an: ");
                    System.out.printf("%-15s %-15s %-15s %-15s %-15s ","ten benh an","ten benh nhan","que quan","năm sinh","so tien vien phí");
                    for (BenhAn benhAn : benhAnList) {
                        benhAn.InthongtinBenhAn();
                    }
                    break;
                }
                case 3 : {
                    System.out.println("sap xep tuoi nho dan ");
                    benhAnList.sort((sv1, sv2) -> {
                        if (sv1.getTinhTuoi() < sv2.getTinhTuoi()) {
                            return -3;
                        } else if (sv1.getTinhTuoi() > sv2.getTinhTuoi()) {
                            return 1;
                        } else {
                            return 0;
                        }
                    });
                    for (BenhAn benhAn : benhAnList) {
                        System.out.printf("\n%-15s %-15s %-15s %-15s %-15s ","ten benh an","ten","que quan","năm sinh","so tien vien phí");
                        benhAn.InthongtinBenhAn();
                    }
                    break;
                }

                case 4 : {
                    System.out.println("hien thi benh nhan dươi 10 tuoi");
                    for (BenhAn benhAn : benhAnList) {
                        if (benhAn.getTinhTuoi() < 10) {
                            benhAn.InthongtinBenhAn();
                        }
                    }
                    break;
                }

                case 5 : {
                    System.out.println("Benh nhan co tien vien phi cao nhat la:");
                    int maxIndex = 0;
                    double maxVienPhi;

                    maxVienPhi = benhAnList.get(0).getSoTienVienPhi();
                    for (int i = 1; i < benhAnList.size(); i++) {
                        if (benhAnList.get(i).getSoTienVienPhi() > maxVienPhi) {
                            maxIndex = i;
                            maxVienPhi = benhAnList.get(i).getSoTienVienPhi();
                        }
                    }
                    benhAnList.get(maxIndex).InthongtinBenhAn();
                }
            }
        }while (chon !=0);
        System.out.println("Good Bye");
    }
    static void ShowMenu(){
        System.out.println("Chon 1 de nhap thong tin: ");
        System.out.println("chon 2 de sap xep tuoi nho dan ");
        System.out.println("chon 3 de in ra danh sanh benh nhan co tuoi nho hon 10 ");
        System.out.println("chon4 de in ra benh nhan co tien vien phi cao nhat ");
    }
}