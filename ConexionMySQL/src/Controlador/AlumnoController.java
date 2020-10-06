/**
 * @author Fernandez
 */

package Controlador;

import Conexion.Conector;
import Modelo.Alumnos;
import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;


public class AlumnoController {
    
    private Conector con = new Conector();
    public Connection conexConnection;
    
    public ArrayList<Alumnos> getAlumnos(){
        
       String query = "SELECT * FROM alumnos";
       ArrayList<Alumnos> viewAlumnos = new ArrayList<>();
       
        try {
            this.conexConnection = con.getConection();
            Statement st = conexConnection.createStatement();
            ResultSet rs =  st.executeQuery(query);
            
            
            while(rs.next()){
                //System.out.println(rs.getString("DNI") + (" | ") + rs.getString("Nombre") + (" | ") + rs.getString("Apellidos") + (" | ") +
                //rs.getString("Direccion") + (" | ") + rs.getString("Ciudad") + (" | "));
                
                Alumnos alu = new Alumnos();
                alu.setDNIString(rs.getString("DNI"));
                alu.setNombreString(rs.getString("Nombre"));
                alu.setApellidoString(rs.getString("Apellidos"));
                alu.setDireccionString(rs.getString("Direccion"));
                alu.setCiudadString(rs.getString("Ciudad"));
                viewAlumnos.add(alu);
            }
            
            System.out.println("Conexión terminada...");
            conexConnection.close();
        } catch (SQLException e) {
            System.err.println("Error de conexión " + e);
        }
        
        return viewAlumnos;
        
    }
    
}
