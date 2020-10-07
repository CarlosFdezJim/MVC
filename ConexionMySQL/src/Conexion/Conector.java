/**
 * @author Fernandez
 */

package Conexion;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;


public class Conector {
    
    Connection con;
    private String DBdriver = "com.mysql.cj.jdbc.Driver";
    private String DBuser = "root";
    private String DDBpassword = "1234";
    private String DBport = "3306";
    private String DB = "universidad";
    private String DBurl = "jdbc:mysql://localhost:" + DBport + "/" + DB + "?serverTimezone=UTC&useSSL=false";
    
    public Connection getConection(){
        
        try {
            Class.forName(DBdriver);
            con = DriverManager.getConnection(DBurl,DBuser,DDBpassword);
            System.out.println("Conexión establecida...");
        } catch (ClassNotFoundException | SQLException e) {
            System.err.println("Error de conexión " + e);
        }
        return con;
    }
    
    public void CloseConnection(Connection con) throws SQLException{
        con.close();
    }
}