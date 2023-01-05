package customInterface.controller;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import customInterface.view.counterView;

public class counterListener implements ActionListener {
    private counterView ctv;
    public counterListener(counterView ctv){
        this.ctv = ctv;
    }

    @Override
    public void actionPerformed(ActionEvent e) {
//        System.out.println("Ban da nhan nut! ");

        String src = e.getActionCommand();
        System.out.println("Ban da nhan nut " + src);

        if(src.equals("Up")){
            this.ctv.increment();
        }else if(src.equals("Down")){
            this.ctv.decrement();
        }
    }
}
