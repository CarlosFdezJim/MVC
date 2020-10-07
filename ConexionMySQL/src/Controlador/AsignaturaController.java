/**
 * @author Fernandez
 */

package Controlador;

import Conexion.Conector;
import Modelo.Asignaturas;
import Modelo.Modelo;
import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;


public class AsignaturaController extends Modelo{
    
    private Conector con = new Conector();
    private Connection conexConnection;
    private Modelo mod = null;
    private String CodAsigString = null;
    private String NombreString = null;
    private Integer CursoInteger = null;
    
    /**************************************************************************/
    
    public ArrayList<Asignaturas> getAsignaturas(){
        
       String query = "SELECT * FROM universidad.asignatura";
       ArrayList<Asignaturas> viewAsignaturas = new ArrayList<>();
       
        try {
            this.conexConnection = con.getConection();
            Statement st = conexConnection.createStatement();
            ResultSet rs =  st.executeQuery(query);
            
            while(rs.next()){
                Asignaturas asig = new Asignaturas();
                asig.setCodAsigString(rs.getString("Cod_asig"));
                asig.setNombreString(rs.getString("Nombre"));
                asig.setCursoInteger(rs.getInt("Curso"));
                viewAsignaturas.add(asig);
            }
            
            System.out.println("Conexión terminada...");
            conexConnection.close();
        } catch (SQLException e) {
            System.err.println("Error de conexión " + e);
        }
        
        return viewAsignaturas;
    }
    
}
