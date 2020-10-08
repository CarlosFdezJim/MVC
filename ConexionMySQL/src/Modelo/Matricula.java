/**
 * @author Fernandez
 */

package Modelo;


import java.sql.SQLException;
import java.util.ArrayList;


public class Matricula extends Modelo{
    
    private String DNIMatString = null;
    private String NombreMatString = null;
    private String ApellidoMatString = null;
    private String NombreAsigMatString = null;
    private String CodAsigMatString = null;
    private Integer CursoMatInteger = null;
    String NameSearch = "Carlos";
    

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
    
        public ArrayList<Matricula> getMatricula(){
        
       String query = "SELECT * FROM universidad.matricula";
       String query2 = "SELECT * FROM universidad.matricula WHERE Nombre_alu='" + NameSearch + "'";
       ArrayList<Matricula> viewMatricula = new ArrayList<>();
       
        try {
            this.getConection();
            st = conexConnection.createStatement();
            rs =  st.executeQuery(query);
            
            while(rs.next()){
                Matricula mat = new Matricula();
                mat.setDNIMatString(rs.getString("DNI"));
                mat.setNombreMatString(rs.getString("Nombre_alu"));
                mat.setApellidoMatString(rs.getString("Apellido_alu"));
                mat.setNombreAsigMatString(rs.getString("Nombre_asig"));
                mat.setCodAsigMatString(rs.getString("Cod_asig"));
                mat.setCursoMatInteger(rs.getInt("Curso"));
                viewMatricula.add(mat);
            }
            
            System.out.println("Conexión terminada...");
            this.CloseConnection(conexConnection);
        } catch (SQLException e) {
            System.err.println("Error de conexión " + e);
        }
        
        return viewMatricula;
    }  
    
}