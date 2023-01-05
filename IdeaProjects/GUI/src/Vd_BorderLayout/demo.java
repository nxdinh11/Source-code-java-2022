package Vd_BorderLayout;

import javax.swing.*;
import java.awt.*;

public class demo extends JFrame {
    public demo(){
        this.setTitle("Hello world");
        this.setSize(300, 400);
        this.setLocationRelativeTo(null);

//      1 so layout
        BorderLayout bl = new BorderLayout(14, 14);
        FlowLayout fl = new FlowLayout();
        GridLayout gl = new GridLayout(2, 2);

        //add layout
        this.setLayout(bl);

        //add button
        JButton jButton = new JButton("1");
        JButton jButton1 = new JButton("2");
        JButton jButton2 = new JButton("3");
        JButton jButton3 = new JButton("4");



        this.add(jButton1);
        this.add(jButton);
        this.add(jButton2);
        this.add(jButton3);

        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        this.setVisible(true);
    }

    public static void main(String[] args) {
        new demo();
    }
}
