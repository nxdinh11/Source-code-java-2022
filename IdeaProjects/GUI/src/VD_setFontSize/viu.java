package VD_setFontSize;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionListener;


public class viu extends JFrame{

    private final modell modell;
    static Font font = new Font("Road Rage", Font.PLAIN, 28);
    static Font font1 = new Font("Time New Roman",Font.PLAIN , 30);
    JLabel jLabel;
    public viu(){
        modell = new modell();
        init();
    }
    public void init(){

        // Create listener
        listener listener = new listener(this);

        this.setTitle("My calculator");
        this.setSize(300, 350);
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        this.setLocationRelativeTo(null);

        JPanel jPanel_header = new JPanel();
        jPanel_header.setLayout(new GridLayout(2, 2, 3, 4 ));
        JButton jButton_1 = new JButton("1");
        JButton jButton_2 = new JButton("2");
        JButton jButton_3 = new JButton("3");
        JButton jButton_4 = new JButton("4");

        jButton_1.setFont(font);jButton_1.addActionListener(listener);
        jButton_2.setFont(font);jButton_2.addActionListener(listener);
        jButton_3.setFont(font);jButton_3.addActionListener(listener);
        jButton_4.setFont(font);jButton_4.addActionListener(listener);


        jPanel_header.add(jButton_1);
        jPanel_header.add(jButton_2);
        jPanel_header.add(jButton_3);
        jPanel_header.add(jButton_4);

        JPanel jPanel_footer = new JPanel();
        jLabel = new JLabel("---------------------");
        jLabel.setFont(font);
        jPanel_footer.add(jLabel);



        this.setLayout(new BorderLayout());
        this.add(jPanel_header, BorderLayout.CENTER);
        this.add(jPanel_footer, BorderLayout.SOUTH);

        this.setVisible(true);
    }

    public void getAction_1(){
        modell.set1();
        jLabel.setText("I luv U");
        //jLabel.setText("Pressed button " + modell.getValue());
    }
    public void getAction_2(){
        modell.set2();
        jLabel.setText("Pressed button " + modell.getValue());
    }
    public void getAction_3(){
        modell.set3();
        jLabel.setText("Pressed button " + modell.getValue());
    }
    public void getAction_4(){
        modell.set4();
        jLabel.setText("Pressed button " + modell.getValue());
    }

}