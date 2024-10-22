package BBDD;

import static BBDD.Conectar_BBDD.getConexion;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.Date;
import java.util.Scanner;
import modelo.Usuario;

public class BBDD {

    private static final String NOMBRE_BBDD = "Gestion_Usuarios";
    public static Scanner sc = new Scanner(System.in);

    public static void crearBaseDeDatos() {

        String respuesta = "";
        Connection conexion = getConexion();
        PreparedStatement preparedStatement = null;
        ResultSet resultSet = null;
        try {

            if (conexion != null) {
                boolean existeBbdd = false;
                String sqlInterrogation = "SELECT SCHEMA_NAME FROM information_schema.SCHEMATA WHERE SCHEMA_NAME = ?";
                preparedStatement = conexion.prepareStatement(sqlInterrogation);
                preparedStatement.setString(1, NOMBRE_BBDD);
                resultSet = preparedStatement.executeQuery();
                existeBbdd = resultSet.next();

                if (existeBbdd) {
                    if (!quiereContinuarConBaseDeDatos()) { 
                        System.out.println("Eliminando la base de datos...");
                        String sqlDelete = "DROP DATABASE IF EXISTS " + NOMBRE_BBDD;
                        preparedStatement = conexion.prepareStatement(sqlDelete);
                        preparedStatement.executeUpdate();

                        System.out.println("Creando la base de datos...");
                        String sqlCreate = "CREATE DATABASE " + NOMBRE_BBDD;
                        preparedStatement = conexion.prepareStatement(sqlCreate);
                        preparedStatement.executeUpdate();
                    }
                } else {
                    System.out.println("Creando la base de datos...");
                    String sqlCreate = "CREATE DATABASE " + NOMBRE_BBDD;
                    preparedStatement = conexion.prepareStatement(sqlCreate);
                    preparedStatement.executeUpdate();
                }

                
                String sqlUse = "USE " + NOMBRE_BBDD;
                preparedStatement = conexion.prepareStatement(sqlUse);
                preparedStatement.executeUpdate();

                System.out.println("Conectado a la base de datos " + NOMBRE_BBDD);
            }
        } catch (SQLException e) {
            e.printStackTrace();
            System.out.println("Error al crear la base de datos.");
        } finally {
            try {
                if (preparedStatement != null) {
                    preparedStatement.close();
                }
                if (resultSet != null) {
                    resultSet.close();
                }

            } catch (SQLException e) {
                e.printStackTrace();
            }
        }
    }

    private static boolean quiereContinuarConBaseDeDatos() {
        System.out.println("Quieres continuar con la base de datos ya cargada? (si/no)");
        Scanner sc = new Scanner(System.in);
        String respuesta = sc.nextLine();
        return respuesta.equalsIgnoreCase("sí");
    }

    public static void crearTablaUsuarios() {
        Connection conexion = getConexion();
        Statement statement = null;

        try {
            // Desactivar el autocommit para manejar la transacción manualmente
            conexion.setAutoCommit(false);

            statement = conexion.createStatement();

            String sql = "CREATE TABLE IF NOT EXISTS Usuarios ("
                    + "usuario VARCHAR(100) PRIMARY KEY, "
                    + "correo VARCHAR(100), "
                    + "nombre VARCHAR(100), "
                    + "apellidos VARCHAR(100), "
                    + "password VARCHAR(15) NOT NULL, "
                    + "fecha_nac DATE)";

            statement.executeUpdate(sql);
            System.out.println("Tabla usuarios creada correctamente.");

            String sql_insert = "INSERT INTO usuarios (usuario, correo, nombre, apellidos, password, fecha_nac) "
                    + "VALUES ('Chorusete','Kevin2001molina@gmail.com', 'Kevin', 'Molina Estrella', '1136', '2001-09-05'),"
                    + "('JDJaime','Jaime@gmail.com', 'Jaime', 'Hernandez Lopez', '1136', '1997-10-15'),"
                    + "('FEDEX','Federico@gmail.com', 'Federico', 'Gutierrez Altamira', '1136', '2004-06-10'),"
                    + " ('izzann01','Izan@gmail.com', 'Izan', 'Vergara Prados', '1136', '2001-11-24'),"
                    + " ('elPadrino66','Francis@gmail.com', 'Francis', 'Coquelin Voltaire', '1136', '2012-01-30'),"
                    + "('ManuLoco_20','Manuel@gmail.com', 'Manuel', 'Fernandez de Frutos', '1136', '2010-07-11'),"
                    + " ('Jormen32','Jorge@gmail.com', 'Jorge', 'Mengibar Agricultor', '1136', '2005-04-25'),"
                    + " ('Fernanflo','Fernando@gmail.com', 'Fernando', 'Orduelo Mansillo', '1136', '2001-03-05'),"
                    + "('XxKenxX','Ken@gmail.com', 'Ken', 'Barbie Boyfriend', '1136', '2002-09-23'),"
                    + " ('Pblogshow','Pablo@gmail.com', 'Pablo', 'Garcia Agudin', '1136', '2001-10-16'),"
                    + " ('Raulgratm55','Raul@gmail.com', 'Raul', 'Gutierrez Rodriguez', '1136', '2001-07-11'),"
                    + " ('Sebas12','Sebastian@gmail.com', 'Sebastian', 'Yatra Yatra', '1136', '2001-09-05')";

            statement.executeUpdate(sql_insert);

            // Confirmar la transacción
            conexion.commit();
            System.out.println("Transaccion de usuarios completada .");

        } catch (SQLException e) {
            e.printStackTrace();
            System.out.println("Error al crear la tabla usuarios o insertar datos.");
            try {
                // Revertir los cambios si ocurre algún error
                if (conexion != null) {
                    conexion.rollback();
                    System.out.println("Transaccion revertida.");
                }
            } catch (SQLException ex) {
                ex.printStackTrace();
            }
        } finally {

            try {
                if (statement != null) {
                    statement.close();
                }
                if (conexion != null) {
                    conexion.setAutoCommit(true);
                }
            } catch (SQLException e) {
                e.printStackTrace();
            }
        }
    }

