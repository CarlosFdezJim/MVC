/**
 * @author Fernandez
 */

package Modelo;

import java.sql.SQLException;
import java.util.ArrayList;


public class Alumnos extends Modelo{
    
    private String DNIString = null;
    private String NombreString = null;
    private String ApellidoString = null;
    private String DireccionString = null;
    private String CiudadString = null;
    
    
    public void setDNIString(String DNIString) {
        this.DNIString = DNIString;
    }
    
    public String getDNIString() {
        return DNIString;
    }

    public void setNombreString(String NombreString) {
        this.NombreString = NombreString;
    }

    public String getNombreString() {
        return NombreString;
    }

    public void setApellidoString(String ApellidoString) {
        this.ApellidoString = ApellidoString;
    }

    public String getApellidoString() {
        return ApellidoString;
    }

    public void setDireccionString(String DireccionString) {
        this.DireccionString = DireccionString;
    }

    public String getDireccionString() {
        return DireccionString;
    }

    public void setCiudadString(String CiudadString) {
        this.CiudadString = CiudadString;
    }
    
    public String getCiudadString() {
        return CiudadString;
    }

      @Override
    public String toString() {
        return "Alumno: " + DNIString + " "+ NombreString + " " + ApellidoString + ", Direccion " + DireccionString + ", " + CiudadString + "\n" ;
    }     
    
   public ArrayList<Alumnos> getAlumnos(){
        
       String query = "SELECT * FROM universidad.alumnos";
       ArrayList<Alumnos> viewAlumnos = new ArrayList<>();
       
        try {
            this.getConection();
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
            this.CloseConnection(conexConnection);
            conexConnection.close();
        } catch (SQLException e) {
            System.err.println("Error de conexión " + e);
        }
        
        return viewAlumnos;
        
    } 
}
