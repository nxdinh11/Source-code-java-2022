package VD_setFontSize.controller;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import VD_setFontSize.view.lastButtonView;
public class lastButtonListener implements ActionListener {
    private lastButtonView lastButtonView;

    public lastButtonListener(lastButtonView lastButtonView){
        
        this.lastButtonView = lastButtonView;
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        String nguonSuKien = e.getActionCommand();
        //các số 1 2 3 4 có liên quan đến tên của button
        if(nguonSuKien.equals("1")){
            this.lastButtonView.changTo_1();
        } else if (nguonSuKien.equals("2")) {
            this.lastButtonView.changTo_2();
        }else if(nguonSuKien.equals("3")){
            this.lastButtonView.changTo_3();
        }else if(nguonSuKien.equals("4")){
            this.lastButtonView.changTo_4();
        }


    }
}
