package Vd_GridLayout;

import javax.swing.*;
import java.awt.*;

public class main_gridLayout extends JFrame {
    public main_gridLayout(){
        this.setTitle("Hello World");
        this.setSize(600, 400);

        //căn giữa cửa sổ chương trình
        this.setLocationRelativeTo(null);

        // Set layout
        GridLayout gridLayout = new GridLayout();
        GridLayout gridLayout_1 = new GridLayout(4,4 );
        GridLayout gridLayout_2 = new GridLayout(4, 4 , 10, 10);
        /*hgap: khoảng cách giữa các GridLayout
          vgap: khoảng cách giữa GridLayout với cái lề trên*/

        //this.setLayout(gridLayout);
        //this.setLayout(gridLayout_1);

        this.setLayout(gridLayout_2);



//        JButton jButton_1 = new JButton("1");
//        JButton jButton_2 = new JButton("2");
//        JButton jButton_3 = new JButton("3");

        for(int i = 1; i<=16; i++){
            JButton jButton = new JButton(i+"");
            this.add(jButton);
        }

        //add elements
//        this.add(jButton_1);
//        this.add(jButton_2);
//        this.add(jButton_3);

        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        this.setVisible(true);
    }

    public static void main(String[] args) {
        new main_gridLayout();

    }
}
