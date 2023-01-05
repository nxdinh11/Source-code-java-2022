package muaban.fason;

public class main {
    public static void main(String[] args) {
        father h  = new father(4);
        System.out.println(h.number_kg_buy);
        //System.out.println(h.number_money_pay); không thể gọi vì number_money_pay là private
        System.out.println(h.getNumber_kg_buy());
        System.out.println(h.getNumber_money_pay());// nhưng có  thể dùng getter để truy cập number_money_pay
    }
}
