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
        int tamaño = oracion.length(); // Obtenemos cuántas letras tiene la frase

        // Creamos la lista estática (el arreglo tradicional) con el tamaño exacto de la frase
        char[] listaLetras = new char[tamaño];

        // Llenamos el arreglo posición por posición
        for (int i = 0; i < tamaño; i++) {
            listaLetras[i] = oracion.charAt(i); // El .charAt(i) extrae la letra en la posición i
        }

        int vocales = 0;
        int consonantes = 0;
        int espacios = 0;

        // Recorremos tu arreglo con un bucle clásico, justo como lo haces en clase
        for (int i = 0; i < tamaño; i++) {
            char letra = listaLetras[i];
            
            // Evaluamos si es un espacio en blanco
            if (letra == ' ') {
                espacios++;
            } 
            // Evaluamos las vocales (tanto minúsculas como mayúsculas)
            else if (letra == 'a' || letra == 'e' || letra == 'i' || letra == 'o' || letra == 'u' ||
                     letra == 'A' || letra == 'E' || letra == 'I' || letra == 'O' || letra == 'U') {
                vocales++;
            } 
            // Si es una letra del abecedario y no fue vocal, sumamos a las consonantes
            else if ((letra >= 'a' && letra <= 'z') || (letra >= 'A' && letra <= 'Z')) {
                consonantes++;
            }
        }

        // Imprimimos los resultados en la consola
        System.out.println("Oracion analizada: \"" + oracion + "\"");
        System.out.println("Cantidad de Vocales: " + vocales);
        System.out.println("Cantidad de Consonantes: " + consonantes);
        System.out.println("Cantidad de Espacios en blanco: " + espacios);
        
    }
}