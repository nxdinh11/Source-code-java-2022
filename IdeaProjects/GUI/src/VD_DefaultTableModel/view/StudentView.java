package VD_DefaultTableModel.view;

/*
 how InsertButton work
 - thực hiện  khởi tạo DefaultTableModel chứa dữ liệu và các cột line 91

- hàm giao diện(initComponents) hoạt động
-insert button hoạt động cùng với ActionListener
và thực hiện chức năng đc gắn ở line 194
thông tin đc thêm vào arrayList ở line 209 và thực hiện hàm showResult thêm hàng dữ liệu vào bảng  line 210
- khi Hàm main hoạt động thì sẽ khởi tạo Arraylist line 28
-getmodel xong rồi tới setmodle line 89
 */

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import javax.swing.*;
import javax.swing.table.DefaultTableModel;

import VD_DefaultTableModel.model.Student;
public class StudentView extends JFrame {

    private final ArrayList<Student> list;
    DefaultTableModel model;

    public StudentView() {
        initComponents();
        this.setLocationRelativeTo(null);
        list = new ArrayList<>();//khởi tạo arraylist
        model = (DefaultTableModel) jTable1.getModel();
        /*This method returns information on the current data model during the processing of
         a personalized reverse engineering. The list of available data is described in the PropertyName values table.*/
    }
    private void initComponents() {

        jLabel1 = new JLabel();
        jLabel2 = new JLabel();
        jLabel3 = new JLabel();
        jLabel4 = new JLabel();
        jLabel5 = new JLabel();
        txtname = new JTextField();
        txtaddress = new    JTextField();
        txtid = new    JTextField();
        txtemail = new    JTextField();
        jLabel6 = new    JLabel();
        txtphonenumber = new    JTextField();
        jLabel7 = new    JLabel();
        txtdob = new    JTextField();
        jLabel8 = new    JLabel();
        txtmark = new    JTextField();
        jButton1 = new    JButton();
        jButton2 = new    JButton();
        jScrollPane1 = new    JScrollPane();
        jTable1 = new    JTable();

        setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
        setTitle("TT Sinh Viên");

        jLabel1.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jLabel1.setText("THÔNG TIN SINH VIÊN");

        jLabel2.setText("Name: ");

        jLabel3.setText("Address: ");

        jLabel4.setText("ID: ");

        jLabel5.setText("Email: ");

        jLabel6.setText("Phone Number: ");

        jLabel7.setText("Date of birth: ");

        jLabel8.setText("Mark: ");

        jButton1.setText("Add Student");
        jButton1.addActionListener(evt -> jButton1ActionPerformed(evt));

        jButton2.setText("Reset");
        jButton2.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });

        jTable1.setModel(new DefaultTableModel(//setModel() để có thể làm tươi (refresh) dữ liệu trên bảng.
                                            //khởi tạo dữ liệu với mảng 2 chiều Object và các cột String
                new Object [][] {

                },
                new String [] {
                        "STT", "ID", "Name", "Date of birth", "Address", "Phone number", "Email", "AVG"
                }
        ));
        jScrollPane1.setViewportView(jTable1);jTable1.setFillsViewportHeight(true);

        GroupLayout layout = new GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
                layout.createParallelGroup(   GroupLayout.Alignment.LEADING)
                        .addGroup(layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(   GroupLayout.Alignment.LEADING)
                                        .addGroup(layout.createSequentialGroup()
                                                .addGap(0, 0, Short.MAX_VALUE)
                                                .addComponent(jButton1)
                                                .addGap(45, 45, 45)
                                                .addComponent(jButton2,    GroupLayout.PREFERRED_SIZE, 90,    GroupLayout.PREFERRED_SIZE)
                                                .addGap(42, 42, 42))
                                        .addGroup(layout.createSequentialGroup()
                                                .addGap(44, 44, 44)
                                                .addGroup(layout.createParallelGroup(   GroupLayout.Alignment.LEADING)
                                                        .addComponent(jLabel2)
                                                        .addComponent(jLabel3)
                                                        .addComponent(jLabel4)
                                                        .addComponent(jLabel5)
                                                        .addComponent(jLabel6)
                                                        .addComponent(jLabel7)
                                                        .addComponent(jLabel8))
                                                .addPreferredGap(   LayoutStyle.ComponentPlacement.RELATED, 33, Short.MAX_VALUE)
                                                .addGroup(layout.createParallelGroup(   GroupLayout.Alignment.LEADING, false)
                                                        .addComponent(txtname)
                                                        .addComponent(txtaddress)
                                                        .addComponent(txtid)
                                                        .addComponent(txtemail)
                                                        .addComponent(txtphonenumber)
                                                        .addComponent(txtdob)
                                                        .addComponent(txtmark,    GroupLayout.PREFERRED_SIZE, 178,    GroupLayout.PREFERRED_SIZE))
                                                .addGap(27, 27, 27)))
                                .addGroup(layout.createParallelGroup(   GroupLayout.Alignment.LEADING)
                                        .addComponent(jLabel1,    GroupLayout.PREFERRED_SIZE, 237,    GroupLayout.PREFERRED_SIZE)
                                        .addComponent(jScrollPane1,    GroupLayout.PREFERRED_SIZE, 671,    GroupLayout.PREFERRED_SIZE))
                                .addContainerGap(   GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
                layout.createParallelGroup(   GroupLayout.Alignment.LEADING)
                        .addGroup(layout.createSequentialGroup()
                                .addContainerGap()
                                .addComponent(jLabel1)
                                .addGap(18, 18, 18)
                                .addGroup(layout.createParallelGroup(   GroupLayout.Alignment.LEADING)
                                        .addGroup(layout.createSequentialGroup()
                                                .addGroup(layout.createParallelGroup(   GroupLayout.Alignment.BASELINE)
                                                        .addComponent(jLabel2)
                                                        .addComponent(txtname,    GroupLayout.PREFERRED_SIZE,    GroupLayout.DEFAULT_SIZE,    GroupLayout.PREFERRED_SIZE))
                                                .addGap(18, 18, 18)
                                                .addGroup(layout.createParallelGroup(   GroupLayout.Alignment.BASELINE)
                                                        .addComponent(jLabel3)
                                                        .addComponent(txtaddress,    GroupLayout.PREFERRED_SIZE,    GroupLayout.DEFAULT_SIZE,    GroupLayout.PREFERRED_SIZE))
                                                .addGap(18, 18, 18)
                                                .addGroup(layout.createParallelGroup(   GroupLayout.Alignment.BASELINE)
                                                        .addComponent(jLabel4)
                                                        .addComponent(txtid,    GroupLayout.PREFERRED_SIZE,    GroupLayout.DEFAULT_SIZE,    GroupLayout.PREFERRED_SIZE))
                                                .addGap(18, 18, 18)
                                                .addGroup(layout.createParallelGroup(   GroupLayout.Alignment.BASELINE)
                                                        .addComponent(jLabel5)
                                                        .addComponent(txtemail,    GroupLayout.PREFERRED_SIZE,    GroupLayout.DEFAULT_SIZE,    GroupLayout.PREFERRED_SIZE))
                                                .addGap(18, 18, 18)
                                                .addGroup(layout.createParallelGroup(   GroupLayout.Alignment.BASELINE)
                                                        .addComponent(jLabel6)
                                                        .addComponent(txtphonenumber,    GroupLayout.PREFERRED_SIZE,    GroupLayout.DEFAULT_SIZE,    GroupLayout.PREFERRED_SIZE))
                                                .addGap(14, 14, 14)
                                                .addGroup(layout.createParallelGroup(   GroupLayout.Alignment.BASELINE)
                                                        .addComponent(jLabel7)
                                                        .addComponent(txtdob,    GroupLayout.PREFERRED_SIZE,    GroupLayout.DEFAULT_SIZE,    GroupLayout.PREFERRED_SIZE))
                                                .addGap(18, 18, 18)
                                                .addGroup(layout.createParallelGroup(   GroupLayout.Alignment.BASELINE)
                                                        .addComponent(jLabel8)
                                                        .addComponent(txtmark,    GroupLayout.PREFERRED_SIZE,    GroupLayout.DEFAULT_SIZE,    GroupLayout.PREFERRED_SIZE))
                                                .addPreferredGap(   LayoutStyle.ComponentPlacement.RELATED,    GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                                .addGroup(layout.createParallelGroup(   GroupLayout.Alignment.BASELINE)
                                                        .addComponent(jButton2)
                                                        .addComponent(jButton1))
                                                .addGap(73, 73, 73))
                                        .addGroup(layout.createSequentialGroup()
                                                .addComponent(jScrollPane1,    GroupLayout.PREFERRED_SIZE, 390,    GroupLayout.PREFERRED_SIZE)
                                                .addContainerGap(54, Short.MAX_VALUE))))
        );

        pack();
    }

    private void jButton2ActionPerformed(ActionEvent evt) {
        txtaddress.setText("");
        txtdob.setText("");
        txtemail.setText("");
        txtid.setText("");
        txtmark.setText("");
        txtname.setText("");
        txtphonenumber.setText("");
    }

    private void jButton1ActionPerformed(ActionEvent evt) {

        Student s = new Student();
        s.setAddress(txtaddress.getText());
        s.setEmail(txtemail.getText());
        s.setID(txtid.getText());
        s.setMark(Float.parseFloat(txtmark.getText()));
        s.setName(txtname.getText());
        s.setPhone(txtphonenumber.getText());
        try {
            s.setDob(new SimpleDateFormat("dd/MM/yyyy").parse(txtdob.getText()));
        } catch (ParseException ex) {
            ex.printStackTrace();
        }
        list.add(s); // them vao danh sach SV
        showResult();
    }

    int i = 1;

    public void showResult(){
        Student s = list.get(list.size()-1);//dữ liệu tại vị trí thứ s trong arrayList
        model.addRow(new Object[]{
                i++, s.getID(), s.getName(), s.getDob() ,s.getAddress(), s.getPhone(), s.getEmail(), s.getMark()
        });
    }
    public static void main(String []args) {
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
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new StudentView().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private    JButton jButton1;
    private    JButton jButton2;
    private    JLabel jLabel1;
    private    JLabel jLabel2;
    private    JLabel jLabel3;
    private    JLabel jLabel4;
    private    JLabel jLabel5;
    private    JLabel jLabel6;
    private    JLabel jLabel7;
    private    JLabel jLabel8;
    private    JScrollPane jScrollPane1;
    private JTable jTable1;
    private    JTextField txtaddress;
    private    JTextField txtdob;
    private    JTextField txtemail;
    private    JTextField txtid;
    private    JTextField txtmark;
    private    JTextField txtname;
    private    JTextField txtphonenumber;
    }

