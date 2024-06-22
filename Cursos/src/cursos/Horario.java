/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package cursos;

/**
 *
 * @author Carla Daniela
 */
public class Horario {
    private String dia;
    private String horaInicio;
    private String horaFin;

    // Constructor
    public Horario(String dia, String horaInicio, String horaFin) {
        this.dia = dia;
        this.horaInicio = horaInicio;
        this.horaFin = horaFin;
    }

    // Getter para el día
    public String getDia() {
        return dia;
    }

    // Getter para la hora de inicio
    public String getHoraInicio() {
        return horaInicio;
    }

    // Getter para la hora de fin
    public String getHoraFin() {
        return horaFin;
    }

    // Setter para el día
    public void setDia(String dia) {
        this.dia = dia;
    }

    // Setter para la hora de inicio
    public void setHoraInicio(String horaInicio) {
        this.horaInicio = horaInicio;
    }

    // Setter para la hora de fin
    public void setHoraFin(String horaFin) {
        this.horaFin = horaFin;
    }

    // Método para mostrar la información del horario
    public String mostrarInfo() {
        return "Horario:"+ dia + "de"+ horaInicio +"hasta"+ horaFin;
    }    
}
