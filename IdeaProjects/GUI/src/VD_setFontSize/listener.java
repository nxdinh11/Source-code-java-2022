package VD_setFontSize;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class listener implements ActionListener{
    private final viu viu;
    public listener(viu viu){
        this.viu = viu;
    }
    @Override
    public void actionPerformed(ActionEvent e) {
        String nguonSuKien = e.getActionCommand();
        switch (nguonSuKien){
            case "1" -> viu.getAction_1();
            case "2" -> viu.getAction_2();
            case "3" -> viu.getAction_3();
            case "4" -> viu.getAction_4();
        }
    }
}
