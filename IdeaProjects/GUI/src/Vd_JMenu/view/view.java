package Vd_JMenu.view;
/*
* tao menu
* phim tat
* thanh cong cu
* tao check box
* menu chuot phai
* tick chon*/
import Vd_JMenu.listener.actionListener;
import Vd_JMenu.listener.menuMouseLListener;

import javax.swing.*;
import java.awt.*;
import java.awt.event.InputEvent;
import java.awt.event.KeyEvent;

public class view extends JFrame {
    // Tao Menu chuot phai
    public JPopupMenu jPopupMenu;
    public JPanel jPanel_document;
    private JToolBar jToolBar;

    public view(){
        prepareGUI();
    }
    private JLabel jLabel;
    static Font font = new Font("Arial", Font.ITALIC, 24);
    public void prepareGUI(){
        this.setTitle("My first Menu");
        this.setSize(500, 600);
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        this.setLocationRelativeTo(null);
        this.setLayout(new BorderLayout());

        //Add ActionListener into Class;
        actionListener actionlisteners = new actionListener(this);

        //Add MouseListener into class;
        menuMouseLListener mouseListener = new menuMouseLListener(this);
        this.addMouseListener(mouseListener);

        jPanel_document= new JPanel();
        jPanel_document.setBackground(Color.PINK);jPanel_document.setOpaque(true);
        jLabel = new JLabel("Documents will be showed here!!!");
        jLabel.setFont(font);jLabel.setForeground(Color.BLACK);
        jPanel_document.add(jLabel);

        JScrollPane jScrollPane = new JScrollPane(jPanel_document, JScrollPane.VERTICAL_SCROLLBAR_ALWAYS, JScrollPane.HORIZONTAL_SCROLLBAR_NEVER);
        //add scrollpane == add jPanel_document

        //Create MenuBar
        JMenuBar jMenuBar = new JMenuBar();

        JMenuItem jMenu_new = new JMenuItem ("New");
        JMenuItem jMenu_open = new JMenuItem("Open");
        JMenuItem jMenu_exit = new JMenuItem("Exit");

        //Create Menu Help
        JMenu jMenu_Help = new JMenu("Help");

        JMenuItem jMenuItem_welcome = new JMenuItem("Welcome");
        jMenu_Help.add(jMenuItem_welcome);

        JMenu jMenu_File = new JMenu("File");
        jMenu_File.add(jMenu_new);jMenu_File.addSeparator();

        jMenu_File.add(jMenu_open);jMenu_File.addSeparator();

        jMenu_File.add(jMenu_exit);//jMenu_File.addSeparator();

        //Create Menu View
        JMenu jMenu_view = new JMenu("View");
        JCheckBoxMenuItem jCheckBoxMenuItem_toolbar = new JCheckBoxMenuItem("Toolbar");

        jMenu_view.add(jCheckBoxMenuItem_toolbar);




        //Create Toolbar
        jToolBar = new JToolBar();

        //Create Buttons for Toolbar
        JButton jButton_undo = new JButton("Undo");jButton_undo.addActionListener(actionlisteners);
        jButton_undo.setToolTipText("click to undo");

        JButton jButton_Redo = new JButton("Redo");jButton_Redo.addActionListener(actionlisteners);
        jButton_Redo.setToolTipText("click to redo");

        JButton jButton_Cut = new JButton("Cut");jButton_Cut.addActionListener(actionlisteners);
        jButton_Cut.setToolTipText("click to cut");

        JButton jButton_Copy = new JButton("Copy");jButton_Copy.addActionListener(actionlisteners);
        jButton_Copy.setToolTipText("click to copy");

        JButton jButton_Paste = new JButton("Paste");jButton_Paste.addActionListener(actionlisteners);
        jButton_Paste.setToolTipText("click to paste");

        //Add previous buttont to jToolbar
        jToolBar.add(jButton_undo);
        jToolBar.add(jButton_Redo);
        jToolBar.add(jButton_Copy);
        jToolBar.add(jButton_Cut);
        jToolBar.add(jButton_Paste);

        //Add ActionListener into buttons
        jMenu_exit.addActionListener(actionlisteners);
        jMenu_new.addActionListener(actionlisteners);
        jMenu_open.addActionListener(actionlisteners);
        jMenuItem_welcome.addActionListener(actionlisteners);
        jCheckBoxMenuItem_toolbar.addActionListener(actionlisteners);

        //Add keyboard shortcut
        jMenu_new.setAccelerator(KeyStroke.getKeyStroke(KeyEvent.VK_N, InputEvent.CTRL_DOWN_MASK));
        jMenu_open.setAccelerator(KeyStroke.getKeyStroke(KeyEvent.VK_O, InputEvent.CTRL_DOWN_MASK));
        jMenu_exit.setAccelerator(KeyStroke.getKeyStroke(KeyEvent.VK_E, InputEvent.ALT_DOWN_MASK));
        jMenu_Help.setMnemonic(KeyEvent.VK_H);

        //Create right-click Menu
        jPopupMenu = new JPopupMenu();
        jPopupMenu.addMouseListener(mouseListener);

        JMenuItem jMenuItem_cut = new JMenuItem("Cut");jMenuItem_cut.addActionListener(actionlisteners);
        JMenuItem jMenuItem_copy = new JMenuItem("Copy");jMenuItem_copy.addActionListener(actionlisteners);
        JMenuItem jMenuItem_paste = new JMenuItem("Paste");jMenuItem_paste.addActionListener(actionlisteners);

        JMenuItem jMenuItem_size = new JMenuItem("Size");jMenuItem_size.addActionListener(actionlisteners);
        JMenuItem jMenuItem_type = new JMenuItem("Type");jMenuItem_type.addActionListener(actionlisteners);
        JMenu jMenu_font = new JMenu("Font");
        jMenu_font.add(jMenuItem_type);jMenu_font.addSeparator();
        jMenu_font.add(jMenuItem_size);

        jPopupMenu.add(jMenu_font);jPopupMenu.addSeparator();
        jPopupMenu.add(jMenuItem_copy);jPopupMenu.addSeparator();
        jPopupMenu.add(jMenuItem_cut);jPopupMenu.addSeparator();
        jPopupMenu.add(jMenuItem_paste);

        jMenuBar.add(jMenu_File);
        jMenuBar.add(jMenu_view);
        jMenuBar.add(jMenu_Help);

        JPanel jPanel = new JPanel();
        jPanel.setLayout(new FlowLayout(FlowLayout.LEFT, 5,10));


        JPanel jPanel1 = new JPanel();
        jPanel.setLayout(new FlowLayout(FlowLayout.CENTER, 80,80));


        JPanel jPanel2 = new JPanel();
        jPanel.setLayout(new FlowLayout(FlowLayout.LEADING, 5,10));

        JPanel jPanel3 = new JPanel();
        jPanel.setLayout(new FlowLayout(FlowLayout.LEADING, 5,10));

        this.add(jPanel, BorderLayout.EAST);
        this.add(jScrollPane, BorderLayout.CENTER);
        this.add(jPanel1, BorderLayout.SOUTH);
        this.add(jPanel2, BorderLayout.WEST);
        this.add(jPanel3, BorderLayout.NORTH);
        this.setJMenuBar(jMenuBar);

        this.setVisible(true);
    }
    public void setjLabel(String s){
        this.jLabel.setText(s);
    }
    public void enableToolbar() {
        this.add(jToolBar, BorderLayout.NORTH);
        refresh();
    }
    public void disableToolbar(){
        this.remove(jToolBar);
        refresh();
    }
    //Ham refesh giao dien
    public void refresh(){
        this.pack();
        this.setSize(500, 600);
    }
}
