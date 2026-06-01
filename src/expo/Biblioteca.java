/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package expo;

/**
 *
 * @author TONY_VERA
 */
//ATRIBUTOS
    
   private ArrayList<Usuario> usuarios = new ArrayList<>();
    private ArrayList<MaterialBiblioteca> materiales = new ArrayList<>();
    private ArrayList<Prestamo> prestamos = new ArrayList<>();

    public Biblioteca() {
    }
    
 
    //METODOS
    public void agregarUsuarios(Usuario u){
        usuarios.add(u);
    }
    public void agregarPrestamo(Prestamo p) {
         if (prestamos.size() >= 3) {
            System.out.println("Límite de préstamos alcanzado");
            return;
        }
        prestamos.add(p);
    }
    public void agregarMaterial(MaterialBiblioteca m) {
        materiales.add(m);
    }
    public void devolverMaterial(int i) {
        prestamos.get(i).devolver();
    }
    public void mostrarUsuarios() {
        for (Usuario u : usuarios) {
            System.out.println(u.getNombres());
        }
    }
    public void mostrarMateriales() {
        for (MaterialBiblioteca m : materiales) {
            m.mostrarInformacion();
        }
    }
     public void mostrarPrestamos() {
        for (Prestamo p : prestamos) {
            p.mostrarPrestamo();
        }
    }
}
