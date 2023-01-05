package Vd_JMenu.listener;
import Vd_JMenu.view.view;

import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;

public class menuMouseLListener implements MouseListener {
    private view view;

    public menuMouseLListener(view view) {
        this.view = view;
    }

    @Override
    public void mouseClicked(MouseEvent e) {

    }

    @Override
    public void mousePressed(MouseEvent e) {
//        if (e.isPopupTrigger()){
//            this.view.jPopupMenu.show(e.getComponent(), e.getX(), e.getY());
//        }
    }

    @Override
    public void mouseReleased(MouseEvent e) {
        if (e.isPopupTrigger()){
            this.view.jPopupMenu.show(e.getComponent(), e.getX(), e.getY());
        }
    }

    @Override
    public void mouseEntered(MouseEvent e) {

    }

    @Override
    public void mouseExited(MouseEvent e) {

    }
}
