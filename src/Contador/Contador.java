/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Contador;
import javax.swing.JOptionPane;

/**
 *
 * @author chach
 */
public class Contador {
    public static void main(String[] args) {
        
        String oracion = JOptionPane.showInputDialog("Ingrese una oracion:");
        int tamaño = oracion.length(); 

        char[] listaLetras = new char[tamaño];

        
        for (int i = 0; i < tamaño; i++) {
            listaLetras[i] = oracion.charAt(i); 
        }

        int vocales = 0;
        int consonantes = 0;
        int espacios = 0;

        for (int i = 0; i < tamaño; i++) {
            char letra = listaLetras[i];
            

            if (letra == ' ') {
                espacios++;
            } 

            else if (letra == 'a' || letra == 'e' || letra == 'i' || letra == 'o' || letra == 'u' ||
                     letra == 'A' || letra == 'E' || letra == 'I' || letra == 'O' || letra == 'U') {
                vocales++;
            } 

            else if ((letra >= 'a' && letra <= 'z') || (letra >= 'A' && letra <= 'Z')) {
                consonantes++;
            }
        }


        System.out.println("Oracion analizada: \"" + oracion + "\"");
        System.out.println("Cantidad de Vocales: " + vocales);
        System.out.println("Cantidad de Consonantes: " + consonantes);
        System.out.println("Cantidad de Espacios en blanco: " + espacios);
        
    }
}