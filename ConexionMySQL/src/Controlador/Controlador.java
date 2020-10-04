/**
 * @author Fernandez
 */
package Controlador;

import Modelo.Modelo;
import java.io.IOException;

/**
 * Esta clase se encarga de pedir a los datos al MODELO.
 */

public class Controlador {
    
    private Modelo mod;
    
    public Controlador(){
        mod = new Modelo();
    }
 
    public void MostrarUsuarios() throws IOException{
        mod.MostrarUsuarios();
    }
    
    public void MostrarAsignaturas() throws IOException{
        
        mod.MostrarAsignaturas();
    }
}
