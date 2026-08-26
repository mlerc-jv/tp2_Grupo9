package ar.edu.unju.escmi.tp2.ejercicio15;
import java.util.Scanner;
public class Ejercicio15 {
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
        int num;

        do {
            System.out.println("Ingresar un numero entre 3 y 10: ");
            num = sc.nextInt();
        } while (num < 3 || num > 10);

        int[] numeros = new int[num];
        int suma = 0;

        System.out.println("Ingrese " + num + " numeros: ");

        for (int i = 0; i < numeros.length; i++) {
            numeros[i] = sc.nextInt();
            suma += numeros[i];
        }

        System.out.println("Posiciones: ");

        for (int i = 0; i < numeros.length; i++) {
            System.out.println(i + ": " + numeros[i]);
        }

        System.out.println("Suma: " + suma);

        sc.close();
	}
}
