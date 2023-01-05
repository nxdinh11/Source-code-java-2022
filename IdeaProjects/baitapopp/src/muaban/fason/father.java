package muaban.fason;/* Khai báo thuộc tính
Tạo Constructor
Tạo các phương thức
get, set<instance variable>(){}*/

public class father {

    public   double number_kg_buy;
    private final double number_money_pay;

    public father(double weight ){
        this.number_kg_buy = weight;
        this.number_money_pay = 5;}

    public double getNumber_money_pay() {
        return number_money_pay;
    }

    public double cal_so_tien_tra(){
        return this.number_kg_buy * this.number_money_pay;
    }
    public void use_voucher_500(){// dùng void thì k in ra bằng print, có void thì k có return và ngược lại
        if (this.cal_so_tien_tra()> 500){
            System.out.println("Bạn được giảm " + (cal_so_tien_tra()*0.01) + " sau khi áp dụng voucher 500k!!");
        }
        else
            System.out.println("Số tiền phải trả là: " + cal_so_tien_tra());
    }
    public double getNumber_kg_buy(){// lấy giá trị của biến nhập vào
        return this.number_kg_buy;
    }

    public String toString(){
        return this.number_kg_buy  + "/" +this.number_money_pay;
    }

    public void setNumber_kg_buy(double a){// thay đổi giá trị
        if (a >=1){
            this.number_kg_buy = a;
        }

    }


}
