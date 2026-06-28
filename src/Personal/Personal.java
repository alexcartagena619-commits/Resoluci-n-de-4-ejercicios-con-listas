/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Personal;

/**
 *
 * @author chach
 */
public class Personal {
    private int id;
    private String nombres;
    private String direccion;
    private String telefono;
    private double sueldo;

    public Personal() {
    }

    public Personal(int id, String nombres, String direccion, String telefono, double sueldo) {
        this.id = id;
        this.nombres = nombres;
        this.direccion = direccion;
        this.telefono = telefono;
        this.sueldo = sueldo;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getNombres() {
        return nombres;
    }

    public void setNombres(String nombres) {
        this.nombres = nombres;
    }

    public String getDireccion() {
        return direccion;
    }

    public void setDireccion(String direccion) {
        this.direccion = direccion;
    }

    public String getTelefono() {
        return telefono;
    }

    public void setTelefono(String telefono) {
        this.telefono = telefono;
    }

    public double getSueldo() {
        return sueldo;
    }

    public void setSueldo(double sueldo) {
        this.sueldo = sueldo;
    }

    public void imprimir() {
        System.out.println("--- PERSONAL ---");
        System.out.println("ID: " + id);
        System.out.println("Nombres: " + nombres);
        System.out.println("Direccion: " + direccion);
        System.out.println("Telefono: " + telefono);
        System.out.println("Sueldo: " + sueldo);
    }
}
