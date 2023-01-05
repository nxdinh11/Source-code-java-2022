//study and use class stringbuffer
// lớp Stringbuffer giống như String chỉ là nó có thể sửa đổi
import java.util.Scanner;

public class task2 {
    public static void main(String[] args) {
        //Scanner keyboard = new Scanner(System.in);
        //String a = keyboard.nextLine();

        StringBuffer sb =new StringBuffer("chúng ta đi ăn");

        /*System.out.println("Phương thức append()");
        sb.append(" Java");//bay gio chuoi ban dau bi thay doi
        System.out.println(sb);*/

        System.out.println("Phương thức insert: ");
        sb.insert(3, "hihi");
        System.out.println(sb);

        System.out.println("Phương thức replace: ");
        sb.replace(9, 14, "đi uống");
        System.out.println(sb);

        System.out.println("Phương thức delete: ");
        sb.delete(11,21);
        System.out.println(sb);

        System.out.println("Phương thức reserve: ");//giống như mirror
        sb.reverse();
        System.out.println(sb);

        System.out.println("Phương thức capacity: ");// Trả về dung lượng bộ nhớ hiện tại mặc định là 16.
        //Nếu số ký tự tăng lên từ dung lượng hiện tại, nó tăng dung lượng theo công thức (oldcapacity*2)+2
        System.out.println(sb.capacity());

        sb.ensureCapacity(3);// với 3 là minimum
//rằng capacity ít nhất bằng với minimum đã cho. Nếu nó lớn hơn capacity hiện tại, nó tăng capacity theo công thức (oldcapacity*2)+2.
        System.out.println(sb.capacity());



    }
}
