package ejbucles;



// Se importa la clase Scanner para leer datos del teclado

import java.util.Scanner;



public class Ejercicio04 {



	public static void main(String[] args) {

		// Variable para guardar el número introducido

		int num;

		// Contador general de números introducidos

		int contador = 0;

		// Contador de números iguales a 0

		int contCero = 0;

		// Suma de los números positivos

		int sumaPosit = 0;

		// Media de los números negativos (se calculará al final)

		int mediaNeg = 0;

		// Suma de los números negativos

		int sumaNeg = 0;

		// Contador de números negativos

		int contNeg = 0;

		

		// Se crea el objeto Scanner para leer por teclado

		Scanner sc = new Scanner(System.in);

		

		// Se pide el primer número

		System.out.println("Introduce el primer número: ");

		num = sc.nextInt();

		

		// Bucle que se repite mientras el contador sea menor o igual a 10

		while (contador < 10) {

			// Se incrementa el contador en 1

			contador++;

			

			// Se pide otro número al usuario

			System.out.println("Introduce un número");

			num = sc.nextInt();

			

			// Si el número es positivo

			if (num > 0) {

				// Se suma al total de positivos

				sumaPosit += num;

			} 

			// Si el número es negativo

			else if (num < 0) {

				// Se suma al total de negativos

				sumaNeg += num;

				// Se cuenta un negativo más

				contNeg++;

			} 

			// Si el número es 0

			else {

				// Se cuenta un cero más

				contCero++;

			}

		}

		

		// Se calcula la media de los números negativos

		// (solo si se introdujo al menos un número negativo)

		if (contNeg > 0) {

			mediaNeg = sumaNeg / contNeg;

		}

		

		// Se muestran los resultados finales

		System.out.println("Esta es la suma de los números positivos: " + sumaPosit);

		System.out.println("Esta es la media de los números negativos: " + mediaNeg);

		System.out.println("Este es el número total de 0: " + contCero);

		

		// Se cierra el objeto Scanner

		sc.close();

	}

}