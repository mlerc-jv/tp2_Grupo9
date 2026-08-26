package ar.edu.unju.escmi.tp2.ejercicio16;
import java.util.Scanner;
public class Ejercicio16 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
    Scanner sc = new Scanner (System.in);
    int num;
    do {
    System.out.println("Ingresar un numero: ");
    num = sc.nextInt();
    }while(num<5 || num>10);
    
    String[] nombre = new String [num];
    
    System.out.println("Ingrese " + num + " nombres: ");
    for (int i=0; i<nombre.length; i++) {
    	nombre[i] = sc.next();
    }
    
    System.out.println("Posiciones: ");
    for (int i=0; i<nombre.length; i++) {
    	System.out.println( i + ": " + nombre[i]);
    }
    System.out.println("Comenzando desde el ultimo: ");
    for (int i=nombre.length -1;i>=0; i--) {
    	System.out.println(nombre[i]);
    }
    sc.close();
	}
}
