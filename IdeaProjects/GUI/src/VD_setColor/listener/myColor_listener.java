package VD_setColor.listener;

import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import VD_setColor.view.myColor_View;

public class myColor_listener implements ActionListener {
    private myColor_View myColor_view;

    public myColor_listener(myColor_View myColor_view) {
        this.myColor_view = myColor_view;
    }


    @Override
    public void actionPerformed(ActionEvent e) {
        String nguonSuKien = e.getActionCommand();

        if(nguonSuKien.equals("Red Text")){
            this.myColor_view.changeTextColor(Color.red);
        }else if(nguonSuKien.equals("Blue Text")){
            this.myColor_view.changeTextColor(Color.blue);
        }else if(nguonSuKien.equals("Green Text")){
            this.myColor_view.changeTextColor(Color.green);
        }else if(nguonSuKien.equals("Cyan Back ground")){
            this.myColor_view.changeBackGroundColor(Color.cyan);
        }else if(nguonSuKien.equals("Green Back ground")){
            this.myColor_view.changeBackGroundColor(Color.green);
        }else if(nguonSuKien.equals("Red Back ground")) {
            this.myColor_view.changeBackGroundColor(Color.red);
        }
    }
}
