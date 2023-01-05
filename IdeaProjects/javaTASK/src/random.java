import java.util.Random;

public class random {
    public static void main(String[] args) {
        Random random = new Random();
        int value  =  random.nextInt(4);
        System.out.println(value);
    }
}