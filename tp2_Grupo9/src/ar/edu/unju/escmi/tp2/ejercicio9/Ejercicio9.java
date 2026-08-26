package ar.edu.unju.escmi.tp2.ejercicio9;
import java.util.Scanner;
public class Ejercicio9 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
     Scanner sc = new Scanner (System.in);
     int year;
    
     System.out.println("Ingrese un año: ");
     year = sc.nextInt();
     if (year % 4 == 0) {
    	 if (year % 100 != 0) {
    		 System.out.println(year + " Si es bisiesto");
    	 }else {
    		 if (year % 400 == 0){
    	    	    System.out.println (year + " Si es bisiesto");
    	         }else {
    	    	    System.out.println(year + " No es bisiesto");
    	         }
    	 }
     }else {
    	 System.out.println(year + " No es bisiesto");
     }
     sc.close();
	}

}
