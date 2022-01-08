package GUI;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class Menu_07264 extends Component_07264{
    public Menu_07264() {
        initComponents();
    }
    private void initComponents() {
        setTitle("Lucas Shoes");
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setSize(371, 581);
        setLocationRelativeTo(null);
        getContentPane().setBackground(Color.white);
        setLayout(null);
        setVisible(true);
        setResizable(false);
        getContentPane().setLayout(null);

        jButton1.setText("Setting Admin");
        jButton1.setMaximumSize(new java.awt.Dimension(77, 75));
        jButton1.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                new SettingAdminV2();
            }
        });
        getContentPane().add(jButton1);
        jButton1.setBounds(51, 37, 126, 53);

        jButton2.setText("Setting Penduduk");
        jButton2.setMaximumSize(new java.awt.Dimension(77, 75));
        jButton2.addActionListener(new ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                new SettingPenduduk_07264();
            }
        });
        getContentPane().add(jButton2);
        jButton2.setBounds(51, 123, 126, 53);

        jButton3.setText("Exit");
        jButton3.setMaximumSize(new java.awt.Dimension(77, 75));
        jButton3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {

            }
        });
        getContentPane().add(jButton3);
        jButton3.setBounds(66, 211, 96, 53);

    }

}
