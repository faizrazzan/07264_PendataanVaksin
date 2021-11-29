package Model;

import Entity.AdminEntity07264;
import Helper.KoneksiDb_07264;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

public class AdminModel07264 extends ModelAbstrack_07264 {
    String sql;

    public void insertData_07264(AdminEntity07264 adminEntity){
        try {
            sql = String.format("INSERT INTO admin (nip ,nama, alamat,password,notelp) VALUES " +
                            "('%s', '%s', '%s', '%s', '%s');",
                    adminEntity.getNip_07264(),
                    adminEntity.getNama_07264(),
                    adminEntity.getAlamat_07264(),
                    adminEntity.getPassword_07264(),
                    adminEntity.getNoTelp_07264()
            );
            PreparedStatement statement = conn.prepareStatement(sql);
            if(statement.executeUpdate() > 0){
                System.out.println("Berhasil Menambah Data Admin");
            }else{
                System.out.println("Gagal Menambah Data Admin");
            }
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }
    public void updatePassword_07264(String password, int id){
        int result = 0;

        try {
            sql = String.format("UPDATE admin set password = " +
                            "'%s' WHERE id = '%s';",
                    password,id
            );
            PreparedStatement statement = conn.prepareStatement(sql);
            result = statement.executeUpdate();
            if(result > 0){
                System.out.println("Berhasil Mengubah Data");
            }else{
                System.out.println("Gagal Mengubah Data");
            }
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }

    public int updatenoTelp_07264(String noTelp,int id){
        int result = 0;

        try {
            sql = String.format("UPDATE admin set notelp = " +
                            "'%s' WHERE id = '%s';",
                    noTelp,id
            );
            PreparedStatement statement = conn.prepareStatement(sql);
            result = statement.executeUpdate();
            if(result > 0){
                System.out.println("Berhasil Mengubah Data");
            }else{
                System.out.println("Gagal Mengubah Data");
            }
        } catch (SQLException e) {
            e.printStackTrace();
        }
        return result;
    }
    public int cekLogin_07264(String nip, String password){

        int result = 0; //gagal login
        sql="select * from admin where nip='"+nip +"' and password='"+password+"';";
        try {
            PreparedStatement statement = conn.prepareStatement(sql);
            ResultSet rs = statement.executeQuery();
            while (rs.next()) {
                String uname = rs.getString("nip");
                String pw = rs.getString("password");
                result = rs.getInt("id");
            }
        }catch (Exception e){
            result =0;
        }
        return result;
    }
    public void deleteData_07264(int id){
        int result = 0;

        try {
            Connection conn = KoneksiDb_07264.getconection_07264();
            String sql = String.format("DELETE FROM admin WHERE id = '%s';",
                    id
            );
            PreparedStatement statement = conn.prepareStatement(sql);
            result = statement.executeUpdate();
            if (result > 0) {
                System.out.println("Berhasil Menghapus Data");
            } else {
                System.out.println("Gagal Menghapus Data");
            }
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }
}
