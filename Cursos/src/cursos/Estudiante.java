/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package cursos;

/**
 *
 * @author Carla Daniela
 */
public class Estudiante {
    private static String nombre;
    private String apellido;
    private static String idUser;

    // Constructor
    public Estudiante(String nombre, String apellido, String idUser) {
        this.nombre = nombre;
        this.apellido = apellido;
        this.idUser = idUser;
    }

    // Getter para el nombre del usuario
    public static String getNombre() {
        return nombre;
    }

    // Getter para el apellido del usuario
    public String getApellido() {
        return apellido;
    }

    // Getter para el ID del usuario
    public static String getIdUser() {
        return idUser;
    }

    // Setter para el nombre del usuario
    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    // Setter para el apellido del usuario
    public void setApellido(String apellido) {
        this.apellido = apellido;
    }

    // Setter para el ID del usuario
    public void setIdUser(String idUser) {
        this.idUser = idUser;
    }    
}
