package modelo;

import java.util.ArrayList;

public class Usuario {

    private String nombre;
    private String password;
    public static ArrayList<Usuario> hardcodeados = crear10Users();
    public Usuario() {
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
        return "Usuario{" + "nombre=" + nombre + ", password=" + password + '}';
    }

    public static ArrayList<Usuario> crear10Users() {
        ArrayList<Usuario> hardcodeados = new ArrayList();
        hardcodeados.add(new Usuario("Jaime@gmail.com", "j123"));
        hardcodeados.add(new Usuario("Federico@gmail.com", "f123"));
        hardcodeados.add(new Usuario("Izan@gmail.com", "i123"));
        hardcodeados.add(new Usuario("Francis@gmail.com", "f123"));
        hardcodeados.add(new Usuario("Manuel@gmail.com", "m123"));
        hardcodeados.add(new Usuario("Jorge@gmail.com", "j123"));
        hardcodeados.add(new Usuario("Fernando@gmail.com", "f123"));
        hardcodeados.add(new Usuario("Ken@gmail.com", "k123"));
        hardcodeados.add(new Usuario("Pablo@gmail.com", "p123"));
        hardcodeados.add(new Usuario("Raul@gmail.com", "r123"));

        return hardcodeados;
    }

}
