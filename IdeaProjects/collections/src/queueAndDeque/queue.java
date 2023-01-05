package queueAndDeque;
import java.util.LinkedList;
import java.util.Queue;

public class queue{
    public static void main(String[] args) {
        Queue<String> danhSachSV =  new LinkedList<String>();

        boolean a = danhSachSV.add("");
        System.out.println(a);
        danhSachSV.add("Xuan");
        danhSachSV.add("Nguyen");

        boolean check = true;
        while (check) {
            String conLai = danhSachSV.poll();// Lấy ra và xóa khỏi hàng đợi != peek()
            System.out.println(conLai);
            if (conLai == null){
                check = false;
            }
            System.out.println(danhSachSV);
        }
    }
}


