
/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ProyectoFinal;

import java.util.NoSuchElementException;

/**
 * Excepción personalizada para cuando un usuario no se encuentra.
 */

public class CreacionUsuarioException extends IllegalArgumentException {
    public CreacionUsuarioException(String mensaje) {
        super(mensaje);
    }
}
