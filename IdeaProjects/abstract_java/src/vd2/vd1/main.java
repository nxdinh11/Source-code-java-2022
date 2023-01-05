package vd2.vd1;
public class main {
    public static void main(String[] args) {
        ToaDo td1 = new ToaDo(4,6);
        ToaDo td2 = new ToaDo(6, 4);
        ToaDo td3 = new ToaDo(11, 8);


        Hinh h1 = new HinhTron(td1, 3);
        Hinh h2 = new HinhChuNhat(td2, 9 , 7);
        Hinh h3 = new Diem(td3);



        HinhTron ht1 = new HinhTron(td1, 3);


        System.out.println(h3.tinhkc2Diem(td2));
        System.out.println(h1);
        System.out.println(ht1);
    }
}