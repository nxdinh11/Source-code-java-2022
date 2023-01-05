package Vd_JTextField.view;
import Vd_JTextField.model.miniCalculatorModel;
import Vd_JTextField.listener.miniCalculator_listener;
import javax.swing.*;
import java.awt.*;

public class miniCalculator_view extends JFrame {
    static private JTextField jTextField_answer;
    static private  JTextField jTextField_firstValue;
    static private  JTextField jTextField_secondValue;

    private final miniCalculatorModel miniCalculatorModel;
    public miniCalculator_view(){
        this.miniCalculatorModel = new miniCalculatorModel();
        init();
    }

    public void init(){
        this.setTitle("Mini Calculator");
        this.setSize(390, 250);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setLocationRelativeTo(null);

        Font font = new Font("Arial", Font.BOLD, 20);
        JLabel jLabel_1stValue = new JLabel("1st Value");//show contents
        jLabel_1stValue.setFont(font);
        JLabel jLabel_2ndValue = new JLabel("2nd Value");
        jLabel_2ndValue.setFont(font);
        JLabel jLabel_answer = new JLabel("The answer");
        jLabel_answer.setFont(font);

        jTextField_firstValue = new JTextField(50);
        jTextField_firstValue.setFont(font);
        jTextField_secondValue = new JTextField(50);
        jTextField_secondValue.setFont(font);
        jTextField_answer = new JTextField(50);
        jTextField_answer.setFont(font);

        JPanel jPanel_IO = new JPanel();
        jPanel_IO.setLayout(new GridLayout(3,2,50, 5));


        jPanel_IO.add(jLabel_1stValue);
        jPanel_IO.add(jTextField_secondValue);
        jPanel_IO.add(jLabel_answer);
        jPanel_IO.add(jTextField_firstValue);
        jPanel_IO.add(jLabel_2ndValue);
        jPanel_IO.add(jTextField_answer);

        miniCalculator_listener miniCalculator_listener = new miniCalculator_listener(this);

        JButton jButton_plus = new JButton("+");
        jButton_plus.setFont(font);
        jButton_plus.addActionListener(miniCalculator_listener);

        JButton jButton_minus = new JButton("-");
        jButton_minus.setFont(font);
        jButton_minus.addActionListener(miniCalculator_listener);

        JButton jButton_mutipe = new JButton("*");
        jButton_mutipe.setFont(font);
        jButton_mutipe.addActionListener(miniCalculator_listener);

        JButton jButton_divide = new JButton("/");
        jButton_divide.setFont(font);
        jButton_divide.addActionListener(miniCalculator_listener);

        JButton jButton_power = new JButton("^");
        jButton_power.setFont(font);
        jButton_power.addActionListener(miniCalculator_listener);

        JButton jButton_mod = new JButton("%");
        jButton_mod.setFont(font);
        jButton_mod.addActionListener(miniCalculator_listener);

        JPanel jPanel_button = new JPanel();
        jPanel_button.setLayout(new GridLayout(2, 3));
        jPanel_button.add(jButton_plus);
        jPanel_button.add(jButton_minus);
        jPanel_button.add(jButton_mutipe);
        jPanel_button.add(jButton_divide);
        jPanel_button.add(jButton_power);
        jPanel_button.add(jButton_mod);


        this.setLayout(new BorderLayout());
        this.add(jPanel_IO, BorderLayout.CENTER);
        this.add(jPanel_button, BorderLayout.SOUTH);

        setVisible(true);

    }
    public void plus(){
        double firstValue = Double.parseDouble(jTextField_firstValue.getText());
        double secondValue = Double.parseDouble(jTextField_secondValue.getText());
        this.miniCalculatorModel.setFirstValue(firstValue);
        this.miniCalculatorModel.setSecondValue(secondValue);
        this.miniCalculatorModel.plus();
        // dua vao textFieldAnswer
        jTextField_answer.setText(this.miniCalculatorModel.getAnswer()+"");

    }
    public void minus(){
        double firstValue = Double.parseDouble(jTextField_firstValue.getText());
        double secondValue = Double.parseDouble(jTextField_secondValue.getText());
        this.miniCalculatorModel.setFirstValue(firstValue);
        this.miniCalculatorModel.setSecondValue(secondValue);
        this.miniCalculatorModel.minus();
        // dua vao textFieldAnswer
        jTextField_answer.setText(this.miniCalculatorModel.getAnswer()+"");
    }
    public void multiple(){
        double firstValue = Double.parseDouble(jTextField_firstValue.getText());
        double secondValue = Double.parseDouble(jTextField_secondValue.getText());
        this.miniCalculatorModel.setFirstValue(firstValue);
        this.miniCalculatorModel.setSecondValue(secondValue);
        this.miniCalculatorModel.multiple();
        // dua vao textFieldAnswer
        jTextField_answer.setText(this.miniCalculatorModel.getAnswer()+"");
    }
    public void divide(){
        double firstValue = Double.parseDouble(jTextField_firstValue.getText());
        double secondValue = Double.parseDouble(jTextField_secondValue.getText());
        this.miniCalculatorModel.setFirstValue(firstValue);
        this.miniCalculatorModel.setSecondValue(secondValue);
        this.miniCalculatorModel.divide();
        // dua vao textFieldAnswer
        jTextField_answer.setText(this.miniCalculatorModel.getAnswer()+"");
    }
    public void power(){
        double firstValue = Double.parseDouble(jTextField_firstValue.getText());
        double secondValue = Double.parseDouble(jTextField_secondValue.getText());
        this.miniCalculatorModel.setFirstValue(firstValue);
        this.miniCalculatorModel.setSecondValue(secondValue);
        this.miniCalculatorModel.power();
        // dua vao textFieldAnswer
        jTextField_answer.setText(this.miniCalculatorModel.getAnswer()+"");
    }
    public void mod(){// chia lấy dư
        double firstValue = Double.parseDouble(jTextField_firstValue.getText());
        double secondValue = Double.parseDouble(jTextField_secondValue.getText());
        this.miniCalculatorModel.setFirstValue(firstValue);
        this.miniCalculatorModel.setSecondValue(secondValue);
        this.miniCalculatorModel.mod();
        // dua vao textFieldAnswer
        jTextField_answer.setText(this.miniCalculatorModel.getAnswer()+"");
    }

}
