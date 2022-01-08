package GUI;

import Controller.AdminController_07264;
import Controller.AllObjectModel_07264;
import Entity.AdminEntity07264;

import javax.swing.*;
import javax.swing.table.DefaultTableCellRenderer;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;

public class SettingAdminV2 extends Component_07264{
    JTable jTable1 = new JTable();
    JScrollPane jScrollPane1 = new JScrollPane();
    JPanel jPanel1 = new JPanel();

    AdminEntity07264 sessionAdmin;

    public SettingAdminV2() {
        initComponents();
    }

    private void initComponents() {
        setToWindowsDesign();
        setTitle("Vaksinasi' - Admin");
        setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
        getContentPane().setLayout(null);
        setSize(750, 450);
        setLocationRelativeTo(null);
        getContentPane().setBackground(Color.white);
        setLayout(null);
        setVisible(true);
        setResizable(false);

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        getContentPane().setLayout(null);

        jPanel1.setBorder(javax.swing.BorderFactory.createTitledBorder("Add"));

        jLabel1.setText("Alamat");

        jLabel2.setText("NIP");

        jLabel3.setText("Password");

        jTextField3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {

            }
        });

        jLabel4.setText("No Telpon");

        jLabel5.setText("Nama");

        jButton1.setText("Save");

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
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
                                .addGap(11, 11, 11)
                                .addComponent(jButton1)
                                .addContainerGap())
        );

        getContentPane().add(jPanel1);
        jPanel1.setBounds(471, 0, 256, 326);

        jButton2.setText("Exit to Menu");
        getContentPane().add(jButton2);
        jButton2.setBounds(471, 352, 256, 25);

        jTable1.setModel(new javax.swing.table.DefaultTableModel(
                new Object [][] {
                        {null, null, null, null, null, null},
                        {null, null, null, null, null, null},
                        {null, null, null, null, null, null},
                        {null, null, null, null, null, null}
                },
                new String [] {
                        "ID", "NIP", "Nama", "Alamat", "Password", "No Telpon"
                }
        ) {
            boolean[] canEdit = new boolean [] {
                    false, false, false, false, false, true
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        jTable1.setModel(AdminController_07264.syncTable_07264());
        jTable1.setDefaultEditor(Object.class, null);
        DefaultTableCellRenderer centerRendered = new DefaultTableCellRenderer();

        centerRendered.setHorizontalAlignment(JLabel.CENTER);
        jScrollPane1.setViewportView(jTable1);

        getContentPane().add(jScrollPane1);
        jScrollPane1.setBounds(12, 0, 452, 377);

        setVisible(true);

        jButton1.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {

                if (jTextField1.getText().equals("") && jTextField2.getText().equals("")) {
                    JOptionPane.showMessageDialog(SettingAdminV2.this, "Field not complete.", "Incomplete", JOptionPane.ERROR_MESSAGE);
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
                new Menu_07264();
                dispose();
            }
        });

        jButton4.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                try {
                    String password = JOptionPane.showInputDialog(SettingAdminV2.this, "Change your password to: ", "Change Password", JOptionPane.INFORMATION_MESSAGE);
                    if (password.isBlank()) {
                        JOptionPane.showMessageDialog(SettingAdminV2.this, "Blank password detected", "Blank Password", JOptionPane.ERROR_MESSAGE);
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
                new RightClickGui_07264(SettingAdminV2.this, admin);
                syncDatasets();
            }
        });

        JMenuItem jMenuItem2 = new JMenuItem("Delete");
        jPopupMenu1.add(jMenuItem2);

        jMenuItem2.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                int prompt = JOptionPane.showConfirmDialog(SettingAdminV2.this, "Do you want to delete this data?",
                        "Delete", JOptionPane.YES_NO_OPTION, JOptionPane.WARNING_MESSAGE);

                if (prompt == JOptionPane.YES_OPTION) {
                    int number = jTable1.getSelectedRow();
                    String index = jTable1.getValueAt(number, 0).toString();
                    AllObjectModel_07264.adminModel.deleteData_07264(Integer.parseInt(index));
                    syncDatasets();
                    JOptionPane.showMessageDialog(SettingAdminV2.this, "Data deleted", "Success", JOptionPane.INFORMATION_MESSAGE);
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
