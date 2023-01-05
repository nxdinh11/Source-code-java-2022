package VD_JTable;

import java.awt.Color;
import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.JScrollPane;
import javax.swing.JTable;
import javax.swing.SwingUtilities;
import javax.swing.table.DefaultTableModel;

public class Main extends JFrame {
    JTable table = new JTable();
    DefaultTableModel model = new DefaultTableModel(new Object[][]{},new String[]{"A","B","C"});
    public Main() {
        super("Mark");
        table.setModel(model);
        add(new JScrollPane(table));

    }

    public static void main(String[] args) {
        SwingUtilities.invokeLater(new Runnable() {

            public void run() {
                Main ex = new Main();
                ex.setDefaultCloseOperation(EXIT_ON_CLOSE);
                ex.setLocationByPlatform(true);
                ex.pack();
                ex.setVisible(true);
            }
        });
    }
}
