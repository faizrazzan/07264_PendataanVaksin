package GUI;

import Controller.AllObjectModel_07264;
import Entity.AdminEntity07264;
import Entity.PendudukEntity07264;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class RightClickGuiPenduduk_07264 extends JDialog {
    private PendudukEntity07264 penduduk;
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

    public RightClickGuiPenduduk_07264(JFrame parent, PendudukEntity07264 penduduk) {
        super(parent);
        setTitle("Edit Data");
        setSize(350, 300);
        setLocationRelativeTo(null);
        getContentPane().setBackground(Color.white);
        setLayout(null);
        setResizable(false);
        this.penduduk = penduduk;
        this.initComponent();

        setModal(true);
        setVisible(true);
    }

    private void initComponent() {
        add(jTextField1);
        jTextField1.setBounds(12, 50, 306, 22);
        jTextField1.setText(penduduk.getNoTelp_07264());

        jLabel1.setText("No Telpon");
        add(jLabel1);
        jLabel1.setBounds(12, 27, 80, 16);

        add(jTextField2);
        jTextField2.setBounds(12, 113, 306, 22);
        jTextField2.setText(penduduk.getDosis_07264());

        jLabel2.setText("Dosis");
        add(jLabel2);
        jLabel2.setBounds(12, 90, 80, 16);


        jButton1.setText("Save");
        add(jButton1);
        jButton1.setBounds(240, 216, 80, 25);

        jButton1.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                PendudukEntity07264 pendudukUpdate = new PendudukEntity07264();
                pendudukUpdate.setNoTelp_07264(jTextField1.getText());
                pendudukUpdate.setDosis_07264(jTextField2.getText());
                pendudukUpdate.setId_07264(penduduk.getId_07264());
                AllObjectModel_07264.pendudukModel07264.updatePenduduk(pendudukUpdate);
                dispose();
            }
        });
    }
}
