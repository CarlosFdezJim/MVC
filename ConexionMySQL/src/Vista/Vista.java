/**
 * @author Fernandez
 */

package Vista;

import Controlador.Controlador;
import java.io.IOException;
import java.util.Scanner;


/**
 * Aquí pedimos al usuario que queremos.
 */

public class Vista {
    
    Controlador controlador = null;
    
    public Vista() {
        controlador = new Controlador();
    
 }   
    public void printMenu() throws IOException{
        
        Scanner entrada = new Scanner(System.in);
        
        System.out.println("------------------------------");
        System.out.println("Selecciona la opción que deseas : ");
        System.out.println("1 - Mostrar todos los alumnos ");
        System.out.println("2 - Mostrar todas las asignaturas. ");
        System.out.println("3 - Salir ");
        System.out.println("------------------------------");
        int opcion = entrada.nextInt();
      
       
        switch (opcion) {
            case 1:
                System.out.println("Mostrar los datos de los alumnos.");
                controlador.MostrarUsuarios();
                
                break;
            case 2:
                System.out.println("Mostrar todas las asignatura.");
                controlador.MostrarAsignaturas();
                break;
            case 3:
                System.out.println("Enga a tu casa");
                break;
            default:
                System.err.println("Opción inválida");
                break;
        }
    }
    
    public void IniciarComponet() throws IOException{
        this.printMenu();
        
        
    }
}
