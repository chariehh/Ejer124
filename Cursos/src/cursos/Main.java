/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package cursos;

import Ventanas.Login;
import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author Carla Daniela
 */
public class Main {

    public static List<Estudiante> listaEstudiantes = new ArrayList<>();
    public static List<Profesor> listaProfesores = new ArrayList<>();
    public static List<Horario> listaHorarios = new ArrayList<>();
    public static List<Asignatura> listaAsignaturas = new ArrayList<>();
    public static List<Curso> listaCursos = new ArrayList<>();

    public static void main(String[] args) {
        // Registrar estudiantes
        listaEstudiantes.add(new Estudiante("Juan", "Perez", "001"));
        listaEstudiantes.add(new Estudiante("Maria", "Gonzalez", "002"));
        listaEstudiantes.add(new Estudiante("Pedro", "Martinez", "003"));
        listaEstudiantes.add(new Estudiante("Ana", "Lopez", "004"));
        listaEstudiantes.add(new Estudiante("Carlos", "Garcia", "005"));
        listaEstudiantes.add(new Estudiante("Luisa", "Rodriguez", "006"));
        listaEstudiantes.add(new Estudiante("Javier", "Sanchez", "007"));
        listaEstudiantes.add(new Estudiante("Laura", "Diaz", "008"));
        listaEstudiantes.add(new Estudiante("Miguel", "Hernandez", "009"));
        listaEstudiantes.add(new Estudiante("Sofia", "Torres", "010"));

        // Registrar profesores
        listaProfesores.add(new Profesor("Alberto", "Gómez"));
        listaProfesores.add(new Profesor("María", "López"));
        listaProfesores.add(new Profesor("Pedro", "Ruiz"));
        listaProfesores.add(new Profesor("Luisa", "Sánchez"));
        listaProfesores.add(new Profesor("Carlos", "Fernández"));
        listaProfesores.add(new Profesor("Laura", "Martín"));
        listaProfesores.add(new Profesor("Javier", "García"));
        listaProfesores.add(new Profesor("Lucía", "Pérez"));
        listaProfesores.add(new Profesor("Miguel", "Romero"));
        listaProfesores.add(new Profesor("Sofía", "Gutiérrez"));

        // Registrar horarios
        listaHorarios.add(new Horario("Lunes", "08:00", "10:00"));
        listaHorarios.add(new Horario("Martes", "10:00", "12:00"));
        listaHorarios.add(new Horario("Miércoles", "14:00", "16:00"));
        listaHorarios.add(new Horario("Jueves", "16:00", "18:00"));
        listaHorarios.add(new Horario("Viernes", "08:00", "10:00"));

        // Registrar asignaturas
        listaAsignaturas.add(new Asignatura("Matemáticas", listaProfesores.get(0)));
        listaAsignaturas.add(new Asignatura("Historia", listaProfesores.get(1)));
        listaAsignaturas.add(new Asignatura("Ciencias", listaProfesores.get(2)));
        listaAsignaturas.add(new Asignatura("Literatura", listaProfesores.get(3)));
        listaAsignaturas.add(new Asignatura("Inglés", listaProfesores.get(4)));
        listaAsignaturas.add(new Asignatura("Programación", listaProfesores.get(5)));
        listaAsignaturas.add(new Asignatura("Arte", listaProfesores.get(6)));
        listaAsignaturas.add(new Asignatura("Educación Física", listaProfesores.get(7)));
        listaAsignaturas.add(new Asignatura("Química", listaProfesores.get(8)));
        listaAsignaturas.add(new Asignatura("Biología", listaProfesores.get(9)));

        // Crear cursos
        listaCursos.add(new Curso("Curso de Matemáticas", listaAsignaturas.get(0), listaHorarios.get(0)));
        listaCursos.add(new Curso("Curso de Historia", listaAsignaturas.get(1), listaHorarios.get(1)));

            java.awt.EventQueue.invokeLater(new Runnable() {
            @Override
            public void run() {
                new Login().setVisible(true);
            }
        });
    }
}
