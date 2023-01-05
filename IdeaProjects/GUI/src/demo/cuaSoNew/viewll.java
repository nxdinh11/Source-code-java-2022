package demo.cuaSoNew;

import javax.swing.*;
import java.awt.*;

public class viewll extends JFrame {
    public viewll(){
        gui();
    }
    public void gui(){
        setTitle("tao tk tiep theo");
        setSize(300, 300);
        JTextField jTextField = new JTextField("heelo");
        add(jTextField, BorderLayout.CENTER);
        setVisible(true);
    }

    public static void main(String[] args) {
        new viewll();
    }
}
