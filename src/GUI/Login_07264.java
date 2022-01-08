package GUI;

import Controller.AdminController_07264;
import Entity.AdminEntity07264;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class Login_07264 extends Component_07264 {
    public Login_07264() {
        setToWindowsDesign();
        initComponent();
    }

    void initComponent() {
        setTitle("Vaksinasi");
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setSize(371, 581);
        setLocationRelativeTo(null);
        getContentPane().setBackground(Color.white);
        setLayout(null);
        setVisible(true);
        setResizable(false);

        getContentPane().add(jTextField1);
        jTextField1.setBounds(30, 320, 290, 39);

        add(jPasswordField1);
        jPasswordField1.setBounds(30, 390, 290, 39);

        jButton1.setText("Login");
        getContentPane().add(jButton1);
        jButton1.setBounds(243, 460, 80, 38);

        jLabel1.setText("Password");
        getContentPane().add(jLabel1);
        jLabel1.setBounds(30, 370, 60, 16);

        jLabel2.setText("Username");
        getContentPane().add(jLabel2);
        jLabel2.setBounds(30, 300, 60, 16);

        // ---- Event Pages ----
        jButton1.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                String username_07264 = jTextField1.getText();
                String password_07264 = new String(jPasswordField1.getPassword());

                AdminController_07264 adminController_07264 = new AdminController_07264();
                AdminEntity07264 login = adminController_07264.verifyLogin_07264(username_07264, password_07264);

                if (login == null) {
                    JOptionPane.showMessageDialog(new JFrame(), "Invalid Username & Password", "Error",
                            JOptionPane.ERROR_MESSAGE);
                } else {
                    new Menu_07264();
                    dispose();
                }
            }
        });
    }
}
