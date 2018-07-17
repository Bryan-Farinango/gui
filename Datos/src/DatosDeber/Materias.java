
package DatosDeber;


public class Materias {
    
    private String nombre;

    public Materias(String nombre) {
        this.nombre = nombre;
    }

    
    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    @Override
    public String toString() {
        return  nombre;
    }
    
    
    
}
