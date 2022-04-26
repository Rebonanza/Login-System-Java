import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.Statement;

public class Connect{
    String dbUrl = "jdbc:mysql://localhost/db_praktikum";
    String dbUsername = "root";
    String dbPassword = "";
    static final String driver = "com.mysql.cj.jdbc.Driver"; 
    Connection connect;
    Statement statement; 
    public Connect(){
        try{
            Class.forName(driver); //load driver
            //membuka koneksi ke database
            connect = DriverManager.getConnection(dbUrl,dbUsername,dbPassword);
            System.out.println("Koneksi Sukses");
        } catch(Exception ex){
            System.out.println("Koneksi Gagal");
        }
    }    
}

