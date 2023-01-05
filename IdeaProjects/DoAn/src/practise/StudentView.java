package practise;



import  javax.swing.*;
import  javax.swing.table.DefaultTableModel;
import java.awt.*;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.ArrayList;

public class StudentView extends JFrame {
    private ArrayList<student> list;

    DefaultTableModel model;

    public StudentView() {

        initComponents();
        this.setLocationRelativeTo(null);
        list = new ArrayList<>();//khởi tạo arraylist
        model = (DefaultTableModel) jTable1.getModel();
/*This method returns information on the current data model during the processing of
         a personalized reverse engineering. The list of available data is described in the PropertyName values table.*/
        model.setColumnIdentifiers(new Object[]{
                "STT", "ID", "Full Name", "Date of birth", "Address", "Phone number", "Email", "AVG"
        });
    }

    private void initComponents() {
        jLabel1 = new JLabel();
        jLabel2 = new JLabel();
        jLabel3 = new JLabel();
        jLabel4 = new JLabel();
        jLabel5 = new JLabel();
        txtname = new JTextField();
        txtaddress = new JTextField();
        txtid = new JTextField();
        txtemail = new JTextField();
        jLabel6 = new JLabel();
        txtphonenumber = new JTextField();
        jLabel7 = new JLabel();
        txtdob = new JTextField();
        jLabel8 = new JLabel();
        txtmark = new JTextField();
        jButton1 = new JButton();
        jButton2 = new JButton();
        jScrollPane1 = new JScrollPane();
        jTable1 = new JTable();

        setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
        setTitle("TT Sinh Viên");

        jLabel1.setFont(new java.awt.Font("Tahoma", Font.BOLD, 12)); // NOI18N
        jLabel1.setText("THÔNG TIN SINH VIÊN");

        jLabel2.setText("Name: ");

        jLabel3.setText("Address: ");

        jLabel4.setText("ID: ");

        jLabel5.setText("Email: ");

        jLabel6.setText("Phone Number: ");

        jLabel7.setText("Date of birth: ");

        jLabel8.setText("Mark: ");

        jButton1.setText("Add Student");
        jButton1.addActionListener(evt -> jButton1ActionPerformed());

        jButton2.setText("Reset");
        jButton2.addActionListener(evt -> jButton2ActionPerformed());

        jTable1.setModel(new DefaultTableModel(//setModel() để có thể làm tươi (refresh) dữ liệu trên bảng.
                new Object [][] {

                },
                new String [] {

                }
        ));
        jScrollPane1.setViewportView(jTable1);

        GroupLayout layout = new GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
                layout.createParallelGroup(GroupLayout.Alignment.LEADING)
                        .addGroup(layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(GroupLayout.Alignment.LEADING)
                                        .addGroup(layout.createSequentialGroup()
                                                .addGap(44, 44, 44)
                                                .addGroup(layout.createParallelGroup(GroupLayout.Alignment.LEADING)
                                                        .addComponent(jLabel2)
                                                        .addComponent(jLabel3)
                                                        .addComponent(jLabel4)
                                                        .addComponent(jLabel5)
                                                        .addComponent(jLabel6)
                                                        .addComponent(jLabel7)
                                                        .addComponent(jLabel8))
                                                .addPreferredGap(LayoutStyle.ComponentPlacement.UNRELATED)
                                                .addGroup(layout.createParallelGroup(GroupLayout.Alignment.LEADING, false)
                                                        .addComponent(txtname)
                                                        .addComponent(txtaddress)
                                                        .addComponent(txtid)
                                                        .addComponent(txtemail)
                                                        .addComponent(txtphonenumber)
                                                        .addComponent(txtdob)
                                                        .addComponent(txtmark, GroupLayout.PREFERRED_SIZE, 178, GroupLayout.PREFERRED_SIZE)))
                                        .addGroup(layout.createSequentialGroup()
                                                .addGap(53, 53, 53)
                                                .addComponent(jButton1)
                                                .addGap(38, 38, 38)
                                                .addComponent(jButton2, GroupLayout.PREFERRED_SIZE, 90,GroupLayout.PREFERRED_SIZE)))
                                .addGap(18, 18, 18)
                                .addComponent(jScrollPane1, GroupLayout.DEFAULT_SIZE, 775, Short.MAX_VALUE)
                                .addContainerGap())
                        .addGroup(GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                                .addGap(0, 0, Short.MAX_VALUE)
                                .addComponent(jLabel1, GroupLayout.PREFERRED_SIZE, 237,  GroupLayout.PREFERRED_SIZE)
                                .addGap(360, 360, 360))
        );
        layout.setVerticalGroup(
                layout.createParallelGroup( GroupLayout.Alignment.LEADING)
                        .addGroup(layout.createSequentialGroup()
                                .addContainerGap()
                                .addComponent(jLabel1)
                                .addGap(18, 18, 18)
                                .addGroup(layout.createParallelGroup( GroupLayout.Alignment.LEADING)
                                        .addGroup(layout.createSequentialGroup()
                                                .addGroup(layout.createParallelGroup( GroupLayout.Alignment.BASELINE)
                                                        .addComponent(jLabel2)
                                                        .addComponent(txtname,  GroupLayout.PREFERRED_SIZE,  GroupLayout.DEFAULT_SIZE,  GroupLayout.PREFERRED_SIZE))
                                                .addGap(18, 18, 18)
                                                .addGroup(layout.createParallelGroup( GroupLayout.Alignment.BASELINE)
                                                        .addComponent(jLabel3)
                                                        .addComponent(txtaddress,  GroupLayout.PREFERRED_SIZE,  GroupLayout.DEFAULT_SIZE,  GroupLayout.PREFERRED_SIZE))
                                                .addGap(18, 18, 18)
                                                .addGroup(layout.createParallelGroup( GroupLayout.Alignment.BASELINE)
                                                        .addComponent(jLabel4)
                                                        .addComponent(txtid,  GroupLayout.PREFERRED_SIZE,  GroupLayout.DEFAULT_SIZE,  GroupLayout.PREFERRED_SIZE))
                                                .addGap(18, 18, 18)
                                                .addGroup(layout.createParallelGroup( GroupLayout.Alignment.BASELINE)
                                                        .addComponent(jLabel5)
                                                        .addComponent(txtemail,  GroupLayout.PREFERRED_SIZE,  GroupLayout.DEFAULT_SIZE,  GroupLayout.PREFERRED_SIZE))
                                                .addGap(18, 18, 18)
                                                .addGroup(layout.createParallelGroup( GroupLayout.Alignment.BASELINE)
                                                        .addComponent(jLabel6)
                                                        .addComponent(txtphonenumber,  GroupLayout.PREFERRED_SIZE,  GroupLayout.DEFAULT_SIZE,  GroupLayout.PREFERRED_SIZE))
                                                .addGap(14, 14, 14)
                                                .addGroup(layout.createParallelGroup( GroupLayout.Alignment.BASELINE)
                                                        .addComponent(jLabel7)
                                                        .addComponent(txtdob,  GroupLayout.PREFERRED_SIZE,  GroupLayout.DEFAULT_SIZE,  GroupLayout.PREFERRED_SIZE))
                                                .addGap(18, 18, 18)
                                                .addGroup(layout.createParallelGroup( GroupLayout.Alignment.BASELINE)
                                                        .addComponent(jLabel8)
                                                        .addComponent(txtmark,  GroupLayout.PREFERRED_SIZE,  GroupLayout.DEFAULT_SIZE,  GroupLayout.PREFERRED_SIZE))
                                                .addPreferredGap( LayoutStyle.ComponentPlacement.RELATED,  GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                                .addGroup(layout.createParallelGroup( GroupLayout.Alignment.BASELINE)
                                                        .addComponent(jButton2)
                                                        .addComponent(jButton1))
                                                .addGap(73, 73, 73))
                                        .addGroup(layout.createSequentialGroup()
                                                .addComponent(jScrollPane1,  GroupLayout.PREFERRED_SIZE, 390,  GroupLayout.PREFERRED_SIZE)
                                                .addContainerGap(54, Short.MAX_VALUE))))
        );
        pack();
    }
    private void jButton1ActionPerformed(){
        student s = new student();

        s.setID(txtid.getText());
        s.setAddress(txtaddress.getText());
        s.setMark(Float.parseFloat(txtmark.getText()));
        s.setPhone(txtphonenumber.getText());
        try {
            s.setDob(new SimpleDateFormat("dd/MM/yy").parse(txtdob.getText()));
        }catch (ParseException e){
            e.printStackTrace();
        }
        s.setName(txtname.getText());
        s.setEmail(txtemail.getText());

        list.add(s);// them vao danh sach SV
        showT();
    }
    private void jButton2ActionPerformed() {
        // TODO add your handling code here:
        txtaddress.setText("");
        txtdob.setText("");
        txtemail.setText("");
        txtid.setText("");
        txtmark.setText("");
        txtname.setText("");
        txtphonenumber.setText("");
    }
    int id = 1;
     public void showT(){
         student s = list.get(list.size()-1);
         model.addRow(new Object[]{
            id++,s.getID(), s.getName(),s.getDob(), s.getAddress(), s.getPhone(), s.getEmail(), s.getMark()
         });
     }
    public static void main(String []args) {

        try {
            for ( UIManager.LookAndFeelInfo info :  UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                     UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException | IllegalAccessException | InstantiationException |
                 UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(StudentView.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }


        java.awt.EventQueue.invokeLater(() -> new StudentView().setVisible(true));
    }

    private  JButton jButton1;
    private  JButton jButton2;
    private  JLabel jLabel1;
    private  JLabel jLabel2;
    private  JLabel jLabel3;
    private  JLabel jLabel4;
    private  JLabel jLabel5;
    private  JLabel jLabel6;
    private  JLabel jLabel7;
    private  JLabel jLabel8;
    private  JScrollPane jScrollPane1;
    private  JTable jTable1;
    private  JTextField txtaddress;
    private  JTextField txtdob;
    private  JTextField txtemail;
    private  JTextField txtid;
    private  JTextField txtmark;
    private  JTextField txtname;
    private  JTextField txtphonenumber;
}

