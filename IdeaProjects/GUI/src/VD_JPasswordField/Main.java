package VD_JPasswordField;

import javax.swing.*;
import javax.swing.event.CaretEvent;
import javax.swing.event.CaretListener;
import java.awt.*;

public class Main{

    public static void main(String[] args) {
        JFrame frame = new JFrame();
        frame.setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);

        frame.setLayout(new GridLayout(2, 2));
        JLabel label = new JLabel("User Name:", SwingConstants.LEFT);label.setFont(new Font("Arial", Font.PLAIN, 30));
        JLabel label2 = new JLabel("Password:", SwingConstants.LEFT);label2.setFont(new Font("Arial", Font.PLAIN, 30));
        JTextField userNameField = new JTextField(20);userNameField.setFont(new Font("Arial", Font.PLAIN, 26));
        JPasswordField passwordField = new JPasswordField();passwordField.setFont(new Font("Arial", Font.PLAIN, 26));

        // Xu ly su kien moi khi nguoi dung nhap mat khau
        passwordField.addCaretListener(ex ->
                System.out.println("Mat khau:" + String.valueOf(passwordField.getPassword()))
        );

        frame.add(label);
        frame.add(userNameField);
        frame.add(label2);
        frame.add(passwordField);
        frame.setSize(600, 200);
        frame.setLocationRelativeTo(null);
        frame.setVisible(true);
    }
}