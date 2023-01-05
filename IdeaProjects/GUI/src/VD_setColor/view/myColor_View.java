package VD_setColor.view;

import javax.swing.*;
import VD_setColor.model.myColor_model;
import VD_setColor.listener.myColor_listener;


import java.awt.*;

public class myColor_View extends JFrame {
    static Font font = new Font("Road Rage", Font.PLAIN, 25);
    static Font font_bg = new Font("Road Rage", Font.PLAIN, 18);
    static Font font_text = new Font("Road Rage", Font.PLAIN, 60);
    private myColor_model myColor_model;
    private JLabel jLabel;

    public myColor_View(){
        myColor_model= new myColor_model();
        init();
    }
    public void init(){
        myColor_listener myColor_listener = new myColor_listener(this);

        this.setTitle("My color");
        this.setSize(600, 450);
        this.setLocationRelativeTo(null);
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        this.jLabel = new JLabel("Text, ========");
        this.jLabel.setFont(font_text);
        jLabel.setOpaque(true);

        JPanel jPanel_Center = new JPanel();
        jPanel_Center.setLayout(new GridLayout(2, 3, 4, 4));

        //Tạo 3 nút để chỉnh màu text và 3 nút để chỉnh màu nền
        JButton jButton_text_red = new JButton("Red Text");
        jButton_text_red.addActionListener(myColor_listener);
        jButton_text_red.setForeground(Color.red.darker());
        jButton_text_red.setFont(font);


        JButton jButton_text_blue = new JButton("Blue Text");
        jButton_text_blue.addActionListener(myColor_listener);
        jButton_text_blue.setFont(font);
        jButton_text_blue.setForeground(Color.blue.darker());

        JButton jButton_text_green = new JButton("Green Text");
        jButton_text_green.addActionListener(myColor_listener);
        jButton_text_green.setFont(font);
        jButton_text_green.setForeground(Color.green.darker());

        JButton jButton_background_red = new JButton("Red Back ground");
        jButton_background_red.addActionListener(myColor_listener);
        jButton_background_red.setForeground(Color.white);
        jButton_background_red.setFont(font_bg);
        jButton_background_red.setBackground(Color.RED.brighter());
        jButton_background_red.setOpaque(true);

        JButton jButton_background_cyan = new JButton("Cyan Back ground");
        jButton_background_cyan.addActionListener(myColor_listener);
        jButton_background_cyan.setForeground(Color.white);
        jButton_background_cyan.setFont(font_bg);
        jButton_background_cyan.setBackground(Color.cyan);
        jButton_background_cyan.setOpaque(true);

        JButton jButton_background_green = new JButton("Green Back ground");

        jButton_background_green.addActionListener(myColor_listener);
        jButton_background_green.setForeground(Color.white);
        jButton_background_green.setBackground(Color.GREEN);
        jButton_background_green.setFont(font_bg);
        jButton_background_green.setOpaque(true);

        jPanel_Center.add(jButton_text_red);
        jPanel_Center.add(jButton_text_green);
        jPanel_Center.add(jButton_text_blue);
        jPanel_Center.add(jButton_background_cyan);
        jPanel_Center.add(jButton_background_green);
        jPanel_Center.add(jButton_background_red);



        this.setLayout(new BorderLayout());
        this.add(jPanel_Center, BorderLayout.CENTER);
        this.add(jLabel, BorderLayout.NORTH);
        this.setVisible(true);

    }

    public void changeTextColor(Color color) {
        this.jLabel.setForeground(color);
    }
    public void changeBackGroundColor(Color color){
        this.jLabel.setBackground(color);
        this.jLabel.setOpaque(true);
    }
}
