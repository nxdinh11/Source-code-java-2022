package practise;

import javax.swing.*;
import java.awt.*;
public class demo2 extends JFrame{
    public demo2(){
        this.setSize(500, 300);
        this.setLocationRelativeTo(null);
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        JPanel jPanel = new JPanel() ;
        FlowLayout flowLayout = new FlowLayout(12);
        GridLayout gridLayout = new GridLayout(4, 4);
        jPanel.setLayout(flowLayout);


        JButton btn = new JButton("Initial Text");

        btn.setText("New text!");

        String text = btn.getText();

        btn.setVisible(false);

        btn.setVisible(true);

        btn.setMargin(new Insets(100, 100, 100, 100));

        Dimension dim = btn.getSize();

        btn.setBackground(Color.BLUE);

        btn.setForeground(Color.WHITE);

        btn.setEnabled(false);

        btn.setEnabled(true);

        btn.setSize(new Dimension(10, 10));

        btn.setBounds(new Rectangle(20, 20, 200, 60));

        jPanel.add(btn);
        this.add(jPanel);
        this.setContentPane(jPanel);

        this.setVisible(true);
    }
    public static void main(String[] args) {
        new demo2();
    }

}
