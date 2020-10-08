/**
 * @author Fernandez
 */

package Controlador;

import Modelo.Asignaturas;
import java.util.ArrayList;


public class AsignaturaController extends Asignaturas{
    
    public ArrayList traerConexion(){
       ArrayList<Asignaturas> DBAsignatura = this.getAsignaturas();
        return DBAsignatura;
    }
}
