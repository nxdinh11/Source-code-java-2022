package VD_JTable;

import VD_DefaultTableModel.view.StudentView;

import javax.swing.*;
import javax.swing.table.DefaultTableModel;
import java.awt.*;

public class view extends JFrame{

    private DefaultTableModel model;

    public view(){
        GUI();this.setVisible(true);
    }
    public void GUI(){

        this.setTitle("Practise JTable");
        this.setSize(400, 400);
        this.setDefaultCloseOperation(EXIT_ON_CLOSE);
        this.setLocationRelativeTo(null);
        this.setLayout(new BorderLayout());

        int id = 0;
        //Tạo nút xóa
        JButton jButton_delete = new JButton("Delete");
        jButton_delete.addActionListener(e -> {
            int s = Integer.parseInt(JOptionPane.showInputDialog(this,"Input index which you want to delete", JOptionPane.PLAIN_MESSAGE));

            if(s <= 0){
                JOptionPane.showMessageDialog(this,"Wrong index");
            }else s-=1;

            model.removeRow(s);
        });

        //Create insert button
        JButton jButton_insert = new JButton("Insert");


        JPanel jPanel_right = new JPanel();
        jPanel_right.setLayout(new BorderLayout());
        jPanel_right.add(jButton_delete, BorderLayout.WEST);

        JPanel jPanel_left = new JPanel();

        JTable jTable = new JTable();
        jTable.setModel(new DefaultTableModel(
                new Object[][]{
//                        {id+1,"NGUYỄN XUÂN ĐỊNH","22ITE"},
//                        {id+2,"NGUYỄN CHUNG HIẾU","22ITE"},
//                        {id+3,"NGÔ NGỌC ĐÔ","22ITE"},
//                        {id+4,"NGÔ THỊ MỸ DUNG","22ITE"},
//                        {id+5,"GIÁP BÁ HỮU","22ITE"},
//                        {id+6,"TRẦN MINH HOÀI","22ITE"},
//                        {id+7,"NGUYỄN NGỌC DƯƠNG","22ITE"},
                },
                new String[]{"ID","Name","Class"}
                        )
        );
        this.model = (DefaultTableModel) jTable.getModel();
        this.model.addRow(new Object[]{
                        id+1,"NGUYỄN XUÂN ĐỊNH","22ITE"
            }
        );



        JScrollPane jScrollPane = new JScrollPane(jTable);
        this.add(jScrollPane);
        this.add(jPanel_right, BorderLayout.SOUTH);
        //this.add(jPanel_left, BorderLayout.SOUTH);
    }
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
