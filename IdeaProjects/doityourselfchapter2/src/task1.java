//Study and use class Character(java.lang.Character)

// Chỉ áp dụng với char

import static java.lang.Character.isLetter;

public class task1{
    public static void main(String[] args) {
        // Các phương thức trong character
        char a = 'a';
        char c = 'D' ;
        String e = new String("dfadfdfda");
        System.out.println(isLetter(a));
        System.out.println(Character.isWhitespace(c));
        System.out.println(Character.toUpperCase(a));
        System.out.println(Character.toString('d'));
        System.out.println(Character.toLowerCase(c));
        System.out.println(e);
    }
}

