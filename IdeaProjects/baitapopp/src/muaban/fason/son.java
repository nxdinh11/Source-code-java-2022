package muaban.fason;

import java.util.Scanner;
public class son {
    public static void main(String[] args) {
        father kg;

        System.out.println("Số tiền mỗi kí là 5.");
        System.out.print("Bạn muốn mua bao nhiêu kg?? ");
        Scanner keyboard = new Scanner(System.in);
        double a= keyboard.nextDouble();
        kg = new father(a);

        System.out.println("Bạn cần thanh toán " + kg.cal_so_tien_tra() + " nghìn");
        kg.use_voucher_500();

        System.out.print("đổi số lượng mua: ");
        double b = keyboard.nextDouble();
        kg.setNumber_kg_buy(b);
        //System.out.println(kg.getNumber_kg_buy());

        System.out.println("Bạn cần thanh toán " + kg.cal_so_tien_tra() + " nghìn");
    }

}
