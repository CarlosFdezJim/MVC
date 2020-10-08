/**
 * @author Fernandez
 */

package Controlador;


import Modelo.Matricula;
import java.util.ArrayList;


public class MatriculaController extends Matricula{
    
    public ArrayList traerConexion(){
       ArrayList<Matricula> DBMatricula = this.getMatricula();
       return DBMatricula;
    }
    
    public ArrayList traerConexion(String NameSearch){
       ArrayList<Matricula> DBMatricula = this.getMatricula(NameSearch);
       return DBMatricula;
    }
}
