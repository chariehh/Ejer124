/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package cursos;

/**
 *
 * @author Carla Daniela
 */
public class Evaluacion {
    private Estudiante estudiante;
    private double nota;

    // Constructor
    public Evaluacion(Estudiante estudiante, double nota) {
        this.estudiante = estudiante;
        this.nota = nota;
    }

    // Getter para la nota
    public double getNota() {
        return nota;
    }

    // Setter para la nota
    public void setNota(double nota) {
        this.nota = nota;
    }

    // Getter para el estudiante
    public Estudiante getEstudiante() {
        return estudiante;
    }

    // Método para mostrar la información de la evaluación
    public void mostrarInfo() {
        System.out.println("Estudiante: " + estudiante.getNombre() + " " + estudiante.getApellido());
        System.out.println("Nota: " + nota);
    }    
}
