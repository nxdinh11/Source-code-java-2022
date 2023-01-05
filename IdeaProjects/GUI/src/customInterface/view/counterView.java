package customInterface.view;

import customInterface.controller.counterListener;
import customInterface.model.counterModel;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionListener;


public class counterView extends JFrame {
    private counterModel counterModel;
    private JButton jButton_up;
    private JButton jButton_down;
    private JLabel jLabel_value;


    public counterView(){
        this.counterModel = new counterModel();
        this.init();
        this.setVisible(true);
    }

    private void init() {
        this.setTitle("Counter");

        this.setSize(300, 300);
        this.setLocationRelativeTo(null);
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);


        ActionListener actionListener = new counterListener(this);

        jButton_up = new JButton("Up");
        jButton_up.addActionListener(actionListener);

        jButton_down = new JButton("Down");
        jButton_down.addActionListener(actionListener);

        jLabel_value = new JLabel(this.counterModel.getValue()+"", JLabel.CENTER);

        JPanel jPanel = new JPanel();
        jPanel.setLayout(new BorderLayout());
        jPanel.add(jButton_up, BorderLayout.WEST);
        jPanel.add(jLabel_value, BorderLayout.CENTER);
        jPanel.add(jButton_down, BorderLayout.EAST);


        this.setLayout(new BorderLayout());
        this.add(jPanel, BorderLayout.CENTER);
    }
    public void increment(){
        this.counterModel.increment();
        this.jLabel_value.setText(this.counterModel.getValue()+"");
    }

    public void decrement(){
        this.counterModel.decrement();
        this.jLabel_value.setText(this.counterModel.getValue()+"");
    }
}
