import java.lang.Math;
public class task4 {
    public static void main(String[] args) {
        //Math.PI hằng số PI

        double g45 = Math.PI/4;
        //Math.abs() trả về giá trị tuyệt đối của tham số

        int a = Math.abs(10);  // 10
        int b = Math.abs(-20); // 20
        //Math.ceil() trả về giá trị double là số làm tròn tăng bằng giá trị số nguyên gần nhất

        double c = Math.ceil(7.342);  // 8.0
        //Math.floor() trả về double là số làm tròn giảm

        double f = Math.floor(7.343);  // 7.0
        //Math.max() lấy số lớn trong hai số

        int m = Math.max(10, 20);  // 20

        int mp = Math.min(10, 20);  // 10
        //Math.pow lấy lũy thừa (cơ-số, số mũ)

        double p = Math.pow(2, 3); // 8.0
        //Math.Math.sqrt() khai căn

        double ab = Math.sqrt(9);//3
        //Math.sin(), Math.cos() sin và cos của góc đơn vị radian

        double s = Math.sin(Math.PI/2);//1
        //Math.random() sinh số double ngẫu nhiên từ 0 đến 1

        double r = Math.random();
        //Math.toDegrees() đổi góc radian thành độ

        double goc = Math.toDegrees(Math.PI/2); //90
        //Math.toRadians() đổi góc đơn vị độ ra radian

        double gocc = Math.toRadians(45);//0.7853981633974483
    }
}
