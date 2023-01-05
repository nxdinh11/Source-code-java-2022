package demo2.listener;
import demo2.viewer.view;

import javax.swing.*;
import java.awt.event.*;


public class listener implements ActionListener {

    private view view;
    public listener(view view){
        this.view = view;
    }
    @Override
    public void actionPerformed(ActionEvent e) {
        String suKien = e.getActionCommand();
        switch (suKien){
            case "+" -> {
                if(this.view.jTextField1.getText().equals("") ||this.view.jTextField2.getText().equals("")){
                    JOptionPane.showMessageDialog(this.view, "Empty number");
                }else this.view.plus();
            }
            case "-" -> this.view.minus();
            case "/" -> this.view.divide();
            case "*" -> this.view.times();
        }
    }
}
