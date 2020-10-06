/**
 * @author Fernandez
 */

package Modelo;


public class Alumnos {
    
    private String DNIString = null;
    private String NombreString = null;
    private String ApellidoString = null;
    private String DireccionString = null;
    private String CiudadString = null;
    
    public Alumnos(){}

    public Alumnos(String DNIString, String NombreString, String ApellidoString,String DireccionString, String CiudadString) {
        System.out.println("CREANDO ALUMNO...");
        this.DNIString = DNIString;
        this.NombreString = NombreString;
        this.ApellidoString = ApellidoString;
        this.DireccionString = DireccionString;
        this.CiudadString = CiudadString;
        
    }
    
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

    public void MostrarAlumno(){
        
        System.out.println("Nombre: " + this.getNombreString());
        System.out.println("Apellido: " + this.getApellidoString());
        System.out.println("Dirección: " + this.getDireccionString());
        System.out.println("Ciudad: " + this.getCiudadString());
    }
    
    
}
