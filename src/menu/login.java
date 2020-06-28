

/**
 *      Nama            : St. Hatijah H.Ilyas
 *      Stambuk         : 13020180061
 *      Hari/Tanggal    : Minggu, 28 Juli 2020
 *      Waktu           : 10.33 WITA
 */


package menu;

import server.Koneksi;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;

public class login extends Koneksi{
    public login(){
        try{
            super.createStatement();
        } catch (SQLException e){
            Logger.getLogger(login.class.getName()).log(Level.SEVERE, null, e);
        }
    }
    public boolean CekLogin(String username, String password){
        boolean hasil = false;
        try{
            String sql = "select * from login where User_name=? and Pass=?";
            PreparedStatement select = connection.prepareStatement(sql);
            select.setString(1, username);
            select.setString(2, password);
            ResultSet set = select.executeQuery();
            if(set.next()){
                hasil=true;
            }
        }catch (Exception e){
            JOptionPane.showMessageDialog(null, e);
        }
        return hasil;
    }
}
