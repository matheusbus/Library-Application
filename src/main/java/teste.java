
import br.com.exception.DBException;
import br.com.infra.DB;
import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author Matheus
 */
public class teste {
    
    public static void main(String[] args) {
        
        Connection conn = null;
        Statement st = null;
        ResultSet query = null;
        
        try {
            conn = DB.getConnection();
            st = conn.createStatement();
            query = st.executeQuery("select * from public.tbestado");
            
            while(query.next()){
                System.out.println(query.getInt(1) + " - " + query.getString(2) + " - " + query.getString(3));
            }
        } catch (SQLException e){
            throw new DBException(e.getMessage());
        }
        
        // Banco rodando.
        
    }
    
}
