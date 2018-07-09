
package herencia;

/**
 *
 * @author ESFOT
 */
public class Herencia {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Estudiante e = new Estudiante("Juan", "Perez");
        
        Profesor p = new Profesor("Edwin", "Salvador");
        //p es una intancia de Profesor y profesor es una clase hija de Persona
        
        
        System.out.println("Nombre Estudiante: " + e.getNombre());
        System.out.println("Nombre Profesor: " + p.getNombre() + " " +  p.getApellido());
      
        
    }
    
}
