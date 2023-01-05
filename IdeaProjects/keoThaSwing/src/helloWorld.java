import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class helloWorld extends JFrame{

    private JPanel PanelMain;
    private JTextField k;
    private JList list1;
    private JComboBox comboBox1;
    private JButton button1;
    private JButton button2;
    private JButton hjhjButton;
    private JTabbedPane tabbedPane1;

    public helloWorld() {
        button1.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                k.setText("4453434");
            }
        });
    }

    private void createUIComponents() {
        // TODO: place custom  component creation code here
    }

    public static void main(String[] args) {
        new helloWorld();
    }
}
