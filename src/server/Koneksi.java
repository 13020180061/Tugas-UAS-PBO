

/**
 *      Nama            : St. Hatijah H.Ilyas
 *      Stambuk         : 13020180061
 *      Hari/Tanggal    : Minggu, 28 Juli 2020
 *      Waktu           : 10.01 WITA
 */

package server;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import javax.swing.JOptionPane;

public class Koneksi {
    public java.sql.Statement statement;
    public Connection connection;
    public Koneksi(){
        String driver = "com.mysql.jdbc.Driver";
        String dbhost = "localhost";
        String dbport = "3306";
        String dbdatabase = "pbo_tiket";
        String user = "root";
        String pass = "";
        String url = "";
        try{
            Class.forName(driver);
            url="jdbc:mysql://"+dbhost+":"+dbport+"/"+dbdatabase;
            connection = (Connection) DriverManager.getConnection(url, user, pass);        
    }
    catch(Exception ex){
    JOptionPane.showMessageDialog(null, ex);
}
}


    public void createStatement() throws SQLException{
        statement = connection.createStatement();
    }
}
