/**
 * @author Fernandez
 */
package Controlador;

import Conexion.Conector;
import Modelo.Asignaturas;
import Modelo.Alumnos;
import Modelo.Modelo;
import Modelo.Matricula;
import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;

public class MatriculaController extends Modelo{
    
    private Conector con = new Conector();
    private Connection conexConnection;
    private String DniMatriculaString = "";
    private String NombreMatriculaString = "";
    private String ApellidoMatriculaString = "";
    private String Cod_asigMatriculaString = "";
    private Integer CursoMatriculaInteger = 0;
    Asignaturas asig = new Asignaturas();
    Alumnos alu = new Alumnos();
    String NameSearch = "";
    
    
    /**************************************************************************/
    public ArrayList<Matricula> getMatricula(){
        
       String query = "SELECT * FROM universidad.matricula";
       String query2 = "SELECT * FROM universidad.matricula WHERE Nombre_alu='" + NameSearch + "'";
       ArrayList<Matricula> viewMatricula = new ArrayList<>();
       
        try {
            this.conexConnection = con.getConection();
            Statement st = conexConnection.createStatement();
            ResultSet rs =  st.executeQuery(query2);
            
            while(rs.next()){
                Matricula mat = new Matricula();
                mat.setDNIMatString(rs.getString("DNI"));
                mat.setNombreMatString(rs.getString("Nombre_alu"));
                mat.setApellidoMatString(rs.getString("Apellido_alu"));
                mat.setNombreAsigMatString(rs.getString("Nombre_asig"));
                mat.setCodAsigMatString(rs.getString("Cod_asig"));
                mat.setCursoMatInteger(rs.getInt("Curso"));
                viewMatricula.add(mat);
            }
            
            System.out.println("Conexión terminada...");
            con.CloseConnection(conexConnection);
            //conexConnection.close();
        } catch (SQLException e) {
            System.err.println("Error de conexión " + e);
        }
        
        return viewMatricula;
    }  
}
