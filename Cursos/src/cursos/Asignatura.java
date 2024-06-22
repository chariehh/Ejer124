/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package cursos;

/**
 *
 * @author Carla Daniela
 */
public class Asignatura {
    private String nombre;
    private Profesor profesor;

    // Constructor
    public Asignatura(String nombre, Profesor profesor) {
        this.nombre = nombre;
        this.profesor = profesor;
    }

    // Método para mostrar la información de la asignatura
    public void mostrarInfo() {
        System.out.println("Nombre de la asignatura: " + nombre);
        System.out.println("Profesor: " + profesor.getNombre() + " " + profesor.getApellido());
    }

    // Getter para el nombre de la asignatura
    public String getNombre() {
        return nombre;
    }

    // Getter para el profesor de la asignatura
    public Profesor getProfesor() {
        return profesor;
    }    
}
