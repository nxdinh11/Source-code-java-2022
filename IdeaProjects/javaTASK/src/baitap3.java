// Write a application allowing users to input width and high of a rectangle and calculating the rectangle's area and perimeter.

import java.util.Scanner;
public class baitap3 {
    public static void main(String[] args) {
        Scanner keyboard = new Scanner(System.in);
        System.out.println("Nhập chiều dài và rộng của hình chữ nhật");
        System.out.println("để tính chu vi và diện tích của hình");
        System.out.println("Chiều dài là: ");
        float a = keyboard.nextInt();
        System.out.println("Chiều rộng là: ");
        float b = keyboard.nextInt();
        System.out.println("Chu vì hình chữ nhật là: " +(a+b)*2);
        System.out.println("Diện tích hình chữ nhật là: " + (a*b));


    }
}
