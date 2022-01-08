package Helper;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;

public class KoneksiDb_07264 {
    public static Connection getconection_07264() {
        Connection conn = null;
        String driver = "com.mysql.cj.jdbc.Driver";
        String url = "jdbc:mysql://localhost:3306/db_vaksin";
        String user = "root";
        String pass = "";
        try{
            Class.forName(driver);
            conn = DriverManager.getConnection(url, user,
                    pass);
            System.out.println("Berhasil Koneksi Database");
        } catch (Exception e) {
            System.out.println("Gagal Koneksi Database");
            e.printStackTrace();
        }
        return conn;
    }
    public static void closeDB_07264(Connection conn, PreparedStatement pstmt) {
        try{
            if (conn != null)
                conn.close();
            if (pstmt != null)
                pstmt.close();
            System.out.println("Database connection has been closed.");
        }catch (SQLException e) {
            System.out.println("Failed to close database");
            e.printStackTrace();
        }
    }
}
