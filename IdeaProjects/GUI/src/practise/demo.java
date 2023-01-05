package practise;

import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;

public class demo {
    public static void main(String[] args) {
        //Step 1: declare all needed components such as windows, Frame, button , Labels , textField,...
        JFrame frame = new JFrame();
        JPanel panel = new JPanel();
        JButton button = new JButton();
        JTextArea txtArea = new JTextArea();
        JLabel label = new JLabel();

        //Step 2: determine propertives and locations for components on JFrame

        // xác lập các thuộc tính
        frame.setTitle("Test JFrame");
        frame.setSize(700, 400);
        frame.setLocationRelativeTo(null);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setVisible(true);

        // xác lập các thuộc tính cho panel và thêm panel vào Frame
        // https://examples.javacodegreeks.com/java-swing-layouts-example/
        //tham khao layouts trên đây

        panel.setLayout(null);
        frame.add(panel);

        //xác lập thuộc tính cho nút và thêm nút vào panel
         button.setText("Click me!!");
         button.setBounds(100,100,100,50);
         panel.add(button);

         // xác lập thuộc tính label và thêm label vào panel
        label.setText("Input text here");
        label.setBounds(200,100,100,50);
        panel.add(label);

        // xác lập thuộc tính textArea và thêm textArea vào panel
        txtArea.setBounds(300, 100, 150, 40);
        panel.add(txtArea);

        // Bước 3: xác định các event có thể xảy ra trên các component
        // thường các events là click chuột hoặc keypressed
        button.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                label.setText(" Hello ");
            }
        });
    txtArea.addKeyListener(new KeyListener() {
        @Override
        public void keyTyped(KeyEvent e) {

        }

        @Override
        public void keyPressed(KeyEvent e) {
            if(e.getKeyCode() == KeyEvent.VK_ENTER){
                label.setText(txtArea.getText());
            }

        }

        @Override
        public void keyReleased(KeyEvent e) {

        }
    });
    }
}
