/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package expo;

/**
 *
 * @author TONY_VERA
 */
public class Tesis extends MaterialBiblioteca{
    //ATRIBUTOS
    
    private String tema,departamento;

    public Tesis() {
    }

    public Tesis(String tema, String departamento) {
        this.tema = tema;
        this.departamento = departamento;
    }

    public Tesis(String tema, String departamento, String codigo, String titulo, String autor, int anioPublicacion, boolean disponible) {
        super(codigo, titulo, autor, anioPublicacion, disponible);
        this.tema = tema;
        this.departamento = departamento;
    }

    public String getTema() {
        return tema;
    }

    public void setTema(String tema) {
        this.tema = tema;
    }

    public String getDepartamento() {
        return departamento;
    }

    public void setDepartamento(String departamento) {
        this.departamento = departamento;
    }
    
    
    
    //METODOS
    public void datosRevista(){
        System.out.println("categoria: " + tema);
        System.out.println("Numero de categoria: "+ departamento);
   
}

    @Override
    public double calcularMulta(int diasRetraso) {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }

    @Override
    public void mostrarInformacion() {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }
}