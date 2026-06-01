/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package expo;

/**
 *
 * @author TONY_VERA
 */
public class Estudiante extends Usuario {

    private String carrera;
    private String semestre;

    public Estudiante() {
    }

    public Estudiante(String carrera, String semestre,
            int id, int cedula, String nombre,
            int edad, String direccionDomicilio) {

        super(id, cedula, nombre, edad, direccionDomicilio);
        this.carrera = carrera;
        this.semestre = semestre;
    }

    public String getCarrera() {
        return carrera;
    }

    public void setCarrera(String carrera) {
        this.carrera = carrera;
    }

    public String getSemestre() {
        return semestre;
    }

    public void setSemestre(String semestre) {
        this.semestre = semestre;
    }
}

