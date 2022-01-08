package Model;

import Entity.AdminEntity07264;
import Helper.KoneksiDb_07264;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;

public class AdminModel07264{
    private Connection conn = null;
    private PreparedStatement pstmt = null;
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
            conn = KoneksiDb_07264.getconection_07264();
            PreparedStatement statement = conn.prepareStatement(sql);
            statement.executeUpdate();
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
    public AdminEntity07264 loginCheck(String nip, String password) {
        AdminEntity07264 adminEntity = null;
        try {
            String sql = "select * from db_vaksin.admin sa " +
                    "where sa.nip = '"+ nip +
                    "' and sa.password = '" + password +"';";
            conn = KoneksiDb_07264.getconection_07264();
            pstmt = conn.prepareStatement(sql);
            ResultSet rs = pstmt.executeQuery();
            while (rs.next()) {
                String nipAdmin = rs.getString("nip");
                String pw = rs.getString("password");
                int id = rs.getInt("id");
                System.out.println(nip);
                adminEntity = new AdminEntity07264(nipAdmin, pw, id);
            }
        } catch (SQLException e) {
            e.printStackTrace();
        } finally {
            KoneksiDb_07264.closeDB_07264(conn, pstmt);
        }
        return adminEntity;
    }
    public ArrayList<AdminEntity07264> getAdmin() {
        ArrayList<AdminEntity07264> admindata = new ArrayList<>();
        try {
            String sql = "select * from db_vaksin.admin";
            conn = KoneksiDb_07264.getconection_07264();
            pstmt = conn.prepareStatement(sql);
            ResultSet rs = pstmt.executeQuery();
            System.out.println(pstmt.toString());
            while (rs.next()) {
                AdminEntity07264 adminEntity = new AdminEntity07264();
                adminEntity.setId_07264(rs.getInt("id"));
                adminEntity.setNip_07264(rs.getString("nip"));
                adminEntity.setNama_07264(rs.getString("nama"));
                adminEntity.setAlamat_07264(rs.getString("alamat"));
                adminEntity.setPassword_07264(rs.getString("password"));
                adminEntity.setNoTelp_07264(rs.getString("notelp"));
                admindata.add(adminEntity);
            }
        } catch (SQLException e) {
            e.printStackTrace();
        } finally {
            KoneksiDb_07264.closeDB_07264(conn, pstmt);
        }
        return admindata;
    }

    public void updateAdmin (AdminEntity07264 admin) {
        try {
            conn = KoneksiDb_07264.getconection_07264();
            // Benar kan ini
            String sql = "UPDATE db_vaksin.admin t set t.password = '%s', t.notelp = '%s' where t.id = %d";
            sql = String.format(sql, admin.getPassword_07264(), admin.getNoTelp_07264(), admin.getId_07264());
            pstmt = conn.prepareStatement(sql);
            pstmt.executeUpdate();
            System.out.println(pstmt.toString());
        } catch (SQLException e) {
            e.printStackTrace();
        } finally {
            KoneksiDb_07264.closeDB_07264(conn, pstmt);
        }
    }




    /*public void updatePassword_07264(AdminEntity07264 adminUpdate) {
    }

     */
}
