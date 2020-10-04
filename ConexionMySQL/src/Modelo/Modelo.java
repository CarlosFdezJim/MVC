/**
 * @author Fernandez
 */

package Modelo;

import Conexion.Conector;
import java.sql.Connection;
import java.io.IOException;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;


/**
 * Esta clase se encarga de gestionar los datos que le piden desde el CONTROLADOR.
 */

public class Modelo {
    
    private static final String user = "root";
    private static final String password = "1234";
    private static final String url = "jdbc:mysql://localhost:3306/universidad?serverTimezone=UTC&useSSL=false";
    private Conector conector = null;
    private Connection connection;
    Statement st;
    
    public Modelo(){
        conector = new Conector();
        
    }
    
 
    public void MostrarUsuarios(){
        
        System.out.println("MOSTRAR ALUMNOS");
        String query = "SELECT * FROM alumnos";
        
        try {
            st = connection.createStatement();
            ResultSet rs =  st.executeQuery(query);
            
            while(rs.next()){
                System.out.println(rs.getString("DNI") + (" | ") + rs.getString("Nombre") + (" | ") + rs.getString("Apellidos") + (" | ") + rs.getString("Direccion") + (" | ") + rs.getString("Ciudad") + (" | "));
            }
            
            System.out.println("Conexión terminada...");
            connection.close();
        } catch (SQLException e) {
            System.err.println("Error de conexión " + e);
        }
    }
    
    public void MostrarAsignaturas(){
        
        System.out.println("MOSTRAR ASIGNATURAS");
        String query = "SELECT * FROM asignatura";
        
        try {
            Statement st = connection.createStatement();
            ResultSet rs =  st.executeQuery(query);
            
            while(rs.next()){
                System.out.println(rs.getString("Cod_asig") + (" | ") + rs.getString("Nombre") + (" | ") + rs.getString("Curso") + (" | "));
            }
            
            System.out.println("Conexión terminada...");
            connection.close();
        } catch (SQLException e) {
            System.err.println("Error de conexión " + e);
        }
    }
}
