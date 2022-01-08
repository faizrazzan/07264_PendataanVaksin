package Model;

import Entity.AdminEntity07264;
import Entity.PendudukEntity07264;
import Helper.KoneksiDb_07264;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;

public class PendudukModel07264 extends ModelAbstrack_07264 {
    String sql;
    Connection conn = null;
    private PreparedStatement pstmt = null;
    public ArrayList<PendudukEntity07264> getPenduduk_07264(){
        ArrayList<PendudukEntity07264> pendudukEntities = new ArrayList<>();
        try {
            String sql = "select *" +
                    "from penduduk ";
            conn = KoneksiDb_07264.getconection_07264();
            PreparedStatement statement = conn.prepareStatement(sql);
            ResultSet rs = statement.executeQuery();
            while (rs.next()) {
                PendudukEntity07264 pendudukEntity = new PendudukEntity07264();
                pendudukEntity.setId_07264(rs.getInt("id"));
                pendudukEntity.setNik_07264(rs.getString("nik"));
                pendudukEntity.setNama_07264(rs.getString("nama"));
                pendudukEntity.setNoTelp_07264(rs.getString("notelp"));
                pendudukEntity.setDosis_07264(rs.getString("dosis"));
                pendudukEntity.setJns_vaksin_07264(rs.getString("jns_vaksin"));
                pendudukEntity.setAlamat_07264(rs.getString("alamat"));
                pendudukEntities.add(pendudukEntity);
            }
        } catch (SQLException e) {
            e.printStackTrace();
        }
        return pendudukEntities;
    }
    public ArrayList<PendudukEntity07264>getPenduduk_07264(int id){
        ArrayList<PendudukEntity07264> pendudukEntities = new ArrayList<>();
        try {
            String sql = "select *" +
                    "from penduduk where id = '"+id+"';";
            PreparedStatement statement = conn.prepareStatement(sql);
            ResultSet rs = statement.executeQuery();
            while (rs.next()) {
                PendudukEntity07264 pendudukEntity = new PendudukEntity07264();
                pendudukEntity.setId_07264(rs.getInt("id"));
                pendudukEntity.setNik_07264(rs.getString("nik"));
                pendudukEntity.setNama_07264(rs.getString("nama"));
                pendudukEntity.setNoTelp_07264(rs.getString("notelp"));
                pendudukEntity.setDosis_07264(rs.getString("dosis"));
                pendudukEntity.setJns_vaksin_07264(rs.getString("jns_vaksin"));
                pendudukEntity.setAlamat_07264(rs.getString("alamat"));
                pendudukEntities.add(pendudukEntity);
            }
        } catch (SQLException e) {
            e.printStackTrace();
        }
        return pendudukEntities;
    }
    public void insertData_07264(PendudukEntity07264 pendudukEntity){
        try {
            conn = KoneksiDb_07264.getconection_07264();
            sql = String.format("INSERT INTO penduduk (nik ,nama, notelp,dosis,jns_vaksin,alamat) VALUES " +
                            "('%s', '%s', '%s', '%S', '%s', '%s');",
                    pendudukEntity.getNik_07264(),
                    pendudukEntity.getNama_07264(),
                    pendudukEntity.getNoTelp_07264(),
                    pendudukEntity.getDosis_07264(),
                    pendudukEntity.getJns_vaksin_07264(),
                    pendudukEntity.getAlamat_07264()
                    );
                PreparedStatement statement = conn.prepareStatement(sql);
            System.out.println(statement.toString());

            if(statement.executeUpdate() > 0){
                    System.out.println("Berhasil Menambah Data");
                }else{
                    System.out.println("Gagal Menambah Data");
                }
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }
    public int updatenoTelp_07264(String noTelp,int id){
        int result = 0;

        try {
            sql = String.format("UPDATE penduduk set notelp = " +
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
    public void updateDosis_07264(String dosis,int id){
        int result = 0;

        try {
            sql = String.format("UPDATE penduduk set dosis = " +
                            "'%s' WHERE id = '%s';",
                    dosis,id
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
    /*public int cekData(String nik){

    }
*/
    public void deletePenduduk_07264(int id){
        int result = 0;

        try {
            Connection conn = KoneksiDb_07264.getconection_07264();
            String sql = String.format("DELETE FROM penduduk WHERE id = '%s';",
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
    public void updatePenduduk (PendudukEntity07264 penduduk) {
        try {
            conn = KoneksiDb_07264.getconection_07264();
            String sql = "UPDATE db_vaksin.penduduk t set t.notelp = '%s', t.dosis = '%s' where t.id = %d";
            sql = String.format(sql, penduduk.getNoTelp_07264(), penduduk.getDosis_07264(), penduduk.getId_07264());
            pstmt = conn.prepareStatement(sql);
            pstmt.executeUpdate();
            System.out.println(pstmt.toString());
        } catch (SQLException e) {
            e.printStackTrace();
        } finally {
            KoneksiDb_07264.closeDB_07264(conn, pstmt);
        }
}}
