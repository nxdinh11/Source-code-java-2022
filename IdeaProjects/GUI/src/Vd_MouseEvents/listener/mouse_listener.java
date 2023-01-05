package Vd_MouseEvents.listener;

import Vd_MouseEvents.view.mouse_view;

import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;
import java.awt.event.MouseMotionListener;

public class mouse_listener implements MouseListener, MouseMotionListener {

    private mouse_view mouse_view;
    public mouse_listener(mouse_view mouse_view) {
        this.mouse_view = mouse_view;
    }

    @Override
    public void mouseClicked(MouseEvent e) {
        this.mouse_view.click();
    }

    @Override
    public void mousePressed(MouseEvent e) {

    }

    @Override
    public void mouseReleased(MouseEvent e) {

    }


    @Override
    public void mouseEntered(MouseEvent e) {
        this.mouse_view.enter();
        int x = e.getX();
        int y = e.getY();
        this.mouse_view.update(x, y);
    }

    @Override
    public void mouseExited(MouseEvent e) {
        this.mouse_view.exit();
    }

    @Override
    public void mouseDragged(MouseEvent e) {

    }

    @Override
    public void mouseMoved(MouseEvent e) {//get coordinate of the mouse
        int x = e.getX();
        int y = e.getY();
        this.mouse_view.update(x, y);
    }
}
