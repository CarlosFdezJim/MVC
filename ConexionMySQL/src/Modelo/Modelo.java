/**
 * @author Fernandez
 */

package Modelo;

import Conexion.Conector;
import Controlador.AlumnoController;
import Controlador.AsignaturaController;
import Controlador.MatriculaController;
import com.sun.jdi.connect.spi.Connection;
import java.sql.Statement;
import java.sql.ResultSet;
import java.util.ArrayList;


public class Modelo {
    
    protected Conector con = new Conector();
    protected Connection conexConnection;
    protected Statement st;
    protected ResultSet rs;
    
    /**************************************************************************/
 
    public ArrayList MostrarAlumnos(){
        
        AlumnoController alu = new AlumnoController();
        ArrayList<Alumnos> DBAlumnos = alu.getAlumnos();
        return DBAlumnos;
    }
    
    public ArrayList MostrarAsignaturas(){
        
        AsignaturaController asig = new AsignaturaController();
        ArrayList<Asignaturas> DBAsignaturas = asig.getAsignaturas();
        return DBAsignaturas;
    }
    
    public ArrayList MostrarMatriculas(){
        
        MatriculaController mat = new MatriculaController();
        ArrayList<Matricula> DBMatriculas = mat.getMatricula();
        return DBMatriculas;
    }
    
}

