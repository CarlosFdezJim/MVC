/**
 * @author Fernandez
 */

package Modelo;


public class Matricula {
    
    private String DNIMatString = null;
    private String NombreMatString = null;
    private String ApellidoMatString = null;
    private String NombreAsigMatString = null;
    private String CodAsigMatString = null;
    private Integer CursoMatInteger = null;
    

    public void setDNIMatString(String DNIMatString) {
        this.DNIMatString = DNIMatString;
    }

    public void setNombreMatString(String NombreMatString) {
        this.NombreMatString = NombreMatString;
    }

    public void setApellidoMatString(String ApellidoMatString) {
        this.ApellidoMatString = ApellidoMatString;
    }

    public void setNombreAsigMatString(String NombreAsigMatString) {
        this.NombreAsigMatString = NombreAsigMatString;
    }

    public void setCodAsigMatString(String CodAsigMatString) {
        this.CodAsigMatString = CodAsigMatString;
    }

    public void setCursoMatInteger(Integer CursoMatInteger) {
        this.CursoMatInteger = CursoMatInteger;
    }

    public String getDNIMatString() {
        return DNIMatString;
    }

    public String getNombreMatString() {
        return NombreMatString;
    }

    public String getApellidoMatString() {
        return ApellidoMatString;
    }

    public String getNombreAsigMatString() {
        return NombreAsigMatString;
    }

    public String getCodAsigMatString() {
        return CodAsigMatString;
    }

    public Integer getCursoMatInteger() {
        return CursoMatInteger;
    }

    @Override
    public String toString() {
        return "Matricula{" +  DNIMatString + ", " + NombreMatString + " " + ApellidoMatString + ", " + NombreAsigMatString + ", " + CodAsigMatString + ", Curso " + CursoMatInteger + '}' + "\n";
    }
    
}