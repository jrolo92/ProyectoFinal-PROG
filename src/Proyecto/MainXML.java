package Proyecto;

import java.util.List;

public class MainXML {

    public static void main(String[] args) throws Exception {
        GestionUsuarios gestion = new GestionUsuarios();
        XMLManager xmlManager = new XMLManager();

        // Insertar usuarios manualmente
        gestion.insertarUsuario(new Usuario("Ana", "abc123hashed"));
        gestion.insertarUsuario(new Usuario("Luis", "pass456hashed"));

        // Guardar a XML
        String path = "C:\\Users\\usuario\\Documents\\1 DAW\\PROGRAMACIÓN\\Proyecto Final\\src\\Ficheros\\usuarios.xml";
        xmlManager.guardarUsuariosEnXML(gestion.usuariosLista, path);
        //xmlManager.guardarUsuariosEnXML(gestion.usuariosLista, "usuarios.xml");

        // Cargar desde XML
        List<Usuario> cargados = xmlManager.cargarUsuariosDesdeXML("C:\\Users\\usuario\\Documents\\1 DAW\\PROGRAMACIÓN\\Proyecto Final\\src\\Ficheros\\usuarios.xml");
        //List<Usuario> cargados = xmlManager.cargarUsuariosDesdeXML("usuarios.xml");

        // Mostrar usuarios cargados
        System.out.println("Usuarios cargados desde XML:");
        for (Usuario u : cargados) {
            System.out.println(u.listarUsuario());
        }
    }
}