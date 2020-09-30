
package Conexion;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

/**
 * @author Fernandez
 */
public class Conector {
    
    public void ConexionDataBase(){
        
        Connection con = null;
        Statement st;
        ResultSet rs;
        
        String driver = "com.mysql.cj.jdbc.Driver";
        String user = "root";
        String password = "1234";
        String url = "jdbc:mysql://localhost:3306/alumnos?serverTimezone=UTC&useSSL=false";        
 
        try {
            Class.forName(driver);
            con = DriverManager.getConnection(url,user,password);
            System.out.println("Conexión establecida...");
        } catch (ClassNotFoundException | SQLException e) {
            System.err.println("Error de conexión " + e);
        }

    }

    public Statement createStatement() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
}