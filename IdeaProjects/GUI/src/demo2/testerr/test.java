package demo2.testerr;
import VD_DefaultTableModel.view.StudentView;
import demo2.viewer.view;

import javax.swing.*;

public class test {
    public static void main(String[] args) {
        try {
            for (   UIManager.LookAndFeelInfo info :    UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException | InstantiationException | IllegalAccessException |
                 UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(StudentView.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        new view();
    }
}
