package Model;
import Helper.KoneksiDb_07264;

import java.sql.Connection;

public abstract class ModelAbstrack_07264 {
    public Connection conn = KoneksiDb_07264.getconection_07264();

    public void updatenoTelp_07264(int id, String noTelp) {

    }

    /*public void insertData_07264(String nip, String nama, String alamat, String password, String notelp);

     */
}
