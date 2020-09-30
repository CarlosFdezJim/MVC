/**
 * @author Fernandez
 */
package Vista;

import Conexion.Conector;
import Controlador.Controlador;
import java.util.Scanner;

public class Vista {
    
    public void Menu(){
        
        Conector conectBDConexion;
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
                System.out.println("¡Holi! Soy todos los datos de los alumnos.");
                
                break;
            case 2:
                System.out.println("¡Holi! Soy todas las asignatura.");
                break;
            case 3:
                System.out.println("Enga a tu casa");
                break;
            default:
                System.err.println("Opción inválida");
                break;
        }
        
    }
    
    public static void main(String[] args) {
        Vista v = new Vista();
        Conector c = new Conector();
        c.ConexionDataBase();
        Controlador controlador = new Controlador();
        //controlador.MostrarUsuarios();
        //v.Menu();
        
        
        
        
    }
}
