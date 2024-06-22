/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package cursos;

import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author Carla Daniela
 */
public class Profesor {
    private String nombre;
    private String apellido;
    private List<String> asignaturas; // Lista para almacenar las asignaturas del profesor

    // Constructor
    public Profesor(String nombre, String apellido) {
        this.nombre = nombre;
        this.apellido = apellido;
        this.asignaturas = new ArrayList<>(); // Inicialización de la lista de asignaturas
    }

    // Método para mostrar la información del profesor
    public void mostrarInfo() {
        System.out.println("Nombre del profesor: " + this.nombre + " " + this.apellido);
    }

    // Getter para el nombre del profesor
    public String getNombre() {
        return this.nombre;
    }

    // Setter para el nombre del profesor
    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    // Getter para el apellido del profesor
    public String getApellido() {
        return this.apellido;
    }

    // Setter para el apellido del profesor
    public void setApellido(String apellido) {
        this.apellido = apellido;
    }

    // Método para añadir una asignatura al profesor
    public void añadirAsignatura(String asignatura) {
        this.asignaturas.add(asignatura);
    }

    // Método para obtener la lista de asignaturas del profesor
    public List<String> getAsignaturas() {
        return this.asignaturas;
    }    
}
