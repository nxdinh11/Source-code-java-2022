package extendd;
public class main {
    public static void main(String[] args) {


        vietnamese n = new vietnamese("dinh", 2004);
        africa a = new africa();
        american b = new american("american name", 2200);

        System.out.println(n.getHoVaTen());
        System.out.println(a.getHoVaTen());
        System.out.println(b.getHoVaTen());

        System.out.println(n.xinChao());
        System.out.println(a.xinChao());
        System.out.println(b.xinChao());
    }
}