    public static ArrayList<Usuario> cargarUsuarios() {
        Connection conexion = getConexion();  //lo usamos siempre para conectar con la bbdd
        ArrayList<Usuario> usuarios = new ArrayList();

        Statement statement = null;
        ResultSet resultSet = null;
        try {

            if (conexion != null) {
                statement = conexion.createStatement();
                String sql_return = "SELECT * FROM usuarios";
                resultSet = statement.executeQuery(sql_return);

                while (resultSet.next()) {// mientras siga habiendo cosas
                    String usuario1 = resultSet.getString("usuario");
                    String correo = resultSet.getString("correo");
                    String nombre = resultSet.getString("nombre");
                    String apellidos = resultSet.getString("apellidos");
                    String password = resultSet.getString("password");
                    Date fecha_nac = resultSet.getDate("fecha_nac");

                    // Crear un nuevo objeto Jugador y añadirlo a la lista
                    Usuario usuario = new Usuario(usuario1, correo, nombre, apellidos, password, fecha_nac);
                    usuarios.add(usuario);
                }

            }
        } catch (SQLException e) {
            e.printStackTrace();
            System.out.println("Error al crear la base de datos.");
        } finally {
            // Cerrar recursos
            try {
                if (resultSet != null) {
                    resultSet.close();
                }
                if (statement != null) {
                    statement.close();
                }

            } catch (SQLException e) {
                e.printStackTrace();
            }
        }

        return usuarios;
    }

    public static boolean agregarUsuarios(Usuario usuario) {
        Connection conexion = getConexion();
        PreparedStatement preparedStatement = null;

        try {

            String sql_insert = "INSERT INTO `usuarios` (`usuario`, `correo`, `nombre`, `apellidos`, `password`, `fecha_nac`) "
                    + "VALUES ( ?, ?, ?, ?, ?, ?)";
            preparedStatement = conexion.prepareStatement(sql_insert);
            preparedStatement.setString(1, usuario.getUsuario());
            preparedStatement.setString(5, usuario.getPassword());
            if (usuario.getNombre() != null) {
                preparedStatement.setString(3, usuario.getNombre());
            } else {

                preparedStatement.setNull(3, java.sql.Types.VARCHAR);//hay q poner eso para que detecte que es null 
            }
            if (usuario.getCorreo() != null) {
                preparedStatement.setString(2, usuario.getCorreo());
            } else {
                preparedStatement.setNull(2, java.sql.Types.VARCHAR);
            }
            if (usuario.getApellidos() != null) {
                preparedStatement.setString(4, usuario.getApellidos());
            } else {
                preparedStatement.setNull(4, java.sql.Types.VARCHAR);
            }
            if (usuario.getFecha_nac() != null) {
                preparedStatement.setDate(6, new java.sql.Date(usuario.getFecha_nac().getTime()));//getTime te convierte el valor a long que es lo que lee la conversion en la BBDD
            } else {
                preparedStatement.setNull(6, java.sql.Types.DATE);
            }

            preparedStatement.executeUpdate();

            System.out.println("Usuario agregado exitosamente en la base de datos.");
            return true;
        } catch (SQLException e) {
            e.printStackTrace();
            System.out.println("Error al guardar usuario en la base de datos.");
            return false;
        } finally {
            // Cerrar recursos
            try {
                if (preparedStatement != null) {
                    preparedStatement.close();
                }

            } catch (SQLException e) {
                e.printStackTrace();
            }
        }

    }

}
