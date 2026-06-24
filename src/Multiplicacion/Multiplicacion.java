/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Multiplicacion;

import javax.swing.JOptionPane;

/**
 *
 * @author chach
 */
public class Multiplicacion {

    public static void main(String[] args) { // ¡Esto quita las líneas rojas de los bucles for!
        
        double[] lista1 = new double[10];
        double[] lista2 = new double[10];
        double[] lista3 = new double[10];

    // Llenar primera lista
    for (int i = 0; i < 10; i++) {
    String input = JOptionPane.showInputDialog("Lista 1 - Ingrese numero decimal:");
    // .replace(",", ".") cambia cualquier coma que escribas por un punto antes de convertirlo
    lista1[i] = Double.parseDouble(input.replace(",", "."));
}

    // Llenar segunda lista
    for (int i = 0; i < 10; i++) {
    String input = JOptionPane.showInputDialog("Lista 2 - Ingrese numero decimal:");
    lista2[i] = Double.parseDouble(input.replace(",", "."));
}

        // Multiplicar cruzado (Primera posición con la última)
        for (int i = 0; i < 10; i++) {
            lista3[i] = lista1[i] * lista2[9 - i]; // 9-i nos da el elemento inverso
            System.out.println("Lista1["+i+"] * Lista2["+(9-i)+"] -> " + lista1[i] + " * " + lista2[9 - i] + " = " + lista3[i]);
        }
        
    } 
} 