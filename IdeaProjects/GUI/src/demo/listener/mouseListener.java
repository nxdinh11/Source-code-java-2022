package demo.listener;
import demo.vieww.viewww;

import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;

public class mouseListener implements MouseListener {
    private viewww viewww;

    public mouseListener(viewww viewww){
        this.viewww = viewww;
    }


    @Override
    public void mouseClicked(MouseEvent e) {

    }

    @Override
    public void mousePressed(MouseEvent e) {

    }

    @Override
    public void mouseReleased(MouseEvent e) {
        if(e.isPopupTrigger()){
            this.viewww.jPopupMenu.show(viewww.jPanel_document, e.getX(), e.getY());
        }
    }

    @Override
    public void mouseEntered(MouseEvent e) {

    }

    @Override
    public void mouseExited(MouseEvent e) {

    }
}
