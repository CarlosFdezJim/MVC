/**
 * @author Fernandez
 */

package Modelo;

import Controlador.AlumnoController;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;


/**
 * Esta clase se encarga de gestionar los datos que le piden desde el CONTROLADOR.
 */

public class Modelo {
 
    public void MostrarAlumnos(){
        
    AlumnoController alu = new AlumnoController();
    ArrayList<Alumnos> DBAlumnos = alu.getAlumnos();
    }
    
    public void MostrarAsignaturas(){
        
        /*System.out.println("MOSTRAR ASIGNATURAS");
        String query = "SELECT * FROM asignatura";
        
        try {
            this.conexConnection = con.getConection();
            Statement st = conexConnection.createStatement();
            ResultSet rs =  st.executeQuery(query);
            
            while(rs.next()){
                System.out.println(rs.getString("Cod_asig") + (" | ") + rs.getString("Nombre") + (" | ") + rs.getString("Curso") + (" | "));
            }
            
            System.out.println("Conexión terminada...");
            conexConnection.close();
        } catch (SQLException e) {
            System.err.println("Error de conexión " + e);
        }*/
    }
}
