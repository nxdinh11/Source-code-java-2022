import java.util.Scanner;
public class demo {
    public static void main(String[] args) {
         Scanner key = new Scanner(System.in);
         boolean check ;
        String ten;
         do {
             try {
                 do {
                     ten = key.nextLine();
                     if(ten.isEmpty()){
                         System.out.println("ten khong dc rong");
                     }
                     System.out.println(ten);
                 }while(ten.isEmpty());
                 check = true;
             }catch (Exception e){
                 check = false;
             }
         }while(!check);
    }
}
