package Vd_drawAndShowImage.view;

import javax.swing.*;
import java.awt.*;

public class view extends JFrame {
     public view(){
         this.setTitle("Draw example");
         this.setSize(500, 500);
         this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
         this.setLocationRelativeTo(null);

         jPannel_Draw jPannel_draw = new jPannel_Draw();
         this.setLayout(new BorderLayout());
         this.add(jPannel_draw, BorderLayout.CENTER );
         this.setVisible(true);
     }

    public static void main(String[] args) {
        new view();
    }
}
