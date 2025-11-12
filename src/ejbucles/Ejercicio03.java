package ejbucles;



// Se importa la clase Scanner para leer datos del teclado

import java.util.Scanner;



public class Ejercicio03 {



	public static void main(String[] args) {

		// Variable para guardar el número introducido

		int num;

		// Contador de cuántos números se introducen

		int conteo = 1;

		// Variable para guardar la media

		double media = 0;

		

		// Se crea el objeto Scanner para leer por teclado

		Scanner sc = new Scanner(System.in);

		

		// Se pide el primer número

		System.out.println("Introduce el primer número: ");

		num = sc.nextInt();

		

		// Se inicializa la suma con el primer número introducido

		int suma = num;

		

		// Mientras el número sea positivo, se siguen introduciendo

		while (num >= 0) {

			// Se pide otro número

			System.out.println("Introduce números");

			num = sc.nextInt();

			

			// Se acumula la suma de todos los números

			suma += num;

			

			// Se aumenta el contador

			conteo++;

			

			// Se calcula la media (suma dividida entre cantidad)

			// Se usa cast a double para evitar pérdida de decimales

			media = (double) suma / conteo;

		}

		

		// Se muestra el resultado final

		System.out.println("Esta es la media de los números introducidos: " + media);

		

		// Se cierra el Scanner

		sc.close();

	}

}