import java.util.Objects;
import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Scanner key = new Scanner(System.in);
        String abc;
        Application []app = new Application[5];
        app[0] = new Application("1", 33, 222, "win", 111, 5 );
        app[1] = new Application("2", 53, 225, "mac", 511, 1 );
        app[2] = new Application("3", 34, 22, "win", 117, 2 );
        app[3] = new Application("4", 23, 232, "mac", 311, 4 );
        app[4] = new Application("5", 3, 212, "in", 111, 3);
    do {
        abc = key.nextLine();
        switch (abc){
            case "2":
                for(Application obj : app){
                    System.out.println(obj);
                }break;
            case "3":
                for(Application obj : app){
                    obj.setPrice(obj.discount());
                }
                for(Application obj : app){
                    System.out.println(obj);
                }
                break;


            case "4":
                System.out.println("app co so luong ban cao nhat");
                Application a;
                for(int i = 0; i < app.length-1; i++){
                    for(int j  = i+1; j< app.length; j++){
                        if(app[i].getSold() > app[j].getSold()){
                            a = app[j];
                            app[j] = app[i];
                            app[i] = a;
                        }
                    }
                }
                Application n = app[app.length -1];
                System.out.println(n);
                break;
            case "5":
                System.out.println("press c to exit");
                abc= key.nextLine();break;
            default:
        }
    }while(!Objects.equals(abc, "c"));
    }
}