/**
 * @author Fernandez
 */

package Conexion;

/**
 * Esta clase se encarga de conectar con la Base de datos.
 */

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;


public class Conector {
    
    Connection con = null;
    
    public Conector(){
        
        String driver = "com.mysql.cj.jdbc.Driver";
        String user = "root";
        String password = "1234";
        String url = "jdbc:mysql://localhost:3306/universidad?serverTimezone=UTC&useSSL=false";

        try {
            Class.forName(driver);
            con = DriverManager.getConnection(url,user,password);
            System.out.println("Conexión establecida...");
        } catch (ClassNotFoundException | SQLException e) {
            System.err.println("Error de conexión " + e);
        }
    }
}