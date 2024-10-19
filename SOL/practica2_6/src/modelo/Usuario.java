package modelo;

import java.util.ArrayList;
import java.util.Date;

public class Usuario {
    //public static ArrayList<Usuario>usuarios= new ArrayList();
    private String usuario;
    private String nombre;
    private String password;
    String correo;
    private String apellidos;
    Date fecha_nac;
    public static ArrayList<Usuario> hardcodeados;

    public Usuario() {
    }

    public Usuario(String usuario,String correo, String nombre, String apellidos, String password, Date fecha_nac) {
        this.usuario=usuario;
        this.correo = correo;
        this.nombre = nombre;
        this.apellidos = apellidos;
        this.password = password;
        this.fecha_nac = fecha_nac;
    }

    public Usuario(String nombre, String password) {
        this.nombre = nombre;
        this.password = password;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    @Override
    public String toString() {
        return  "Usiuario: "+usuario + "\t"+ " Nombre: " + nombre + "\t"+ " Apellidos: " + apellidos + "\t"+ " Fecha de Nacimiento: " + fecha_nac;
    }

//    public static ArrayList<Usuario> crear10Users() {
//        ArrayList<Usuario> hardcodeados = new ArrayList();
//        hardcodeados.add(new Usuario("Jaime@gmail.com", "j123"));
//        hardcodeados.add(new Usuario("Federico@gmail.com", "f123"));
//        hardcodeados.add(new Usuario("Izan@gmail.com", "i123"));
//        hardcodeados.add(new Usuario("Francis@gmail.com", "f123"));
//        hardcodeados.add(new Usuario("Manuel@gmail.com", "m123"));
//        hardcodeados.add(new Usuario("Jorge@gmail.com", "j123"));
//        hardcodeados.add(new Usuario("Fernando@gmail.com", "f123"));
//        hardcodeados.add(new Usuario("Ken@gmail.com", "k123"));
//        hardcodeados.add(new Usuario("Pablo@gmail.com", "p123"));
//        hardcodeados.add(new Usuario("Raul@gmail.com", "r123"));
//
//        return hardcodeados;
//    }

    public static void recorrerUsers(ArrayList<Usuario> usuarios) {
        for (Usuario usuario : usuarios) {
            System.out.println(usuario.toString());
        }

    }

    public String getCorreo() {
        return correo;
    }

    public void setCorreo(String correo) {
        this.correo = correo;
    }

    public String getApellidos() {
        return apellidos;
    }

    public void setApellidos(String apellidos) {
        this.apellidos = apellidos;
    }

    public Date getFecha_nac() {
        return fecha_nac;
    }

    public void setFecha_nac(Date fecha_nac) {
        this.fecha_nac = fecha_nac;
    }

    public String getUsuario() {
        return usuario;
    }

    public void setUsuario(String usuario) {
        this.usuario = usuario;
    }
    
    
}
