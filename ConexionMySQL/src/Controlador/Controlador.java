/**
 * @author Fernandez
 */

package Controlador;

import Modelo.Modelo;
import Controlador.AsignaturaController;
import Modelo.Asignaturas;
import java.util.ArrayList;


public class Controlador{
    
    private Modelo mod = new Modelo();
    private Asignaturas asig = new Asignaturas();
 
    public ArrayList MostrarAlumnosControlador(){
        return mod.MostrarAlumnos();
    }
    
    public ArrayList MostrarAsignaturasControlador(){
        ArrayList<Asignaturas> AsignaturasArrayList = asig.getAsignaturas();
        return AsignaturasArrayList;
    }
    
    public ArrayList MostrarMatriculaControlador(){
        return mod.MostrarMatriculas();
    }
}
