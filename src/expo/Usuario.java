/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package expo;

/**
 *
 * @author TONY_VERA
 */
ublic class Usuario {

    private int id;
    private int cedula;
    private String nombres;
    private int edad;
    private String direccionDomicilio;

    public Usuario() {
    }

    public Usuario(int id, int cedula, String nombre, int edad, String direccionDomicilio) {
        this.id = id;
        this.cedula = cedula;
        this.nombres = nombres;
        this.edad = edad;
        this.direccionDomicilio = direccionDomicilio;
    }

    public void consultarMateriales() {
        System.out.println("Consultando materiales disponibles...");
    }

    public void solicitarPrestamo() {
        System.out.println("Préstamo solicitado.");
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public int getCedula() {
        return cedula;
    }

    public void setCedula(int cedula) {
        this.cedula = cedula;
    }

    public String getNombres() {
        return nombres;
    }

    public void setNombres(String nombres) {
        this.nombres = nombres;
    }


    
    public int getEdad() {
        return edad;
    }

    public void setEdad(int edad) {
        this.edad = edad;
    }

    public String getDireccionDomicilio() {
        return direccionDomicilio;
    }

    public void setDireccionDomicilio(String direccionDomicilio) {
        this.direccionDomicilio = direccionDomicilio;
    }
}

