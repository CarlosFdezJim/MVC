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
    
    
}
