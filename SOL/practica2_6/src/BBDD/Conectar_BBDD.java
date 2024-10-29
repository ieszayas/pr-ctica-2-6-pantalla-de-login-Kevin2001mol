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
            System.out.println("No se ha podido cerrar la conexion.");
        }

    }

    public Conectar_BBDD() {
        cargarPropiedades();
    }

    public static Connection cargarPropiedades() {
        if (conexion == null) {
            Properties propiedades = new Properties();
            try (FileInputStream fis = new FileInputStream("./AccesoBBDD/config.properties")) {
                propiedades.load(fis);
                String  url = propiedades.getProperty("db.url");
                String usuario = propiedades.getProperty("db.usuario");
                String passswd = propiedades.getProperty("db.passswd");
                return conexion = DriverManager.getConnection(url, usuario, passswd);
            } catch (IOException e) {
                System.out.println("Error al leer el archivo de configuración.");
                e.printStackTrace();
            } catch (SQLException ex) {
                Logger.getLogger(Conectar_BBDD.class.getName()).log(Level.SEVERE, null, ex);
            }

        }
         return null;
    }
        public static Connection cargarPropiedadesBBDD() {
        if (conexion == null) {
            Properties propiedades = new Properties();
            try (FileInputStream fis = new FileInputStream("./AccesoBBDD/configBBDD.properties")) {
                propiedades.load(fis);
                String  url = propiedades.getProperty("db.url");
                String usuario = propiedades.getProperty("db.usuario");
                String passswd = propiedades.getProperty("db.passswd");
                return conexion = DriverManager.getConnection(url, usuario, passswd);
            } catch (IOException e) {
                System.out.println("Error al leer el archivo de configuración.");
                e.printStackTrace();
            } catch (SQLException ex) {
                Logger.getLogger(Conectar_BBDD.class.getName()).log(Level.SEVERE, null, ex);
            }

        }
         return null;
    }
}
