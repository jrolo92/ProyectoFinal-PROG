package Proyecto;

/**
 * Excepción personalizada para cuando un usuario no se encuentra.
 */

public class CreacionUsuarioException extends IllegalArgumentException {
    public CreacionUsuarioException(String mensaje) {
        super(mensaje);
    }
}
