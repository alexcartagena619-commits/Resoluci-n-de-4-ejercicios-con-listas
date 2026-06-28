/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package practicas;

import javax.swing.JOptionPane;

/**
 *
 * @author chach
 */
    /**
     * @param 
     */
public class Practicas {

    public static void main(String[] args) {
        Libro l1 = new Libro();
        l1.id = 1; l1.titulo = "La vida nueva"; l1.autor = "Luis Ortiz";
        
        Libro l2 = new Libro();
        l2.id = 2; l2.titulo = "El pricipito"; l2.autor = "Estiven lara";
        
        Libro l3 = new Libro();
        l3.id = 3; l3.titulo = "Fue culpa de la vaca"; l3.autor = "David Becan";


        Persona p1 = new Persona();
        p1.setNombres("Juan");
        p1.setApellido("Pérez");
        p1.setCorreoElectronico("juan.perez@email.com");
        p1.setCedula(1005140619); 
        p1.setTelefono(9999999);
        
        p1.listaLibros[0] = l1;
        p1.listaLibros[1] = l2;
        p1.listaLibros[2] = l3;

        Persona[] listaPersonas = new Persona[1];
        listaPersonas[0] = p1;

        int cedulaBuscar = Integer.parseInt(JOptionPane.showInputDialog("INGRESE LA CÉDULA PARA SABER QUÉ LIBROS LEYÓ:"));
        boolean encontrado = false;

        for (Persona listaPersona : listaPersonas) {
            if (listaPersona.getCedula() == cedulaBuscar) {
                listaPersona.imprimir(); 
                encontrado = true;
                break;
            }
        }

        if (encontrado == false) {
            System.out.println("La cédula " + cedulaBuscar + " no está registrada en el sistema.");
        }
    }
}