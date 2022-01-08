package Controller;

import Entity.AdminEntity07264;
import Model.AdminModel07264;

import javax.swing.table.DefaultTableModel;
import java.util.ArrayList;


public class AdminController_07264 {
    public void insertData_07264(String nip,String nama,String alamat,String password,String noTelp){
            AdminModel07264 adminModel = new AdminModel07264();
            AdminEntity07264 adminEntity = new AdminEntity07264(0,nip,nama,alamat,password,noTelp);
            adminModel.insertData_07264(adminEntity);
    }
    public void updatePassword_07264(String pass,int id){
        AdminModel07264 adminModel = new AdminModel07264();
        adminModel.updatePassword_07264(pass, id);
    }
    public void updatenoTelp_07264(String noTelp, int id){
        AdminModel07264 adminModel = new AdminModel07264();
        adminModel.updatenoTelp_07264(noTelp, id);
    }
    public int login_07264(String nip,String password){
        AdminModel07264 adminModel = new AdminModel07264();
        int id = adminModel.cekLogin_07264(nip,password);
        return id;
    }
    public void deleteData_07264(int id){
        AdminModel07264 adminModel = new AdminModel07264();
        adminModel.deleteData_07264(id);
    }
    public AdminEntity07264 verifyLogin_07264(String username, String password) {
        AdminEntity07264 admin = AllObjectModel_07264.adminModel.loginCheck(username, password);
        return admin;
    }

        public void insertData(String nip, String nama, String alamat, String password, String notelp) {
        AdminEntity07264 adminEntity07264 = new AdminEntity07264();
        adminEntity07264.setNip_07264(nip);
        adminEntity07264.setNama_07264(nama);
        adminEntity07264.setAlamat_07264(alamat);
        adminEntity07264.setPassword_07264(password);
        adminEntity07264.setNoTelp_07264(notelp);
            AllObjectModel_07264.adminModel.insertData_07264(adminEntity07264);
        }

        public ArrayList<AdminEntity07264> getData() {
            return AllObjectModel_07264.adminModel.getAdmin();
        }

        public static DefaultTableModel syncTable_07264() {
            DefaultTableModel adminDataSet = new DefaultTableModel();
            Object[] column = {"ID", "NIP", "Nama", "Alamat","Password","Notelp"};
            adminDataSet.setColumnIdentifiers(column);
            ArrayList<AdminEntity07264> admin = AllObjectModel_07264.adminModel.getAdmin();
            for(AdminEntity07264 i : admin) {
                Object[] data = new Object[6];
                data[0] = i.getId_07264();
                data[1] = i.getNip_07264();
                data[2] = i.getNama_07264();
                data[3] = i.getAlamat_07264();
                data[4] = i.getPassword_07264();
                data[5] = i.getNoTelp_07264();
                adminDataSet.addRow(data);
            }
            return adminDataSet;
        }
}
