package Vd_FlowLayout;

import javax.swing.*;
import java.awt.*;

public class main_FlowLayout extends JFrame {
    public main_FlowLayout(){
        this.setTitle("Hello World");
        this.setSize(600, 400);

        //căn giữa cửa sổ chương trình
        this.setLocationRelativeTo(null);

        // Set layout
        FlowLayout flowLayout = new FlowLayout();
        FlowLayout flowLayout_1 = new FlowLayout(FlowLayout.RIGHT);
        FlowLayout flowLayout_2 = new FlowLayout(FlowLayout.CENTER, 30, 50);
        /*hgap: khoảng cách giữa các FlowLayout
          vgap: khoảng cách giữa FlowLayout với cái lề trên*/

        //this.setLayout(flowLayout);
        this.setLayout(flowLayout_1);
        //this.setLayout(flowLayout_2);



        JButton jButton_1 = new JButton("1");
        JButton jButton_2 = new JButton("2");
        JButton jButton_3 = new JButton("3");

        //add elements
        this.add(jButton_1);
        this.add(jButton_2);
        this.add(jButton_3);

        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        this.setVisible(true);
    }

    public static void main(String[] args) {
        new main_FlowLayout();

    }
}
