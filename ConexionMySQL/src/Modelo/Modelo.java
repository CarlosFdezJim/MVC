/**
 * @author Fernandez
 */

package Modelo;

import Conexion.Conector;
import Controlador.AlumnosController;
import Controlador.MatriculaController;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.Statement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;


public class Modelo {
    
    protected Connection conexConnection;
    protected Statement st;
    protected ResultSet rs;
    
    private String DBdriver = "com.mysql.cj.jdbc.Driver";
    private String DBuser = "root";
    private String DDBpassword = "1234";
    private String DBport = "3306";
    private String DB = "universidad";
    private String DBurl = "jdbc:mysql://localhost:" + DBport + "/" + DB + "?serverTimezone=UTC&useSSL=false";
    
    public Connection getConection(){
        
        try {
            Class.forName(DBdriver);
            conexConnection = DriverManager.getConnection(DBurl,DBuser,DDBpassword);
            System.out.println("Conexión establecida...");
        } catch (ClassNotFoundException | SQLException e) {
            System.err.println("Error de conexión " + e);
        }
        return conexConnection;
    }
    
    public void CloseConnection(Connection con) throws SQLException{
        con.close();
    }    
 
    public ArrayList MostrarAlumnos(){
        
        Alumnos alu = new Alumnos();
        ArrayList<Alumnos> DBAlumnos = alu.getAlumnos();
        return DBAlumnos;
    }
    
    public ArrayList MostrarAsignaturas(){
        
        Asignaturas asig = new Asignaturas();
        ArrayList<Asignaturas> DBAsignaturas = asig.getAsignaturas();
        return DBAsignaturas;
    }
    
    public ArrayList MostrarMatriculas(){
        
        Matricula mat = new Matricula();
        ArrayList<Matricula> DBMatriculas = mat.getMatricula();
        return DBMatriculas;
    }
    
}

