/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package practicas;

/**
 *
 * @author chach
 */
public class Persona {
    private String nombre;
    private String apellido; // ¡Corregido con S mayúscula!
    private String correoElectronico;
    private int cedula;
    private int telefono;
    
    // Lista estática de 3 libros asignados a esta persona
    public Libro[] listaLibros = new Libro[3]; 

    public Persona() {
    }

    // Métodos Setters y Getters
    public void setNombres(String nombre) { this.nombre = nombre; }
    public void setApellido(String apellido) { this.apellido = apellido; }
    public void setCorreoElectronico(String correoElectronico) { this.correoElectronico = correoElectronico; }
    public void setCedula(int cedula) { this.cedula = cedula; }
    public int getCedula() { return this.cedula; }
    public void setTelefono(int telefono) { this.telefono = telefono; }

    // Método imprimir corregido con tus variables reales
    public void imprimir() {
        System.out.println("--- DATOS DE LA PERSONA ---");
        System.out.println("Nombre: " + nombre);
        System.out.println("Apellido: " + apellido);
        System.out.println("Email: " + correoElectronico);
        System.out.println("Cédula: " + cedula);
        System.out.println("Teléfono: " + telefono);
        System.out.println("Libros que lee:");
        for (int i = 0; i < 3; i++) {
            if (listaLibros[i] != null) {
                System.out.println(" - Libro " + (i+1) + ": " + listaLibros[i].titulo + " (Autor: " + listaLibros[i].autor + ")");
            }
        }
        System.out.println("---------------------------------------");
    }
}