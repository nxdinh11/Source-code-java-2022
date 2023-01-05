package VD_setFontSize.view;

import VD_setFontSize.controller.lastButtonListener;
import VD_setFontSize.model.lastButtonModel;
import javax.swing.*;
import java.awt.*;

public class lastButtonView extends JFrame {
    private lastButtonModel lastButtonModel;
    //set Font
    static Font font = new Font("Arial", Font.ITALIC, 40);
    public lastButtonView(){
        this.lastButtonModel = new lastButtonModel();
        this.init();

    }
    JLabel jLabel;
    private void init() {
        this.setTitle("Last Button");
        this.setLocationRelativeTo(null);
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        this.setSize(300, 300);

        JPanel jPanel_Center = new JPanel();
        jPanel_Center.setLayout(new GridLayout(2, 2));


        JButton jButton_1 = new JButton("1");
        JButton jButton_2 = new JButton("2");
        JButton jButton_3 = new JButton("3");
        JButton jButton_4 = new JButton("4");

        //Tao Listener
        lastButtonListener lastButtonListener = new lastButtonListener(this);
//      add listener vào các nút
        jButton_1.addActionListener(lastButtonListener);
        jButton_2.addActionListener(lastButtonListener);
        jButton_3.addActionListener(lastButtonListener);
        jButton_4.addActionListener(lastButtonListener);

        //Assign Font
        jButton_1.setFont(font);
        jButton_2.setFont(font);
        jButton_3.setFont(font);
        jButton_4.setFont(font);


        jPanel_Center.add(jButton_1);
        jPanel_Center.add(jButton_2);
        jPanel_Center.add(jButton_3);
        jPanel_Center.add(jButton_4);

        JPanel jPanel_footer = new JPanel();
        jLabel = new JLabel("-----------");jLabel.setFont(font);
        jPanel_footer.add(jLabel);

        this.setLayout(new BorderLayout());

        this.add(jPanel_Center, BorderLayout.CENTER);
        this.add(jPanel_footer, BorderLayout.SOUTH);
        this.setVisible(true);
    }
    public void changTo_1(){
        this.lastButtonModel.setValue_1();
        jLabel.setText("Last Button: "  + this.lastButtonModel.getValue());
    }
    public void changTo_2(){
        this.lastButtonModel.setValue_2();
        jLabel.setText("Last Button: "  + this.lastButtonModel.getValue());
    }
    public void changTo_3(){
        this.lastButtonModel.setValue_3();
        jLabel.setText("Last Button: "  + this.lastButtonModel.getValue());
    }
    public void changTo_4(){
        this.lastButtonModel.setValue_4();
        jLabel.setText("Last Button: "  + this.lastButtonModel.getValue());
    }
}
/*
    viết model trước
    rồi sau đó trong view lại chứa model
    để nó thay đổi, cập nhật dữ liệu
    cần controller là những listener, listener lại chứa view
    cái view sẽ đc điều khiển bởi controler và listener
    để nó gọi hàm thay đổi giao diện như thế nào
*/