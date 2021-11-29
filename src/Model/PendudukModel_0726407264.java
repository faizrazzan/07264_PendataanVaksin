package Model;

import Entity.PendudukEntity07264;

import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;

public class PendudukModel_0726407264 extends ModelAbstrack_07264 {
    String sql;
    public ArrayList<PendudukEntity07264> getPenduduk_07264(){
        ArrayList<PendudukEntity07264> pendudukEntities = new ArrayList<>();
        try {
            String sql = "select *" +
                    "from penduduk ";
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
            sql = String.format("INSERT INTO penduduk (nik ,nama, notelp,dosis,jns_vaksin,alamat) VALUES " +
                            "('%s', '%s', '%s', '%s', '%s', '%s');",
                    pendudukEntity.getNik_07264(),
                    pendudukEntity.getNama_07264(),
                    pendudukEntity.getNoTelp_07264(),
                    pendudukEntity.getDosis_07264(),
                    pendudukEntity.getJns_vaksin_07264(),
                    pendudukEntity.getAlamat_07264()
                    );
                PreparedStatement statement = conn.prepareStatement(sql);
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
}
