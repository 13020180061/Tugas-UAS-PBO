

/**
 *      Nama            : St. Hatijah H.Ilyas
 *      Stambuk         : 13020180061
 *      Hari/Tanggal    : Minggu, 28 Juli 2020
 *      Waktu           : 11.10 WITA
 */


package menu;

import server.Koneksi;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;

public class user extends Koneksi{
    public user(){
        try{
            super.createStatement();
        } catch (Exception e){
            JOptionPane.showMessageDialog(null, e);
        }
    }
    
    public void simpan_username (String username, String password){
        try{
            String sql = "insert into login(User_name,Pass) values(?,?)";
            PreparedStatement insert = connection.prepareStatement(sql);
            insert.setString(1, username);
            insert.setString(2, password);
            insert.executeQuery();
        }
        catch (Exception e){
            JOptionPane.showMessageDialog(null, e);
        }
    }
    
    public void edit_username (String username, String password){
        try{
            String sql = "update login set Pass=?, where User_name=?";
            PreparedStatement insert = connection.prepareStatement(sql);
            insert.setString(1, username);
            insert.setString(2, password);
            insert.executeQuery();
        }
        catch (Exception e){
            JOptionPane.showMessageDialog(null, e);
        }
    }
    
    public void hapus_username(String username){
        try{
            String sql = "delete from login where User_name=?";
            PreparedStatement insert = connection.prepareStatement(sql);
            insert.setString(1, username);
            insert.executeQuery();
        }
        catch (Exception e){
            JOptionPane.showMessageDialog(null, e);
        }
    }
    
    DefaultTableModel model_username = new DefaultTableModel();
    void kosongkanTable(){
        int row=model_username.getRowCount();
        for (int i=0; i<row; i++){
            model_username.removeRow(0);
        }
    }
    
    public void tampilDataUsername(){
        kosongkanTable();
        try{
            String sql = "select *from login";
            String[] kolom = {"User Name","Password"};
            model_username.setColumnIdentifiers(kolom);
            ResultSet set = statement.executeQuery(sql);
            while(set.next()){
                String username = set.getString("User_name");
                String password = set.getString("Pass");
                String[] data = {username,password};
                model_username.addRow(data);
            }
        }
        catch (Exception e){
            JOptionPane.showMessageDialog(null, e);
        }
    }
}
