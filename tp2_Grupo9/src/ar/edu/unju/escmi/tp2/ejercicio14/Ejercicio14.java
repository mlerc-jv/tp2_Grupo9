package ar.edu.unju.escmi.tp2.ejercicio14;

import java.util.Scanner;

public class Ejercicio14 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int[] numeros = new int[8]; // array con 8 posiciones (índices 0a 7)

        for (int i = 0; i < numeros.length; i++) {   // Pedir los 8 valores por consola
            System.out.print("Ingrese el número para la posición " + i + ": ");
            numeros[i] = sc.nextInt();
        }

        // Mostrar índice y valor de cada posición
        System.out.println("\n--- Contenido del array ---");
        for (int i = 0; i < numeros.length; i++) {
            System.out.println("Posición [" + i + "] = " + numeros[i]);
        }

        sc.close();
    }
}