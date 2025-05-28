package Proyecto;

import java.io.Serializable;

public class SerializablePersona implements Serializable {
    private static final long serialVersionUID = 1L;
    private String nombre;

    public SerializablePersona(String nombre) {
        this.setNombre(nombre);
    }

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}
}
