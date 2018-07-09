
package herencia;

/**
 *
 * @author ESFOT
 */
public class Estudiante extends Persona {
    private int nivel;
    private double notaSerBachiller;
        
    public Estudiante(String nombre, String apellido) {
        super(nombre, apellido);
    }

    public int getNivel() {
        return nivel;
    }

    public void setNivel(int nivel) {
        this.nivel = nivel;
    }

    public double getNotaSerBachiller() {
        return notaSerBachiller;
    }

    public void setNotaSerBachiller(double notaSerBachiller) {
        this.notaSerBachiller = notaSerBachiller;
    }
        
        
           
    }
    
    
    
    

