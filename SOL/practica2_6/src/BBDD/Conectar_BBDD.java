package BBDD;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.util.logging.Level;
import java.util.logging.Logger;

public class Conectar_BBDD {

    private static Connection conexion = null;

    private Conectar_BBDD() {
    }

    public static Connection getConexion() {

        if (conexion == null) {
            try {
                String url;
                String usuario = "root";
                url = "jdbc:mysql://localhost:3306/";
                conexion = DriverManager.getConnection(url, usuario, null);
            } catch (SQLException e) {
                e.printStackTrace();
                System.out.println("Error al conectar al servidor MySQL.");
            }
        }

        return conexion;
    }

    public static void cerrarConexion() {
        try {
            if (conexion != null) {
                conexion.close();
            }

        } catch (SQLException ex) {
            System.out.println("No se ha podidoncerrarla conexion.");
        }

    }
}
