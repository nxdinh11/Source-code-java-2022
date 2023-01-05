package Vd_JPannel;

import javax.swing.*;
import java.awt.*;

public class practise extends JFrame {
    public practise() {
    this.setTitle("My calculate");
    this.setSize(300, 500);
    this.setLocationRelativeTo(null);
    this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);


    JTextField jTextField = new JTextField( "ihihi",28);

    JPanel jPanel_head = new JPanel();
    jPanel_head.add(jTextField, BorderLayout.EAST);

    JPanel jPanel_buttons = new JPanel();
    jPanel_buttons.setLayout(new GridLayout(4, 2,10,10));
    JButton jButton1 = new JButton("1");
    JButton jButton2 = new JButton("2");
    JButton jButton3 = new JButton("3");
    JButton jButton4 = new JButton("4");
    JButton jButton5 = new JButton("5");
    JButton jButton6 = new JButton("6");
    JButton jButton7 = new JButton("7");
    JButton jButton8 = new JButton("8");

    jPanel_buttons.add(jButton1);
    jPanel_buttons.add(jButton2);
    jPanel_buttons.add(jButton3);
    jPanel_buttons.add(jButton4);
    jPanel_buttons.add(jButton5);
    jPanel_buttons.add(jButton6);
    jPanel_buttons.add(jButton7);
    jPanel_buttons.add(jButton8);




    this.add(jPanel_buttons);
    this.add(jPanel_head, BorderLayout.NORTH);
    this.setVisible(true);
    }
    public static void main(String[] args) {
        new practise();
    }

}
