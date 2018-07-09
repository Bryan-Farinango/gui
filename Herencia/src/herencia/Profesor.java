
package herencia;

/**
 *
 * @author ESFOT
 */
public class Profesor extends Persona{
    //un metodo super
    //llama al constructor del padre 
    private int aniosExperiencia;
    private String profesion;
    
    public Profesor(String nombre, String apellido) {
        super(nombre, apellido);
        //no podemos hacer this.nombre porque esta en private en la clase padre
        
        this.nombre = "Ing. " + this.nombre;
        this.aniosExperiencia = 5;
    }
    
    public Profesor(String nombre, String apellido, int aniosExperiencia) {
        super(nombre, apellido);
        //no podemos hacer this.nombre porque esta en private en la clase padre
        
        this.aniosExperiencia = aniosExperiencia;
    }
    
    //el hijo puede mejorar lo que haga el padre+
    //sobreescribir
    @Override
    public String getNombre(){
        return "El estudiante se llama: " + nombre;
    }
    
    //getters y setters de sus atributos especificos

    public int getAniosExperiencia() {
        return aniosExperiencia;
    }

    public void setAniosExperiencia(int aniosExperiencia) {
        this.aniosExperiencia = aniosExperiencia;
    }

    public String getProfesion() {
        return profesion;
    }

    public void setProfesion(String profesion) {
        this.profesion = profesion;
    }
    
}
