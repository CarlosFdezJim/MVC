/**
 * @author Fernandez
 */

package Modelo;


public class Asignaturas {
    
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
}
