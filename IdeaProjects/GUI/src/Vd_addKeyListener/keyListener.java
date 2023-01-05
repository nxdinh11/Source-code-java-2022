package Vd_addKeyListener;

import javax.swing.*;
import java.awt.*;
import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;

public class keyListener {

    public static void main(String[] args) {
        JFrame frame = new JFrame();
        frame.setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);

        frame.setLayout(new GridLayout(2, 2));
        JPasswordField passwordField = new JPasswordField();
        passwordField.setEchoChar('*');

        passwordField.addCaretListener(ex -> System.out.println(String.valueOf(passwordField.getPassword())));



        passwordField.addKeyListener(new KeyListener() {
            @Override
            public void keyTyped(KeyEvent event) {
               // System.out.println("key typed");
            }
            @Override
            public void keyReleased(KeyEvent event) {
                //System.out.println("key released");
            }
            @Override
            public void keyPressed(KeyEvent event) {
                //System.out.println("key pressed");
            }
        });
        frame.add(passwordField);
        frame.setSize(300, 100);
        frame.setLocationRelativeTo(null);
        frame.setVisible(true);
    }
}
