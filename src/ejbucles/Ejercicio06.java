package ejbucles;



import java.util.Scanner;



public class Ejercicio06 {



	

	    public static void main(String[] args) {

	        // Se crea el objeto Scanner para leer datos del teclado

	        Scanner sc = new Scanner(System.in);



	        // Variable para guardar la altura introducida

	        int altura;           

	        // Guarda la altura más alta encontrada (empieza en -1)

	        int maxAltura = -1;   



	        // Se pide la primera altura

	        System.out.print("Introduce la altura del árbol (-1 para terminar): ");

	        altura = sc.nextInt();   



	        // Mientras la altura no sea -1

	        while (altura != -1) {

	            // Si la altura actual es mayor que la máxima guardada

	            if (altura > maxAltura) { 

	                // Se actualiza la máxima

	                maxAltura = altura;   

	            }



	            // Se pide la siguiente altura

	            System.out.print("Introduce la altura del árbol (-1 para terminar): ");

	            altura = sc.nextInt();   

	        }



	        // Si se introdujo al menos una altura válida

	        if (maxAltura != -1) {

	            // Se muestra la altura más alta encontrada

	            System.out.println("\nEl árbol más alto mide " + maxAltura + " cm.");

	        } 

	        // Si no se introdujeron datos válidos

	        else {

	            System.out.println("No se introdujeron alturas válidas.");

	        }



	        // Se cierra el Scanner

	        sc.close(); 

	    }

	}