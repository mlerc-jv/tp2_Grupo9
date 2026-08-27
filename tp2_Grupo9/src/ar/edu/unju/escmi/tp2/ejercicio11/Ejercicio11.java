package ar.edu.unju.escmi.tp2.ejercicio11;

import java.util.Scanner;

public class Ejercicio11 {

    public static void main(String[] args) {
        
        Scanner scanner = new Scanner(System.in);
        
        for (int i = 1; i <= 5; i++) {
            System.out.print("Ingrese el numero " + i + ": ");
            int numero = scanner.nextInt();
            
            if (numero % 2 == 0) {
                System.out.println(numero + " es un numero par.");
            } else {
                System.out.println(numero + " es un numero impar.");
            }
        }
        
        scanner.close();
    }
}