/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Personal;

import javax.swing.JOptionPane;

/**
 *
 * @author chach
 */
public class Administrador extends Personal {
    private String departamento;
    private String jornada;

    public Administrador() {
    }

    public Administrador(int id, String nombres, String direccion, String telefono, double sueldo, String departamento, String jornada) {
        super(id, nombres, direccion, telefono, sueldo);
        this.departamento = departamento;
        this.jornada = jornada;
    }

    public String getDepartamento() {
        return departamento;
    }

    public void setDepartamento(String departamento) {
        this.departamento = departamento;
    }

    public String getJornada() {
        return jornada;
    }

    public void setJornada(String jornada) {
        this.jornada = jornada;
    }

    @Override
    public void imprimir() {
        super.imprimir();
        System.out.println("Departamento: " + departamento);
        System.out.println("Jornada: " + jornada);
    }
}
