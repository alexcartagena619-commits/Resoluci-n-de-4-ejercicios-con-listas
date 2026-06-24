/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ValidarNumero;

import javax.swing.JOptionPane;

/**
 *
 * @author chach
 */
public class ValidarNumero {

    public static void main(String[] args) {
        
        int[] primos = {2, 3, 5, 7, 11, 13, 17, 19, 23, 29, 31, 37, 41, 43, 47}; // Lista de primos conocidos
        int numero = Integer.parseInt(JOptionPane.showInputDialog("Ingrese un numero:"));

        boolean encontrado = false;

        // Bucle para buscar en la lista
        for (int i = 0; i < primos.length; i++) {
            if (numero == primos[i]) {
                encontrado = true;
            }
        }

        // Validación de resultados
        if (encontrado == true) {
            System.out.println("El numero " + numero + " si es primo y esta en la lista.");
        } else {
            System.out.println("El numero " + numero + " no se encuentra en la lista de primos.");
        }
        
    } 
}