

/**
 *      Nama            : St. Hatijah H.Ilyas
 *      Stambuk         : 13020180061
 *      Hari/Tanggal    : Minggu, 28 Juli 2020
 *      Waktu           : 11.45 WITA
 */


package tiket;

import server.Koneksi;
import java.awt.Dialog;
import javax.swing.JOptionPane;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.Map;
import javax.swing.JDialog;
import javax.swing.table.DefaultTableModel;
//import net.sf.jasperreports.engine.JasperFillManager;
//import net.sf.jasperreports.engine.Jas


public class tiket extends Koneksi{
    public tiket(){
        try{
            super.createStatement();
        } catch (Exception e){
            JOptionPane.showMessageDialog(null, e);
        }
    }
    
    public void simpan_tiket (String no_kursi, String nama_penumpang, String jumlah_beli, String uang_bayar, String total_bayar, String uang_kembali){
        try{
            String sql = "insert into kereta values(?,?,?,?,?,?)";
            PreparedStatement insert = connection.prepareStatement(sql);
            insert.setString(1, no_kursi);
            insert.setString(2, nama_penumpang);
            insert.setString(3, jumlah_beli);
            insert.setString(4, uang_bayar);
            insert.setString(5, total_bayar);
            insert.setString(6, uang_kembali);
            insert.executeUpdate();
        }
        catch (Exception e){
            JOptionPane.showMessageDialog(null, e);
        }
    }
    
    public void edit_tiket(String no_kursi, String nama_penumpang, String jumlah_beli, String uang_bayar, String total_bayar, String uang_kembali){
        try{
            String sql = "update kereta set Nama=?, Jumlah_beli=?, uang_bayar=?, ttl_bayar=?, uang_kembali=? where No_kursi=?";
            PreparedStatement insert = connection.prepareStatement(sql);
            insert.setString(1, no_kursi);
            insert.setString(2, nama_penumpang);
            insert.setString(3, jumlah_beli);
            insert.setString(4, uang_bayar);
            insert.setString(5, total_bayar);
            insert.setString(6, uang_kembali);
            insert.executeUpdate();
        }
        catch (Exception e){
            JOptionPane.showMessageDialog(null, e);
        }
    }
    
    public void hapus_tiket(String no_kursi){
        try{
            String sql = "delete from kereta where No_kursi=?";
            PreparedStatement insert = connection.prepareStatement(sql);
            insert.setString(1, no_kursi);
            insert.executeUpdate();
        }
        catch (Exception e){
            JOptionPane.showMessageDialog(null, e);
        }
    }
    
    DefaultTableModel modelkereta = new DefaultTableModel();
    void kosongkanTable(){
        int row=modelkereta.getRowCount();
        for(int i=0; i<row; i++){
            modelkereta.removeRow(0);
        }
    }
    
    public void tampilDataKereta(){
        kosongkanTable();
        try{
            String sql = "select *from kereta";
            String[] kolom = {"No Kursi","Nama Penumpang","Jumlah Beli","Uang Bayar","Total Bayar","Uang Kembali"};
            modelkereta.setColumnIdentifiers(kolom);
            ResultSet set = statement.executeQuery(sql);
            while(set.next()){
                String no_kursi = set.getString("No_kursi");
                String nama_penumpang = set.getString("Nama");
                String jumlah_beli = set.getString("Jumlah_beli");
                String uang_bayar = set.getString("uang_bayar");
                String total_bayar = set.getString("ttl_bayar");
                String uang_kembali = set.getString("uang_kembali");
                String[] data = {no_kursi,nama_penumpang,jumlah_beli,uang_bayar,total_bayar,uang_kembali};
                modelkereta.addRow(data);
            }
        }
        catch (Exception e){
            JOptionPane.showMessageDialog(null, e);
        }
    }
    
    
}
