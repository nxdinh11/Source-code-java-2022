package Vd_JTextField.listener;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import Vd_JTextField.view.miniCalculator_view;

public class miniCalculator_listener implements ActionListener {
    private final miniCalculator_view miniCalculatorView;

    public miniCalculator_listener(miniCalculator_view miniCalculatorView) {
        this.miniCalculatorView = miniCalculatorView;
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        String nguonSuKien = e.getActionCommand();
        switch (nguonSuKien) {
            case "+" -> this.miniCalculatorView.plus();
            case "-" -> this.miniCalculatorView.minus();
            case "*" -> this.miniCalculatorView.multiple();
            case "/" -> this.miniCalculatorView.divide();
            case "^" -> this.miniCalculatorView.power();
            case "%" -> this.miniCalculatorView.mod();
        }
    }
}
