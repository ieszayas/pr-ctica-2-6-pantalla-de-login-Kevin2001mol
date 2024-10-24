package BBDD;

import java.io.FileInputStream;
import java.io.IOException;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.util.Properties;
import java.util.logging.Level;
import java.util.logging.Logger;

public class Conectar_BBDD {

    public String url;
    public String usuario;
    public String passswd;
    private static Connection conexion = null;

//    private Conectar_BBDD() {
//    }
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

    public Conectar_BBDD() {
        cargarPropiedades();
    }

    public void cargarPropiedades() {
        Properties propiedades = new Properties();
        try (FileInputStream fis = new FileInputStream("config.properties")) {
            propiedades.load(fis);
            url = propiedades.getProperty("db.url");
            usuario = propiedades.getProperty("db.usuario");
            passswd = propiedades.getProperty("db.passswd");
        } catch (IOException e) {
            e.printStackTrace();
        }

    }
}
