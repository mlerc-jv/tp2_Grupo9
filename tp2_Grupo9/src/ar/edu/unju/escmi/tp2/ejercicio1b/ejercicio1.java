package ar.edu.unju.escmi.tp2.ejercicio1;

import java.time.LocalDate;

public class Ejercicio1 {

    public static void main(String[] args) {
        
        int dni = 38452167;
        char letraEjemplar = 'A';
        int edadFamiliar = 65;
        String nombreProcer = "Manuel Belgrano";
        int numeroBingo = 47;
        double precioCelular = 850000.50;
        double estatura = 1.72;
        double pesoMascota = 8.5;
        LocalDate inicioCuatrimestre = LocalDate.of(2026, 8, 3);
        LocalDate finCuatrimestre = LocalDate.of(2026, 12, 18);

        System.out.println("DNI: " + dni);
        System.out.println("Letra de ejemplar del DNI: " + letraEjemplar);
        System.out.println("Edad del familiar: " + edadFamiliar + " años");
        System.out.println("Prócer: " + nombreProcer);
        System.out.println("Número de bingo: " + numeroBingo);
        System.out.println("Precio del celular: $" + precioCelular);
        System.out.println("Estatura: " + estatura + " m");
        System.out.println("Peso de la mascota: " + pesoMascota + " kg");
        System.out.println("Inicio 2do cuatrimestre: " + inicioCuatrimestre);
        System.out.println("Fin 2do cuatrimestre: " + finCuatrimestre);
    }
}S