package Vd_addImage.view;

import java.awt.BorderLayout;
import java.awt.Font;
import java.awt.Toolkit;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.*;

public class View extends JFrame {
    private JMenu menu, submenu;
    private JMenuItem i1, i2, i3, i4, i5;
    private JMenuBar mb = new JMenuBar();
    private JButton jButton;
    private JLabel jLabel;

    public View() {
        this.setTitle("TITV");
        this.setSize(600, 600);
        this.setLocationRelativeTo(null);
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        this.setLayout(new BorderLayout());

        // Set Icon => JFrame
//        URL urlIconNotepad = MainView.class.getResource("notepad-icon1.png");
//        Image img = Toolkit.getDefaultToolkit().createImage(urlIconNotepad);
//          Exchange icon shortcut
        //this.setIconImage(new ImageIcon(Toolkit.getDefaultToolkit().createImage(MainView.class.getResource("notepad-icon.png"))).getImage());
        this.setIconImage(Toolkit.getDefaultToolkit().getImage("C:\\Users\\nguye\\OneDrive\\Pictures\\bát giới.jpg"));
        // JMenuBar
        menu = new JMenu("Menu");
        submenu = new JMenu("Sub Menu");
        i1 = new JMenuItem("New");
        i1.setIcon(new ImageIcon(Toolkit.getDefaultToolkit().getImage("C:\\Users\\nguye\\Downloads\\icon\\notepad-icon1.png")));
        i2 = new JMenuItem("Save");
        //i2.setIcon(new ImageIcon(Toolkit.getDefaultToolkit().createImage(View.class.getResource("icon_save.png"))));
        i3 = new JMenuItem("Save As");
        //i3.setIcon(new ImageIcon(Toolkit.getDefaultToolkit().createImage(View.class.getResource("icon_save_as.png"))));
        i4 = new JMenuItem("Exit");
        //i4.setIcon(new ImageIcon(Toolkit.getDefaultToolkit().createImage(View.class.getResource("icon_exit.png"))));
        i5 = new JMenuItem("Test");
        menu.add(i1);
        menu.add(i2);
        menu.add(i3);
        submenu.add(i4);
        submenu.add(i5);
        menu.add(submenu);
        mb.add(menu);


        // JLabel
        jLabel = new JLabel();
        jLabel.setIcon(new ImageIcon(Toolkit.getDefaultToolkit().createImage(View.class.getResource("bát giới.jpg"))));

        // JButton
        jButton = new JButton("TEST BUTTON");jButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                Toolkit.getDefaultToolkit().beep();
            }
        });
       // jButton.setIcon(new ImageIcon(Toolkit.getDefaultToolkit().createImage(View.class.getResource("icon_exit.png"))));
        jButton.setFont(new Font("Arial", Font.BOLD, 50));
        jButton.setSize(50, 50);

        this.setJMenuBar(mb);
        this.add(jLabel, BorderLayout.CENTER);
        this.add(jButton, BorderLayout.SOUTH);
        this.setVisible(true);
    }

    public static void main(String[] args) {
        try {
            UIManager.setLookAndFeel(UIManager.getSystemLookAndFeelClassName());
            new View();
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
