import java.util.Scanner;
public class benhAn extends benhNhan{
    private String tenBenhAn;
    private double soTienVienPhi;

    public benhAn(){

    }
    public benhAn(String hoTen, String queQua, int namSin, String tenBenhAn, double soTienVienPhi){
        super(hoTen, queQua, namSin);
        this.tenBenhAn = tenBenhAn;
        this.soTienVienPhi = soTienVienPhi;
    }
    Scanner key = new Scanner(System.in);

    public String getTenBenhAn() {
        return tenBenhAn;
    }

    public void setTenBenhAn(String tenBenhAn) {
        this.tenBenhAn = tenBenhAn;
    }

    public double getSoTienVienPhi() {
        return soTienVienPhi;
    }

    public void setSoTienVienPhi(double soTienVienPhi) {
        this.soTienVienPhi = soTienVienPhi;
    }

    @Override
    public String toString() {
        return "benhAn{" +
                "tenBenhAn='" + tenBenhAn + '\'' +
                ", soTienVienPhi=" + soTienVienPhi +
                ", key=" + key +
                '}';
    }

    public void nhapThongTin(){
        System.out.println("Nhap ten benh an: ");
        this.tenBenhAn = key.nextLine();

        System.out.println("Nhap so tien vien phi: ");
        this.soTienVienPhi = key.nextDouble();
        key.nextLine();

    }
    public int tinhTuoiHienTai(){
        int tuoi= 0;
        System.out.println("Tuoi hien tai la: ");
        tuoi = 2022 - getNamSinh();
        return tuoi;
    }

    public void  inThongTin(){
        System.out.println("Ten benh an: " + this.tenBenhAn + "," +
                " so tien vien phi:  " +this.soTienVienPhi);
    }
}
