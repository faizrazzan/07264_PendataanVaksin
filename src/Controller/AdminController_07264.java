package Controller;

import Entity.AdminEntity07264;
import Model.AdminModel07264;


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
}
