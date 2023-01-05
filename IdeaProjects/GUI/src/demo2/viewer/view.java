package demo2.viewer;
import demo2.listener.listener;
import demo2.model.model;
import javax.swing.*;
import java.awt.*;

public class view extends JFrame {
    static Font font = new Font("Arial", Font.BOLD, 22);
    private model model;
    public view(){
        this.model = new model();
        prepareGUI();
    }
    public void prepareGUI(){

        listener listener = new listener(this);

        this.setTitle("My calculate");
        this.setSize(300, 200);
        this.setDefaultCloseOperation(EXIT_ON_CLOSE);
        this.setLocationRelativeTo(null);
        this.setLayout(new BorderLayout());

        jTextField1 = new JTextField(14);jTextField2 = new JTextField(14);
        jButton_divide = new JButton("/");jButton_divide.setFont(font);
        jButton_divide.addActionListener(listener);

        jButton_minus = new JButton("-");jButton_minus.setFont(font);
        jButton_minus.addActionListener(listener);

        jButton_plus= new JButton("+");jButton_plus.setFont(font);
        jButton_plus.addActionListener(listener);

        jButton_times = new JButton("*");jButton_times.setFont(font);
        jButton_times.addActionListener(listener);

        JPanel jPanel_header  =  new JPanel();
        jPanel_header.setLayout(new GridLayout(1, 2));
        jPanel_header.add(jTextField1);jPanel_header.add(jTextField2);

        JPanel jPanel_button  = new JPanel();jPanel_button.setBackground(Color.PINK);
        jPanel_button.setLayout(new GridLayout(2,2));
        jPanel_button.add(jButton_plus);
        jPanel_button.add(jButton_minus);
        jPanel_button.add(jButton_times);
        jPanel_button.add(jButton_divide);

        JPanel jPanel_ok = new JPanel();
        jTextField_ok = new JTextField();jTextField_ok.setFont(font);

        jPanel_ok.setLayout(new GridLayout(1, 2));

        jPanel_ok.add(jTextField_ok);


        this.add(jPanel_header, BorderLayout.NORTH);
        this.add(jPanel_button, BorderLayout.CENTER);
        this.add(jPanel_ok, BorderLayout.SOUTH);

        this.setVisible(true);
        //pack();
    }
    public JTextField jTextField1;private JTextField jTextField_ok;
    public JTextField jTextField2;
    private JButton jButton_plus;
    private JButton jButton_times;
    private JButton jButton_minus;
    private JButton jButton_divide;


    public void plus(){
        this.model.setValue_1(Float.parseFloat(jTextField1.getText()));
        this.model.setValue_2(Float.parseFloat(jTextField2.getText()));
        this.model.plus();
        jTextField_ok.setText(String.valueOf(this.model.getTotal()));
    }

    public void minus(){
        this.model.setValue_1(Float.parseFloat(jTextField1.getText()));
        this.model.setValue_2(Float.parseFloat(jTextField2.getText()));
        this.model.minus();
        jTextField_ok.setText(String.valueOf(this.model.getTotal()));
    }
    public void divide(){
        this.model.setValue_1(Float.parseFloat(jTextField1.getText()));
        this.model.setValue_2(Float.parseFloat(jTextField2.getText()));
        this.model.divide();
        jTextField_ok.setText(String.valueOf(this.model.getTotal()));
    }
    public void times(){
        this.model.setValue_1(Float.parseFloat(jTextField1.getText()));
        this.model.setValue_2(Float.parseFloat(jTextField2.getText()));
        this.model.times();
        jTextField_ok.setText(String.valueOf(this.model.getTotal()));
    }

}
