package Vd_JTextArea.view;

import javax.swing.*;
import javax.swing.text.JTextComponent;

import Vd_JTextArea.model.research_model;
import Vd_JTextArea.listener.timKiem_listener;

import java.awt.*;

public class timKiem_View extends JFrame {
    private JTextField jTextField_tuKhoa;
    private JTextArea jTextArea_vanBan;
    private JLabel jLabel_ketQua;
    private research_model research_model;
    public timKiem_View(){
        this.research_model = new research_model();
        this.init();
    }
    public void init(){
        timKiem_listener timKiem_listener = new timKiem_listener(this);
        Font font = new Font("Arial", Font.ITALIC, 30);

        this.setTitle("Tim Kiem");
        this.setSize(800, 400);
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        this.setLocationRelativeTo(null);

        JLabel jLabel_vanBan = new JLabel("Van ban");
        jLabel_vanBan.setFont(font);
        jLabel_vanBan.setBackground(Color.red);
        jLabel_vanBan.setOpaque(true);

        jTextArea_vanBan = new JTextArea(100, 100);
        jTextArea_vanBan.setFont(font);
        jTextArea_vanBan.setBackground(Color.cyan);
        jTextArea_vanBan.setOpaque(true);



        JLabel jLabel_tuKhoa = new JLabel("Tu khoa");
        jLabel_tuKhoa.setFont(font);
        jLabel_tuKhoa.setBackground(Color.PINK);
        jLabel_tuKhoa.setOpaque(true);

        jTextField_tuKhoa  = new JTextField("Tu khoa");
        jTextField_tuKhoa.setFont(font);
        jTextField_tuKhoa.setBackground(Color.PINK);
        jTextField_tuKhoa.setOpaque(true);


        JPanel jPanel_footer = new JPanel();

        JButton jButton_thongKe = new JButton("Thong ke");
        jButton_thongKe.setFont(font);
        jButton_thongKe.addActionListener(timKiem_listener);
        jButton_thongKe.setBackground(Color.pink);
        jButton_thongKe.setOpaque(true);

        jLabel_ketQua = new JLabel("");
        jLabel_ketQua.setBackground(Color.pink);
        jLabel_ketQua.setFont(font);
        jLabel_ketQua.setOpaque(true);

        jPanel_footer.setLayout(new GridLayout(2,2, 4 ,4));
        jPanel_footer.setBackground(Color.YELLOW);
        jPanel_footer.setOpaque(true);

        jPanel_footer.add(jLabel_tuKhoa);
        jPanel_footer.add(jTextField_tuKhoa);
        jPanel_footer.add(jButton_thongKe);
        jPanel_footer.add(jLabel_ketQua);

        this.setLayout(new BorderLayout());
        this.add(jLabel_vanBan, BorderLayout.NORTH);
        this.add(jTextArea_vanBan, BorderLayout.CENTER);
        this.add(jPanel_footer, BorderLayout.SOUTH);
        this.setVisible(true);

    }
    public void timKiem(){
        this.research_model.setVanBan(jTextArea_vanBan.getText());
        this.research_model.setTuKhoa(jTextField_tuKhoa.getText());
        this.research_model.timKiem();
        this.jLabel_ketQua.setText(this.research_model.getKetQua());
    }
}
