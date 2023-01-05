package Vd_Open_SaveFile.vieww;
import Vd_Open_SaveFile.model.MyNotePad_model;

import Vd_Open_SaveFile.controler.myNoteBack_controller;
import javax.swing.*;
import javax.swing.border.EmptyBorder;
import java.awt.*;

public class mYNotePadView extends JFrame{
    private  JPanel conten_panel;
    public  JLabel lblNewLabel;
    public  JTextArea textArea;
    public MyNotePad_model model;

    private JPanel panel1;
    myNoteBack_controller action = new myNoteBack_controller(this);

    public mYNotePadView(){
        init();
    }
public void init(){

    this.model = new MyNotePad_model();
    setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    this.setBounds(220, 100, 689, 500);
    conten_panel = new JPanel();
    conten_panel.setBackground(Color.yellow);

    conten_panel.setBorder(new EmptyBorder(5, 5, 0,5));//căn khung le
    setContentPane(conten_panel);
    conten_panel.setLayout(new BorderLayout(0, 0));

    textArea = new JTextArea();
    textArea.setBackground(Color.cyan.brighter());
    textArea.setFont(new Font("Monospaced", Font.PLAIN, 18));

    JScrollPane scrollPane = new JScrollPane(textArea);
    conten_panel.add(scrollPane, BorderLayout.CENTER);

    JPanel panel_label = new JPanel();
    JPanel panel_button = new JPanel();
    panel_button.setLayout(new GridLayout(1,3, 3, 3));


    panel_label.setLayout(null);// tự custome layout, null là trình quản lý bố cục


    panel_label.setBackground(Color.PINK);
    JPanel jPanel_footer =new JPanel(new GridLayout(1, 2));
    jPanel_footer.setBounds(10, 0 ,50, 10);
    jPanel_footer.add(panel_label);
    jPanel_footer.add(panel_button);
    conten_panel.add(jPanel_footer, BorderLayout.SOUTH);


    lblNewLabel = new JLabel("New label");
    lblNewLabel.setFont(new Font("Tahoma", Font.PLAIN, 18));
    lblNewLabel.setBounds(  10, 0, 314, 39);
    panel_label.add(lblNewLabel);


    JButton btnOpen = new JButton("Open");
    btnOpen.addActionListener(action);
    btnOpen.setFont(new Font("Tahoma", Font.PLAIN, 18));
    btnOpen.setBounds(398, 11, 89, 28);
    panel_button.add(btnOpen);

    JButton btnSave = new JButton("Save");
    btnSave.addActionListener(action);
    btnSave.setFont(new Font("Tahoma", Font.PLAIN, 18));
    btnSave.setBounds(497, 11, 89, 28);
    panel_button.add(btnSave);

    JButton jButton_exit = new JButton("Exit");
    jButton_exit.addActionListener(action);
    panel_button.add(jButton_exit);


    this.setVisible(true);
}
}
