
import java.util.HashMap;

public class Main {

    /**
     * Tìm và in ra các ký tự xuất hiện nhiều hơn một lần trong String cho trước không phân biệt chữ hoa hay chữ thường.
     * Nếu các ký tự trong chuỗi đều là duy nhất thì xuất ra "NO". Ví dụ chuỗi "Java" thì có ký tự 'a' hoặc String "JaVA"
     * cũng có kết quả tương tự.
     */

    public static void main(String[] args) {
        System.out.println(1);
        findDuplicateChar(null);
        System.out.println(1);
        findDuplicateChar("Java");
        System.out.println(1);
        findDuplicateChar("Programming");
        System.out.println(1);
        findDuplicateChar("Combination");
        System.out.println(1);
        findDuplicateChar("");

    }

    public static void findDuplicateChar(String str) {
        if (str == null || str.isEmpty()) {
            System.out.println("NO");
            return;
        }

        String original = str;
        // Chuyen chuoi thanh chu thuong
        str = str.toLowerCase();

        HashMap<Character, Integer> map = new HashMap<>();
        for (int i = 0; i < str.length(); i++) {
            if (map.containsKey(str.charAt(i))) {
                map.compute(str.charAt(i), (k, v) -> v + 1);
            } else {
                map.put(str.charAt(i), 1);
            }
        }

        if (map.isEmpty()) {
            System.out.println("NO");
            return;
        }

        System.out.println("List duplicate of " + original + ": ");
        map.forEach((k, v) -> {
            if (v > 1) {
                System.out.println(k);
            }
        });

    }
}