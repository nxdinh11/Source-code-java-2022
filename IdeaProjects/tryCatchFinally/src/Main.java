
import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Scanner key = new Scanner(System.in);
        boolean check ;
        do {
            try {
                int i = key.nextInt();
                int b = key.nextInt();
                System.out.println(i);
                System.out.println(b);
                check = true;
            }catch (Exception e){
                check = false;
                key.nextLine();// Dòng này để đọc ký tự Enter lúc nhập, thực ra Enter sẽ gồm 2 ký tự trở về đầu dòng và
                // sinh dòng mới, bạn tra bảng mã Ascii sẽ rõ.
            }
        }while(!check);

  }
}