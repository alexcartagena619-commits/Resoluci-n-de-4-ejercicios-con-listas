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

    public static void main(String[] args) { 
        
        double[] lista1 = new double[10];
        double[] lista2 = new double[10];
        double[] lista3 = new double[10];


    for (int i = 0; i < 10; i++) {
    String input = JOptionPane.showInputDialog("Lista 1 - Ingrese numero decimal:");
    lista1[i] = Double.parseDouble(input.replace(",", "."));
}

    // Llenar segunda lista
    for (int i = 0; i < 10; i++) {
    String input = JOptionPane.showInputDialog("Lista 2 - Ingrese numero decimal:");
    lista2[i] = Double.parseDouble(input.replace(",", "."));
}


        for (int i = 0; i < 10; i++) {
            lista3[i] = lista1[i] * lista2[9 - i]; 
            System.out.println("Lista1["+i+"] * Lista2["+(9-i)+"] -> " + lista1[i] + " * " + lista2[9 - i] + " = " + lista3[i]);
        }
        
    } 
} 