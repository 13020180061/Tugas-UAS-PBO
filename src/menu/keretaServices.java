/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package menu;

import java.sql.SQLException;
import java.util.List;

/**
 *
 * @author hatii
 */
public class keretaServices {
    
    /**
     *
     */
    public interface keretaServices {
    Profil insert(Profil p) throws SQLException;
    void update(Profil p) throws SQLException;
    void delete(int id) throws SQLException;
    List getAll() throws SQLException;
}

}
