package Vd_JTextArea.listener;
import Vd_JTextArea.view.timKiem_View;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class timKiem_listener implements ActionListener {
    private timKiem_View timKiem_view;

    public timKiem_listener(timKiem_View timKiem_view) {
        this.timKiem_view = timKiem_view;
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        this.timKiem_view.timKiem();
    }
}
