/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package cursos;

import java.util.List;

/**
 *
 * @author Carla Daniela
 */
public class Curso {
    private String nombre;
    private Asignatura asignatura;
    private Horario horario;
    private List<Estudiante> estudiantes;

    // Constructor
    public Curso(String nombre, Asignatura asignatura, Horario horario, List<Estudiante> estudiantes) {
        this.nombre = nombre;
        this.asignatura = asignatura;
        this.horario = horario;
        this.estudiantes = estudiantes;
    }

    // Método estático para obtener la información de un curso como cadena de texto
    public static String obtenerInfo(Curso curso) {
        StringBuilder info = new StringBuilder();
        info.append("Curso: ").append(curso.nombre).append("\n");
        info.append("Asignatura: ").append(curso.asignatura.getNombre()).append("\n");
        info.append("Profesor: ");
        if (curso.asignatura.getProfesor() != null) {
            info.append(curso.asignatura.getProfesor().getNombre()).append(" ").append(curso.asignatura.getProfesor().getApellido()).append("\n");
        } else {
            info.append("No asignado\n");
        }
        info.append("Horario: ").append(curso.horario.mostrarInfo()).append("\n");
        info.append("Estudiantes:\n");
        for (Estudiante estudiante : curso.estudiantes) {
            info.append("- ").append(estudiante.getNombre()).append(" ").append(estudiante.getApellido()).append("\n");
        }
        return info.toString();
    }

    Curso(String curso_de_Matemáticas, Asignatura get, Horario get0) {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }

    // Getter para el nombre del curso
    public String getNombre() {
        return nombre;
    }

    // Setter para el nombre del curso
    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    // Getter para la asignatura del curso
    public Asignatura getAsignatura() {
        return asignatura;
    }

    // Getter para el horario del curso
    public Horario getHorario() {
        return horario;
    }    
}
