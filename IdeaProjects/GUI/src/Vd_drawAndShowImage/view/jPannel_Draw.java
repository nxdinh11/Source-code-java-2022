package Vd_drawAndShowImage.view;

import javax.swing.*;
import java.awt.*;

public class jPannel_Draw extends JPanel {

    public jPannel_Draw(){
        this.setBackground(Color.white);
    }
    @Override
    protected void paintComponent(Graphics g) {
        super.paintComponent(g);
        g.drawLine(15, 15, 50 , 150);

        g.setColor(Color.blue);
        g.drawOval(255, 255, 50, 50);

        g.setColor(Color.pink);
        g.fillOval(400, 300, 50 , 50);


        g.setColor(Color.green);
        g.drawRect(45, 150, 30, 90);
        g.setColor(Color.red);
        g.fillRect(100, 100, 150 , 150);

        g.setColor(Color.YELLOW);
        g.drawString("Hello Titv", 250, 250);
    }

}
