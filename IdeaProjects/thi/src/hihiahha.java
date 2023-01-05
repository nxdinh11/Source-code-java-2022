import java.util.Scanner;

public class hihiahha {
    private String hoten;
    private int namsinh;
    public hihiahha(){}

    public hihiahha(String hoten, int namsinh) {
        this.hoten = hoten;
        this.namsinh = namsinh;
    }

    public String getHoten() {
        return hoten;
    }

    public void setHoten(String hoten) {
        this.hoten = hoten;
    }

    public int getNamsinh() {
        return namsinh;
    }

    public void setNamsinh(int namsinh) {
        this.namsinh = namsinh;
    }

    @Override
    public String toString() {
        return "hihiahha{" +
                "hoten='" + hoten + '\'' +
                ", namsinh=" + namsinh +
                '}';
    }

    public void nhapThongTin() {
        Scanner sc = new Scanner(System.in);
        System.out.println("Nhap thong tin cho nhan vien:");
        System.out.print("Nhap ho ten: ");
        hoten = sc.nextLine();
        System.out.print("Nhap nam sinh: ");
        namsinh = sc.nextInt();
    }
}