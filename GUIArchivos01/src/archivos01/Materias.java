
package archivos01;

import java.io.Serializable;

public class Materias implements Serializable{
    private String nombre;

    //Contructor vacío
    public Materias() {}

    //Constructor con un parámetro
    public Materias(String nombre) {
        this.nombre = nombre;
    }
    
    //Getters y Setters

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }
    
    //To String

    @Override
    public String toString() {
        
        return nombre;
    }
    
    
}
