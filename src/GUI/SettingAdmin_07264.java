package GUI;

// -- https://youtu.be/6hrKW0xEP14?t=174
import Controller.AllObjectModel_07264;
import Controller.AdminController_07264;
import Entity.AdminEntity07264;
import Entity.AdminEntity07264;
import Entity.PendudukEntity07264;
import GUI.Component_07264;

import javax.swing.*;
import javax.swing.table.DefaultTableCellRenderer;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;

public class SettingAdmin_07264 extends Component_07264 {
    JTable jTable1 = new JTable();
    JScrollPane jScrollPane1 = new JScrollPane();
    JPanel jPanel2 = new JPanel();

    AdminEntity07264 sessionAdmin;

    public SettingAdmin_07264() {
        //this.sessionAdmin = admin;
        initComponent();
    }

    void initComponent() {
        setToWindowsDesign();
        setTitle("Vaksinasi' - Admin");
        setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
        getContentPane().setLayout(null);
        setSize(890, 560);
        setLocationRelativeTo(null);
        getContentPane().setBackground(Color.white);
        setLayout(null);
        setVisible(true);
        setResizable(false);
        // showDesignInfo();

        jTable1.setModel(new javax.swing.table.DefaultTableModel(
                new Object[][]{
                        {null, null, null, null},
                        {null, null, null, null},
                        {null, null, null, null},
                        {null, null, null, null},
                        {null, null, null, null},
                        {null, null, null, null}
                },
                new String[]{
                        "ID", "NIP", "Nama", "Alamat", "Password", "NoTelp"
                }
        ));
        jScrollPane1.setViewportView(jTable1);

        getContentPane().add(jScrollPane1);
        jScrollPane1.setBounds(10, 10, 578, 490);

        jPanel2.setBorder(BorderFactory.createTitledBorder("Admin"));

        jLabel1.setText("NIP");
        jLabel2.setText("Nama");
        jLabel3.setText("Alamat");
        jLabel4.setText("Password");
        jLabel5.setText("NoTelp");

        //jComboBox1.setModel(new DefaultComboBoxModel<>(new String[]{"39", "40", "41", "42", "43"}));

        jButton1.setText("Add");

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
                jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addGroup(jPanel1Layout.createSequentialGroup()
                                .addContainerGap()
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                        .addComponent(jTextField4, javax.swing.GroupLayout.DEFAULT_SIZE, 220, Short.MAX_VALUE)
                                        .addComponent(jTextField3, javax.swing.GroupLayout.DEFAULT_SIZE, 220, Short.MAX_VALUE)
                                        .addComponent(jTextField2, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, 220, Short.MAX_VALUE)
                                        .addComponent(jTextField1)
                                        .addGroup(jPanel1Layout.createSequentialGroup()
                                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                                        .addComponent(jLabel1)
                                                        .addComponent(jLabel4)
                                                        .addComponent(jLabel3)
                                                        .addComponent(jLabel2)
                                                        .addComponent(jLabel5))
                                                .addGap(0, 0, Short.MAX_VALUE))
                                        .addComponent(jTextField5)
                                        .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                                                .addGap(0, 0, Short.MAX_VALUE)
                                                .addComponent(jButton1)))
                                .addContainerGap())
        );
        jPanel1Layout.setVerticalGroup(
                jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addGroup(jPanel1Layout.createSequentialGroup()
                                .addContainerGap()
                                .addComponent(jLabel2)
                                .addGap(1, 1, 1)
                                .addComponent(jTextField1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(8, 8, 8)
                                .addComponent(jLabel5)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(jTextField5, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(jLabel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(jTextField2)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(jLabel3)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(jTextField3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(jLabel4)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(jTextField4, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(24, 24, 24)
                                .addComponent(jButton1)

        ));

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
                layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                                .addGap(0, 144, Short.MAX_VALUE)
                                .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
        );
        layout.setVerticalGroup(
                layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        getContentPane().add(jPanel2);
        jPanel2.setBounds(600, 10, 260, 330);
        setVisible(true);

        jButton2.setText("Log Out");
        jButton2.setToolTipText("Tired of doing nothing? Login to other account!");
        getContentPane().add(jButton2);
        jButton2.setBounds(610, 475, 240, 25);

        /* jButton4.setText("Change my password");
        jButton4.setToolTipText("Click here to change your password.");
        getContentPane().add(jButton4);
        jButton4.setBounds(610, 432, 240, 25);

         */

        jTable1.setModel(AdminController_07264.syncTable_07264());
        jTable1.setDefaultEditor(Object.class, null);
        DefaultTableCellRenderer centerRendered = new DefaultTableCellRenderer();
        centerRendered.setHorizontalAlignment(JLabel.CENTER);

        //setVisible(true);

        // ---- Event Pages ----
        jButton1.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                if (jTextField1.getText().equals("") && jTextField2.getText().equals("")) {
                    JOptionPane.showMessageDialog(SettingAdmin_07264.this, "Field not complete.", "Incomplete", JOptionPane.ERROR_MESSAGE);
                    return;
                }

                String nip = jTextField1.getText();
                String nama = jTextField2.getText();
                String alamat = jTextField3.getText();
                String password = jTextField4.getText();
                String notelp = jTextField5.getText();

                AdminController_07264 adminController_07264 = new AdminController_07264();
                adminController_07264.insertData(nip ,nama, alamat,password,notelp);
                syncDatasets();
                emptyField();
            }
        });

        jTable1.addMouseListener(new MouseAdapter() {
            @Override
            public void mouseReleased(MouseEvent e) {
                int r = jTable1.rowAtPoint(e.getPoint());
                if (r >= 0 && r < jTable1.getRowCount()) {
                    jTable1.setRowSelectionInterval(r, r);
                } else {
                    jTable1.clearSelection();
                }

                int rowindex = jTable1.getSelectedRow();
                if (rowindex < 0)
                    return;
                if (e.isPopupTrigger() && e.getComponent() instanceof JTable) {

                    JPopupMenu popup = rightClickTable();
                    popup.show(e.getComponent(), e.getX(), e.getY());
                }
            }
        });

        jButton2.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                new Login_07264();
                dispose();
            }
        });

        jButton4.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                try {
                    String password = JOptionPane.showInputDialog(SettingAdmin_07264.this, "Change your password to: ", "Change Password", JOptionPane.INFORMATION_MESSAGE);
                    if (password.isBlank()) {
                        JOptionPane.showMessageDialog(SettingAdmin_07264.this, "Blank password detected", "Blank Password", JOptionPane.ERROR_MESSAGE);
                        return;
                    }
                    AllObjectModel_07264.adminModel.updatePassword_07264(password, sessionAdmin.getId_07264());
                } catch (NullPointerException error) {
                    System.out.println("ESC Pressed");
                }
            }
        });
    }

    private JPopupMenu rightClickTable() {
        JPopupMenu jPopupMenu1 = new JPopupMenu();

        JMenuItem jMenuItem1 = new JMenuItem("Edit");
        jPopupMenu1.add(jMenuItem1);

        jMenuItem1.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                int number = jTable1.getSelectedRow();
                String idAdmin, nipAdmin, namaAdmin, alamatAdmin, passwordAdmin, notelpAdmin;
                idAdmin = jTable1.getValueAt(number, 0).toString();
                nipAdmin = jTable1.getValueAt(number, 1).toString();
                namaAdmin = jTable1.getValueAt(number, 2).toString();
                alamatAdmin = jTable1.getValueAt(number, 3).toString();
                passwordAdmin = jTable1.getValueAt(number, 4).toString();
                notelpAdmin = jTable1.getValueAt(number, 5).toString();

                AdminEntity07264 admin = new AdminEntity07264(Integer.parseInt(idAdmin), nipAdmin, namaAdmin, alamatAdmin,passwordAdmin,notelpAdmin);
                new RightClickGui_07264(SettingAdmin_07264.this, admin);
                syncDatasets();
            }
        });

        JMenuItem jMenuItem2 = new JMenuItem("Delete");
        jPopupMenu1.add(jMenuItem2);

        jMenuItem2.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                int prompt = JOptionPane.showConfirmDialog(SettingAdmin_07264.this, "Do you want to delete this data?",
                        "Delete", JOptionPane.YES_NO_OPTION, JOptionPane.WARNING_MESSAGE);

                if (prompt == JOptionPane.YES_OPTION) {
                    int number = jTable1.getSelectedRow();
                    String index = jTable1.getValueAt(number, 0).toString();
                    AllObjectModel_07264.adminModel.deleteData_07264(Integer.parseInt(index));
                    syncDatasets();
                    JOptionPane.showMessageDialog(SettingAdmin_07264.this, "Data deleted", "Success", JOptionPane.INFORMATION_MESSAGE);
                }
            }
        });

        return jPopupMenu1;
    }

    private void syncDatasets() {
        jTable1.setModel(AdminController_07264.syncTable_07264());
    }

    private void emptyField() {
        jTextField1.setText("");
        jTextField2.setText("");
        jTextField3.setText("");
        jTextField4.setText("");
        jTextField5.setText("");
    }
}
