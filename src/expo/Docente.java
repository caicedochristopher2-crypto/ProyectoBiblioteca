/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package expo;

/**
 *
 * @author TONY_VERA
 */
public class Docente extends Usuario {

    private String departamento;
    private String especialidad;

    public Docente() {
    }

    public Docente(String departamento, String especialidad) {
        this.departamento = departamento;
        this.especialidad = especialidad;
    }

    public Docente(String departamento, String especialidad, int id, int cedula, String nombre, int edad, String direccionDomicilio) {
        super(id, cedula, nombre, edad, direccionDomicilio);
        this.departamento = departamento;
        this.especialidad = especialidad;
    }

  

    public String getDepartamento() {
        return departamento;
    }

    public void setDepartamento(String departamento) {
        this.departamento = departamento;
    }

    public String getEspecialidad() {
        return especialidad;
    }

    public void setEspecialidad(String especialidad) {
        this.especialidad = especialidad;
    }
}

