/**
 * @author Fernandez
 */

package Controlador;

import Modelo.Modelo;
import java.util.ArrayList;


public class Controlador{
    
    private Modelo mod = new Modelo();
 
    public ArrayList MostrarAlumnosControlador(){
        return mod.MostrarAlumnos();
    }
    
    public ArrayList MostrarAsignaturasControlador(){
        return mod.MostrarAsignaturas();
    }
    
    public ArrayList MostrarMatriculaControlador(){
        return mod.MostrarMatriculas();
    }
}
