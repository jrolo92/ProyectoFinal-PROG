package Utils;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

public class ConexionBDR {
	public static void main(String[] args) {
		try {
//			Conectar mediante jdbc al servidor donde se encuentra nuestra bd
			String url = "jdbc:mariadb://localhost:3306/proyecto";
			String user = "root";
			String password = "";
//			Establecemos conexion con la bd a partir de la url de la misma, el usuario y contraseña.
			Connection con = DriverManager.getConnection(url, user, password);
//			Creamos un objeto Statement que nos va a permitir ejecutar consultas SQL
			Statement stmt = con.createStatement();
			System.out.println("Conexión establecida correctamente.");
			
//			Ejecutar Consultas:
//			Select tabla usuarios:
			String querySelectUsers = "SELECT * FROM usuarios WHERE id = 2";
			ResultSet resSelectUsers = stmt.executeQuery(querySelectUsers);//Ejecuta consulta y apunta a la primera columna de la tabla
			while (resSelectUsers.next()) { //Va a ir pasando a las siguientes columnas e imprimiendo sus valores
				System.out.println("ID: " + resSelectUsers.getInt("id") + ", Nombre: " + resSelectUsers.getString("Nombre") + ", Contraseña: " + resSelectUsers.getString("Contrasenha"));
			}
			resSelectUsers.close();
			
//			Select tabla tareas:
			String querySelectTareas = "SELECT * FROM tareas WHERE id = 2";
			ResultSet resSelectTareas = stmt.executeQuery(querySelectTareas);//Ejecuta consulta y apunta a la primera columna de la tabla
			while (resSelectTareas.next()) { //Va a ir pasando a las siguientes columnas e imprimiendo sus valores
				System.out.println("ID: " + resSelectTareas.getInt("id") + ", Descripcion: " + resSelectTareas.getString("Descripcion") + 
						", Nombre Corto: " + resSelectTareas.getString("NombreCorto") + ", Estado: " + resSelectTareas.getString("Estado") + 
						", Usuario_id: " + resSelectTareas.getInt("Usuario_id"));
			}
			resSelectTareas.close();
			
//			Insert:
//			El método executeUpdate devuelve un número (el numero de cambios que se hayan producido)
			String queryInsert = "INSERT INTO usuarios (Nombre, Contrasenha) VALUES ('Tomás', 'TommyV')";
			System.out.println("Se insertaron: " + stmt.executeUpdate(queryInsert) + " filas");

//			Update:
//			El método executeUpdate devuelve un número (el numero de cambios que se hayan producido)
			String queryUpdate = "UPDATE tareas SET  NombreCorto = 'MKT' WHERE id = 1";
			System.out.println("Se actualizaron: " + stmt.executeUpdate(queryUpdate) + " filas");
			
//			Delete:
//			El método executeUpdate devuelve un número (el numero de cambios que se hayan producido)
			String queryDelete = "DELETE FROM tareas WHERE id = 20";
			System.out.println("Se eliminaron: " + stmt.executeUpdate(queryDelete) + " filas");
			
			stmt.close();
			con.close();
		} catch (SQLException e) {
			System.err.println("SQLException: " + e.getMessage());
		}
	}


////	Usando métodos
////	Conectar BD
//	public static Connection conectar() throws SQLException {
//		String url = "jdbc:mariadb://localhost:3306/proyecto";
//		String user = "root";
//		String password = "root";
//		Connection con = DriverManager.getConnection(url, user, password);
//		con.close();
//		return con;
//	}
//	
////	Create, update, delete.
//	public static void ejecutarConsulta(String query) {
//		Connection con = null;
//		Statement stmt = null;
//		
//		try {
//			con = conectar();
//			stmt = con.createStatement();
//	        stmt.executeUpdate(query);
//	        System.out.println("Consulta ejecutada correctamente.");
//	    } catch (SQLException e) {
//	            e.printStackTrace();
//	    }
//	}
//
////	Select
//	public static void mostrarResultados(String query) {
//		Connection con = null;
//		Statement stmt = null;
//		ResultSet rs = null;
//		
//		try {
//			con = conectar();
//			stmt = con.createStatement();
//			rs = stmt.executeQuery(query);
//			while (rs.next()) {
//				System.out.println("ID: " + resSelect.getInt("id") + ", Nombre: " + resSelect.getString("Nombre") + ", Contraseña: " + resSelect.getString("Contrasenha"));
//			}
//	    } catch (SQLException e) {
//	    	e.printStackTrace();
//	    }
//	}
}

