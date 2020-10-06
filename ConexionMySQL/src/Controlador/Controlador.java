/**
 * @author Fernandez
 */
package Controlador;

import Modelo.Modelo;

/**
 * Esta clase se encarga de pedir a los datos al MODELO.
 */

public class Controlador {
    
    private Modelo mod = new Modelo();;
    
 
    public void MostrarUsuarios(){
        mod.MostrarAlumnos();
    }
    
    public void MostrarAsignaturas(){
        
        mod.MostrarAsignaturas();
    }
}
