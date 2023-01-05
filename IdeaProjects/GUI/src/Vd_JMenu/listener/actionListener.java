package Vd_JMenu.listener;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import Vd_JMenu.view.view;

import javax.swing.*;

public class actionListener implements ActionListener {
    private final view view;

    public actionListener(view view) {
        this.view = view;
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        String button = e.getActionCommand();

        if (button.equals("Exit")) {
            System.exit(0);
        } else if (button.equals("Toolbar")) {
            AbstractButton checkBox = (AbstractButton) e.getSource();//getSource la 1 object ma ta vua enter, click
            boolean check  =  checkBox.getModel().isSelected();
            if(check){
                this.view.enableToolbar();
            }else this.view.disableToolbar();
        } else this.view.setjLabel("U impressed " + button);
}

}