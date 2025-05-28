package Proyecto;

import javax.persistence.Embeddable;

@Embeddable
public class Persona {
    protected String nombre;

    public Persona(String nombre) {
        this.nombre = nombre;
    }

    public Persona() {

    }

    public String listarPersona() {
        return "Nombre: " + nombre;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }
}
