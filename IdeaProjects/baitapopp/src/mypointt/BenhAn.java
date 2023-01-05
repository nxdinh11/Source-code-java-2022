package mypointt;
public class BenhAn extends BenhNhan{
    private String tenBenhAn;
    private double soTienVienPhi;
    int tuoi ;
    public BenhAn(){}

    public double getSoTienVienPhi() {
        return soTienVienPhi;
    }

    public void setTenBenhAn(String tenBenhAn) {
        this.tenBenhAn = tenBenhAn;
    }

    public void setSoTienVienPhi(double soTienVienPhi) {
        this.soTienVienPhi = soTienVienPhi;
    }
    public int getTinhTuoi(){
        return tuoi =2022-getNamSinh();
    }
    public void NhapthongtinBenhAn(){
        System.out.println("Nhap ten benh an: ");
        setTenBenhAn(sc.nextLine());

        System.out.println("Nhap ten so tien vien phi: ");
        setSoTienVienPhi(sc.nextDouble());
    }
    public void InthongtinBenhAn(){
        System.out.printf("\n%-15s",tenBenhAn);
        getInthongtinBenhnhan();
        System.out.printf("%-18s",soTienVienPhi);
        System.out.println();
    }
}
