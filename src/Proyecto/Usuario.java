package Proyecto;

import java.io.*;
import java.util.UUID;

//@Embeddable
public class Usuario extends Persona implements Serializable {

	private static final long serialVersionUID = 1L;
	private String nombre;
	private String uuid;
    private String hashedContrasena;

    public Usuario(String nombre, String hashedContrasena) {
        super(nombre);
        this.uuid = UUID.randomUUID().toString();
        this.hashedContrasena = hashedContrasena;
    }

    public Usuario() {

    }

    public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public String getUuid() {
        return uuid;
    }

    public String getHashedContrasena() {
        return hashedContrasena;
    }

    public void setHashedContrasena(String hashedContrasena) {
        this.hashedContrasena = hashedContrasena;
    }

    public String listarUsuario() {
        return listarPersona() + ", UUID: " + uuid + ", Contraseña (hashed): " + hashedContrasena;
    }


}
