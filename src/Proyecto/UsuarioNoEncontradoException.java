package Proyecto;

import java.util.NoSuchElementException;

/**
 * Excepción personalizada para cuando un usuario no se encuentra.
 */

public class UsuarioNoEncontradoException extends NoSuchElementException {
    public UsuarioNoEncontradoException(String mensaje) {
        super(mensaje);
    }
}
