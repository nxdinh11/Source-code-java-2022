import java.util.Scanner;
public class benhNhan {
    private String hoTen;
    private String queQuan;
    private int namSinh;

    public benhNhan(){}
    public benhNhan(String hoTen, String queQuan, int namSinh){
        this.hoTen = hoTen;
        this.queQuan = queQuan;
        this.namSinh =  namSinh;
    }
    Scanner key = new Scanner(System.in);
    public String getHoTen() {
        return hoTen;
    }

    public void setHoTen(String hoTen) {
        this.hoTen = hoTen;
    }

    public String getQueQuan() {
        return queQuan;
    }

    public void setQueQuan(String queQuan) {
        this.queQuan = queQuan;
    }

    public int getNamSinh() {
        return namSinh;
    }

    public void setNamSinh(int namSinh) {
        this.namSinh = namSinh;
    }

    @Override
    public String toString() {
        return " " +
                "hoTen='" + hoTen + '\'' +
                ", queQuan='" + queQuan + '\'' +
                ", namSinh='" + namSinh + '\'' +
                ' ';
    }
    public void nhapThongtin(){
        System.out.println("Nhap ten: ");
        this.hoTen = key.nextLine();

        System.out.println("Nhap que quan: ");
        this.queQuan  = key.nextLine();
        System.out.println("Nhap nam sinh: ");
        this.namSinh = key.nextInt();
        key.nextLine();
    }
    public void xuatThongTin(){
        System.out.println("Ten "+ this.hoTen +", " + "que quan "
                +this.queQuan + ", " + "nam sinh " + this.namSinh+ " " );
    }
}
