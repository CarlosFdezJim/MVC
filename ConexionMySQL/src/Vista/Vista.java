/**
 * @author Fernandez
 */

package Vista;

import Controlador.AlumnosController;
import Modelo.Alumnos;
import Modelo.Asignaturas;
import Controlador.Controlador;
import Modelo.Matricula;
import Controlador.AsignaturaController;
import java.util.ArrayList;
import java.util.Scanner;


public class Vista {
    
    Controlador controlador = null;
    String SearchNombre = null;
    
    public Vista() {
        controlador = new Controlador();
 }   
    
    public void printAlumnunos(){
        ArrayList<Alumnos> MostrarAlumnosVista = new ArrayList<Alumnos>();
        AlumnosController Alu = new AlumnosController();
        MostrarAlumnosVista = Alu.traerConexion();
        
        for(int i = 0; i < MostrarAlumnosVista.size(); i++) {   
            System.out.print(MostrarAlumnosVista.get(i));
        }
    }
    
    public void printAsignaturas(){
        ArrayList<Asignaturas> MostrarAsignaturasVista = new ArrayList<Asignaturas>();
        AsignaturaController Asig = new AsignaturaController();
        MostrarAsignaturasVista = Asig.traerConexion();
        
        for(int i = 0; i < MostrarAsignaturasVista.size(); i++) {
            System.out.print(MostrarAsignaturasVista.get(i));
        }
    }
 
    public void prinMatriculas(){
        ArrayList<Matricula> MostrarMatriculaVista;
        MostrarMatriculaVista = controlador.MostrarMatriculaControlador();
        
        for(int i = 0; i < MostrarMatriculaVista.size(); i++) {
            System.out.print(MostrarMatriculaVista.get(i));
        }
    }
    
    public void printMenu(){
        
        Scanner entrada = new Scanner(System.in);
        Scanner nameString = new Scanner(System.in);
        
        System.out.println("------------------------------");
        System.out.println("Selecciona la opción que deseas : ");
        System.out.println("1 - Mostrar todos los alumnos ");
        System.out.println("2 - Mostrar todas las asignaturas. ");
        System.out.println("3 - Mostrar todas las matriculas. ");
        System.out.println("4 - Salir ");
        System.out.println("------------------------------");
        int opcion = entrada.nextInt();
      
        switch (opcion) {
            case 1:
                System.out.println("Mostrar los datos de los alumnos.");
                this.printAlumnunos();
                break;
            case 2:
                System.out.println("Mostrar todas las asignatura.");
                this.printAsignaturas();
                break;
            case 3:
                System.out.println("Mostrar todas las asignatura.");
                this.prinMatriculas();
//                System.out.println("¿Qué alumno desea buscar?");
//                SearchNombre = nameString.nextLine();
                break;
            case 4:
                System.out.println("Enga a tu casa");
                break;
            default:
                System.err.println("Opción inválida");
                break;
            }
    }
    
    public void IniciarComponet(){
        this.printMenu();
    }
    
    public static void main(String[] args){
    
    Vista v = new Vista();
    v.IniciarComponet();
    
    }
}
