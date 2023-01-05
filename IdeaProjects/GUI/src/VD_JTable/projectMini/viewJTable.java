package VD_JTable.projectMini;

import VD_DefaultTableModel.view.StudentView;

import javax.naming.spi.ObjectFactory;
import javax.swing.*;
import javax.swing.table.DefaultTableModel;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.ArrayList;

public class viewJTable extends JFrame {
    ArrayList<Object> list = new ArrayList<>();
    DefaultTableModel model;
    JTable jTable;
    static int stt = 0;

    public viewJTable(){
        initGUI();
    }
    public void initGUI(){
        this.setTitle("Practise JTable project mini");
        this.setSize(600, 800);
        this.setDefaultCloseOperation(EXIT_ON_CLOSE);
        this.setLocationRelativeTo(null);
        this.setLayout(new BorderLayout());

         jTable = new JTable();

        jTable.setModel(new DefaultTableModel(
                new Object[][]{

                },
                new String[]{
                        "STT","ID","Name","DOB","Address","PhoneNum","Email","Mark"
                }
        ));
        model = (DefaultTableModel) jTable.getModel();

        jButton_insert = new JButton("              Insert              ");
        jButton_insert.addActionListener(ex->setjButton_insert()
//                showResult();
        );
        jButton_delete = new JButton("              Delete              ");

        JScrollPane jScrollPane = new JScrollPane(jTable);
        JPanel jPanel_table = new JPanel();
        jPanel_table.add(jScrollPane, BorderLayout.NORTH);

        JPanel jPanel_button  = new JPanel();
        jPanel_button.setLayout(new GridLayout(7, 2, 3, 3));

        jLabel_name = new JLabel("Name");
        jLabel_id = new JLabel("ID");
        jLabel_address = new JLabel("Address");
        jLabel_dob = new JLabel("DOB");
        jLabel_email = new JLabel("Email");
        jLabel_mark = new JLabel("Mark");
        jLabel_phoneNum = new JLabel("Phone Number");

        jTextField_id = new JTextField();
        jTextField_name = new JTextField();
        jTextField_phoneNum = new JTextField();
        jTextField_mark = new JTextField();
        jTextField_address = new JTextField();
        jTextField_email = new JTextField();
        jTextField_dob = new JTextField();

        jPanel_button.add(jLabel_id);jPanel_button.add(jTextField_id);
        jPanel_button.add(jLabel_name);jPanel_button.add(jTextField_name);
        jPanel_button.add(jLabel_dob);jPanel_button.add(jTextField_dob);
        jPanel_button.add(jLabel_address);jPanel_button.add(jTextField_address);
        jPanel_button.add(jLabel_email);jPanel_button.add(jTextField_email);
        jPanel_button.add(jLabel_phoneNum);jPanel_button.add(jTextField_phoneNum);
        jPanel_button.add(jLabel_mark);jPanel_button.add(jTextField_mark);

        
        this.add(jPanel_table, BorderLayout.NORTH);
        this.add(jPanel_button, BorderLayout.SOUTH);
        this.add(jButton_delete, BorderLayout.WEST);
        this.add(jButton_insert, BorderLayout.EAST);
        this.setVisible(true);
    }
     public void setjButton_insert(){
         Object id  = jTextField_id.getText();
         Object nameText  = jTextField_name.getText();
         Object dobText  = jTextField_dob.getText();
         Object emailText  = jTextField_email.getText();
         Object markText  = jTextField_mark.getText();
         Object phoneNumText  = jTextField_phoneNum.getText();
         Object addressText  = jTextField_address.getText();

         //list.add(name);
          model.addRow(new Object[]{
                       stt+=1,  id, nameText,addressText, dobText,emailText,markText,phoneNumText
                 });
     }
//
//     public void showResult(){
//        Object s = list.get(list.size() -1 );
//        );
//     }
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
        new viewJTable();
    }
    JLabel jLabel_name ;
    JLabel jLabel_id ;
    JLabel jLabel_address ;
    JLabel jLabel_dob ;
    JLabel jLabel_email ;
    JLabel jLabel_mark ;
    JLabel jLabel_phoneNum ;
    JTextField jTextField_name ;
    JTextField jTextField_id ;
    JTextField jTextField_address ;
    JTextField jTextField_dob ;
    JTextField jTextField_email ;
    JTextField jTextField_mark ;
    JTextField jTextField_phoneNum ;
    JButton jButton_insert ;
    JButton jButton_delete;

}
