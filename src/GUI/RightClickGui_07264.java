package GUI;

import Controller.AllObjectModel_07264;
import Entity.AdminEntity07264;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class RightClickGui_07264 extends JDialog{
    private AdminEntity07264 admin;
    private JButton jButton1 = new JButton();
    private JComboBox<String> jComboBox1 = new JComboBox<>();
    private JLabel jLabel1 = new JLabel();
    private JLabel jLabel2 = new JLabel();
    private JLabel jLabel3 = new JLabel();
    private JLabel jLabel4 = new JLabel();
    private JLabel jLabel5 = new JLabel();
    private JTextField jTextField1 = new JTextField();
    private JTextField jTextField2 = new JTextField();
    private JTextField jTextField3 = new JTextField();
    private JTextField jTextField4 = new JTextField();
    private JPasswordField jPasswordField = new JPasswordField();

    public RightClickGui_07264(JFrame parent, AdminEntity07264 admin) {
        super(parent);
        setTitle("Edit Data");
        setSize(350, 300);
        setLocationRelativeTo(null);
        getContentPane().setBackground(Color.white);
        setLayout(null);
        setResizable(false);
        this.admin = admin;
        this.initComponent();

        setModal(true);
        setVisible(true);
    }

    private void initComponent() {
        add(jPasswordField);
        jPasswordField.setBounds(12, 50, 306, 22);
        jPasswordField.setText(admin.getPassword_07264());

        jLabel1.setText("Password");
        add(jLabel1);
        jLabel1.setBounds(12, 27, 80, 16);

        add(jTextField2);
        jTextField2.setBounds(12, 113, 306, 22);
        jTextField2.setText(admin.getNoTelp_07264());

        jLabel2.setText("NoTelp");
        add(jLabel2);
        jLabel2.setBounds(12, 90, 80, 16);


        jButton1.setText("Save");
        add(jButton1);
        jButton1.setBounds(240, 216, 80, 25);

        jButton1.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                AdminEntity07264 adminUpdate = new AdminEntity07264();
                adminUpdate.setPassword_07264(jPasswordField.getText());
                adminUpdate.setNoTelp_07264(jTextField2.getText());
                adminUpdate.setId_07264(admin.getId_07264());
                AllObjectModel_07264.adminModel.updateAdmin(adminUpdate);
                dispose();
            }
        });
    }
}
