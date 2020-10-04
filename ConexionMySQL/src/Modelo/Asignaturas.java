/**
 * @author Fernandez
 */

package Modelo;


public class Asignaturas {
    
    private String CodAsigString = null;
    private String NombreString = null;
    private Integer CursoInteger = null;
    
    public Asignaturas(String CodAsigString,String NombreString,Integer CursoInteger){
        
            this.CodAsigString = CodAsigString;
            this.NombreString = NombreString;
            this.CursoInteger = CursoInteger;
            
    }

    public String getCodAsigString() {
        return CodAsigString;
    }

    public void setCodAsigString(String CodAsigString) {
        this.CodAsigString = CodAsigString;
    }

    public String getNombre() {
        return NombreString;
    }

    public void setNombre(String NombreString) {
        this.NombreString = NombreString;
    }

    public Integer getCursoInteger() {
        return CursoInteger;
    }

    public void setCursoInteger(Integer CursoInteger) {
        this.CursoInteger = CursoInteger;
    }
    
    public void MostrarAsignatura(){
        
        System.out.println("Codigo asignatura: " + this.getCodAsigString());
        System.out.println("Nombre asignatura: " + this.getNombre());
        System.out.println("Curso:" + this.getCursoInteger());
    }
}
