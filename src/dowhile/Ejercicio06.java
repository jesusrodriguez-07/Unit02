package dowhile;

import java.util.Scanner;

public class Ejercicio06 {

	public static void main(String[] args) {

		// Creamos el scanner
		Scanner sc = new Scanner(System.in);

		// Declaramos las variables para los dos numeros de la operacion
		int num1, num2;

		// Variable para guardar el resultado y otra para la opcion de la calculadora
		double resultado;

		String opcion;

		do {

			System.out.println("\n--- CALCULADORA SWITCH ---");

			System.out.println("A: Sumar los números");

			System.out.println("B: Restar los números");

			System.out.println("C: Multiplicar los números");

			System.out.println("D: Dividir los números");

			System.out.println("E: Salir");

			System.out.print("Selecciona una opción: ");

			opcion = sc.next().toUpperCase();

			// Hacemos que si no sea igual a e pida dos numeros
			if (!opcion.equals("E")) {

				System.out.print("Introduce el primer número: ");

				num1 = sc.nextInt();

				System.out.print("Introduce el segundo número: ");

				num2 = sc.nextInt();

			} else {

				// Valores para evitar error de variables no inicializadas

				num1 = 0;

				num2 = 1;

			}

			switch (opcion) {

			case "A":

				// Suma
				resultado = num1 + num2;

				System.out.println("Resultado: " + resultado);

				break;

			case "B":

				// Resta
				resultado = num1 - num2;

				System.out.println("Resultado: " + resultado);

				break;

			case "C":

				// Multiplicación
				resultado = num1 * num2;

				System.out.println("Resultado: " + resultado);

				break;

			case "D":

				// Division pero que si num2 es igual a 0 ponemos que no se puede dividir entre
				// 0
				if (num2 == 0) {

					System.out.println("Error: no se puede dividir entre 0");

				} else {

					resultado = (double) num1 / num2;

					System.out.println("Resultado: " + resultado);

				}

				break;

			case "E":

				System.out.println("Saliendo de la calculadora...");

				break;

			default:

				System.out.println("Opción no válida");

				break;

			}

			// Mientras no sea igual a e pues volveremos al principio de la calculadora
		} while (!opcion.equals("E"));

		sc.close();

	}

}