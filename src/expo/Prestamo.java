/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package expo;

/**
 *
 * @author TONY_VERA
 */

    private String usuario,material,fechaPrestamo,fechaEntrega;
    private double multa;


    public Prestamo() {
    }

    public Prestamo(String usuario, String material, String fechaPrestamo, String fechaEntrega, double multa) {
        this.usuario = usuario;
        this.material = material;
        this.fechaPrestamo = fechaPrestamo;
        this.fechaEntrega = fechaEntrega;
        this.multa = multa;
    }

    public String getUsuario() {
        return usuario;
    }

    public void setUsuario(String usuario) {
        this.usuario = usuario;
    }

    public String getMaterial() {
        return material;
    }

    public void setMaterial(String material) {
        this.material = material;
    }

    public String getFechaPrestamo() {
        return fechaPrestamo;
    }

    public void setFechaPrestamo(String fechaPrestamo) {
        this.fechaPrestamo = fechaPrestamo;
    }

    public String getFechaEntrega() {
        return fechaEntrega;
    }

    public void setFechaEntrega(String fechaEntrega) {
        this.fechaEntrega = fechaEntrega;
    }

    public double getMulta() {
        return multa;
    }

    public void setMulta(double multa) {
        this.multa = multa;
    }
    
    @Override
    public void prestar() {
        try {
        if (material == null) {
            throw new Exception("Material no disponible");
        }

        System.out.println("Préstamo realizado a: " + usuario);

    } catch (Exception e) {
        System.out.println(e.getMessage());
    }
       
    }

    @Override
public void devolver() {
    int diasRetraso = 5; 

    if (material.equalsIgnoreCase("libro")) {
        multa = diasRetraso * 0.5;
    } else if (material.equalsIgnoreCase("revista")) {
        multa = diasRetraso * 1.0;
    } else {
        multa = diasRetraso * 1.5;
    }

    System.out.println("Devuelto por: " + usuario);
    System.out.println("Multa: $" + multa);
}
    
    
    public void mostrarPrestamo() {
        System.out.println("Usuario: " + usuario);
        System.out.println("Material: " + material);
        System.out.println("Fecha préstamo: " + fechaPrestamo);
        System.out.println("Multa: $" + multa);
    }
    
}
