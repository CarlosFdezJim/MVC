/**
 * @author Fernandez
 */

package Modelo;

import java.sql.SQLException;
import java.util.ArrayList;


public class Asignaturas extends Modelo {
    
    private String CodAsigString = null;
    private String NombreString = null;
    private Integer CursoInteger = null;
    
    
    public void setNombreString(String NombreString) {
        this.NombreString = NombreString;
    }    
    
    public void setCodAsigString(String CodAsigString) {
        this.CodAsigString = CodAsigString;
    }

    public void setCursoInteger(Integer CursoInteger) {
        this.CursoInteger = CursoInteger;
    }
    
    public String getNombreString() {
        return NombreString;
    }
    
    public String getCodAsigString() {
        return CodAsigString;
    }

    public Integer getCursoInteger() {
        return CursoInteger;
    }
    
    public void MostrarAsignatura(){
        
        System.out.println("Codigo asignatura: " + this.getCodAsigString());
        System.out.println("Nombre asignatura: " + this.getNombreString());
        System.out.println("Curso:" + this.getCursoInteger());
    }

    @Override
    public String toString() {
        return "Asignatura  " + CodAsigString + " - " + NombreString + " - " + CursoInteger + " curso " + "\n";
    }
    
    public ArrayList<Asignaturas> getAsignaturas(){
        
       String query = "SELECT * FROM universidad.asignatura";
       ArrayList<Asignaturas> viewAsignaturas = new ArrayList<>();
       
        try {
            this.getConection();
            st = conexConnection.createStatement();
            rs =  st.executeQuery(query);
            
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
