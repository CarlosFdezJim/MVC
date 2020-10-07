/**
 * @author Fernandez
 */

package Controlador;

import Conexion.Conector;
import Modelo.Modelo;
import Modelo.Alumnos;
import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;


public class AlumnoController extends Modelo{
    
    private Conector con = new Conector();
    private Connection conexConnection;
    private Modelo mod = null;
    private String DNIString = null;
    private String NombreString = null;
    private String ApellidoString = null;
    private String DireccionString = null;
    private String CiudadString = null;

    
    /**************************************************************************/
    
    public ArrayList<Alumnos> getAlumnos(){
        
       String query = "SELECT * FROM universidad.alumnos";
       ArrayList<Alumnos> viewAlumnos = new ArrayList<>();
       
        try {
            this.conexConnection = con.getConection();
            st = conexConnection.createStatement();
            rs =  st.executeQuery(query);
            
            while(rs.next()){
                Alumnos alu = new Alumnos();
                alu.setDNIString(rs.getString("DNI"));
                alu.setNombreString(rs.getString("Nombre"));
                alu.setApellidoString(rs.getString("Apellidos"));
                alu.setDireccionString(rs.getString("Direccion"));
                alu.setCiudadString(rs.getString("Ciudad"));
                viewAlumnos.add(alu);
            }
            
            System.out.println("Conexión terminada...");
            con.CloseConnection(conexConnection);
            //conexConnection.close();
        } catch (SQLException e) {
            System.err.println("Error de conexión " + e);
        }
        
        return viewAlumnos;
        
    }
    
}
