/**
 * @author Fernandez
 */

package Controlador;

import Modelo.Alumnos;
import java.util.ArrayList;


public class AlumnosController extends Alumnos{
    
    public ArrayList traerConexion(){
       ArrayList<Alumnos> DBAlumnos = this.getAlumnos();
        return DBAlumnos;
    }
}
