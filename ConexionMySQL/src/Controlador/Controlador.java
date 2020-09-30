/**
 * @author Fernandez
 */
package Controlador;

import Conexion.Conector;
import java.io.IOException;
import java.sql.SQLException;
import java.sql.ResultSet;
import java.sql.Statement;


public class Controlador {
    
    private static final String user = "root";
    private static final String password = "1234";
    private static final String url = "jdbc:mysql://localhost:3306/alumnos?serverTimezone=UTC&useSSL=false";
    Statement st;
    ResultSet rs;
    Conector conet = new Conector();
    
    public void MostrarUsuarios() throws IOException{
        
        System.out.println("MOSTRAR USUARIOS");
        String query = "SELECT * FROM alumnos";
        
        try {
            st = conet.createStatement();
            rs =  st.executeQuery(query);
            
            while(rs.next()){
                System.out.println(rs.getString("DNI") + (" | ") + rs.getString("Nombre") + (" | ") + rs.getString("Apellido") + (" | ") + rs.getString("Direccion") + (" | "));
            }
            
            System.out.println("Conexión terminada...");
            conet.close();
        } catch (SQLException e) {
            System.err.println("Error de conexión " + e);
        }
    }

}
