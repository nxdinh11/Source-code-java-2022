package demo;
import java.awt.Color;
import java.awt.FlowLayout;
import java.awt.GridLayout;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;

import javax.swing.*;

public class demo extends JFrame {



        private JLabel headerLabel;
        private JLabel statusLabel;
        private JPanel controlPanel;

        public demo(){
            prepareGUI();
        }

        public static void main(String[] args) {
            demo demo = new demo();
            demo.showMouseListenerDemo();
        }

        private void prepareGUI() {
            this.setTitle("Vi du Java Swing");
            this.setSize(400, 300);
            this.setLayout(new GridLayout(3, 1));
            this.setLocationRelativeTo(null);
            headerLabel = new JLabel("", SwingConstants.CENTER);
            statusLabel = new JLabel("", JLabel.CENTER);
            statusLabel.setSize(350, 100);
            this.addWindowListener(new WindowAdapter() {
                public void windowClosing(WindowEvent windowEvent) {
                    System.exit(0);
                }
            });
            controlPanel = new JPanel();
            controlPanel.setLayout(new FlowLayout());
            this.add(headerLabel);
            this.add(controlPanel);
            this.add(statusLabel);
            this.setVisible(true);
        }

        private void showMouseListenerDemo() {
            headerLabel.setText("Listener in action: MouseListener");
            JPanel panel = new JPanel();
            panel.setBackground(Color.magenta);

            panel.setLayout(new FlowLayout());
            panel.addMouseListener(new CustomMouseListener());
            JLabel msglabel = new JLabel("Click vao day de lay toa do.", JLabel.CENTER);
            panel.add(msglabel);
            msglabel.addMouseListener(new CustomMouseListener());
            panel.add(msglabel);
            controlPanel.add(panel);
            this.setVisible(true);
        }

        class CustomMouseListener implements MouseListener {
            public void mouseClicked(MouseEvent e) {
                statusLabel.setText("Mouse Clicked: "
                        + "(" + e.getX() + ", " + e.getY() + ")");
            }

            public void mousePressed(MouseEvent e) {
            }

            public void mouseReleased(MouseEvent e) {
            }

            public void mouseEntered(MouseEvent e) {
            }

            public void mouseExited(MouseEvent e) {
            }
        }
    }
