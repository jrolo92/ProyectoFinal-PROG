package proyectoud8;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Statement;
import java.sql.SQLException;

public class Main {
    public static void main(String[] args) {
        try {
            Class.forName("org.mariadb.jdbc.Driver");
            String url = "jdbc:mariadb://localhost:3306/geslibros";
            Connection con = DriverManager.getConnection(url,"root","");
            Statement stmt = con.createStatement();
            System.out.println("Conexión Exitosa");
            
             // Execute the query
            String query = "SELECT * FROM libros";
            ResultSet rs = stmt.executeQuery(query);

            // Process the result set
            while (rs.next()) {
                // Replace with actual column names from your table
                int id = rs.getInt("id");
                String titulo = rs.getString("titulo");
                String autor = rs.getString("autor_id");
                System.out.println("ID: " + id + ", Título: " + titulo + ", Autor: " + autor);
            }
            rs.close(); //Nuevo
            stmt.close();
            con.close();
            
        } catch (ClassNotFoundException |SQLException e) {
            System.err.println("Error Conexión");
            e.printStackTrace();
        }
    }
}