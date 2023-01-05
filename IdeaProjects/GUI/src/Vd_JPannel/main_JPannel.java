package Vd_JPannel;

import javax.swing.*;
import java.awt.*;

public class main_JPannel extends JFrame {
    public main_JPannel(){
        this.setTitle("My Calculator");
        this.setSize(300, 400);
        this.setLocationRelativeTo(null);//can giua

        // JFrame.setDefaultLookAndFeelDecorated(true);
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        JTextField jTextField  = new JTextField(50);
        this.add(jTextField);//khu vuc Nhap du lieu


        //JPannel là 1 vật chứa có thể chứa các đối tượng khác
        JPanel jPanel_head = new JPanel();
        jPanel_head.setLayout(new BorderLayout());
        jPanel_head.add(jTextField, BorderLayout.CENTER);


        JButton jb_0 = new JButton( "0");
        JButton jb_1 = new JButton( "1");
        JButton jb_2 = new JButton( "2");
        JButton jb_3 = new JButton( "3");
        JButton jb_4 = new JButton( "4");
        JButton jb_5 = new JButton( "5");
        JButton jb_6 = new JButton( "6");
        JButton jb_7 = new JButton( "7");
        JButton jb_8 = new JButton( "8");
        JButton jb_9 = new JButton( "9");
        JButton jb_cong = new JButton( "+");
        JButton jb_tru = new JButton( "-");
        JButton jb_nhan = new JButton( "*");
        JButton jb_chia = new JButton( "/");
        JButton jb_bang = new JButton( "=");

        JPanel jPanel_buttons = new JPanel();
        jPanel_buttons.setLayout(new GridLayout(5, 3));
        jPanel_buttons.add(jb_0);
        jPanel_buttons.add(jb_1);
        jPanel_buttons.add(jb_2);
        jPanel_buttons.add(jb_3);
        jPanel_buttons.add(jb_4);
        jPanel_buttons.add(jb_5);
        jPanel_buttons.add(jb_6);
        jPanel_buttons.add(jb_7);
        jPanel_buttons.add(jb_8);
        jPanel_buttons.add(jb_9);
        jPanel_buttons.add(jb_chia);jPanel_buttons.add(jb_nhan);
        jPanel_buttons.add(jb_cong);
        jPanel_buttons.add(jb_tru);
        jPanel_buttons.add(jb_bang);

        this.setLayout(new BorderLayout());
        this.add(jPanel_head, BorderLayout.NORTH);
        this.add(jPanel_buttons, BorderLayout.CENTER);

        this.setVisible(true);
    }
    public static void main(String[] args) {
        try{
            UIManager.setLookAndFeel(UIManager.getSystemLookAndFeelClassName());
            new main_JPannel();
        }catch (Exception e){
            e.printStackTrace();
        }

    }
}
