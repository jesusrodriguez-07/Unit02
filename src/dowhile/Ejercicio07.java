package dowhile;

import java.util.Scanner;

public class Ejercicio07 {

	public static void main(String[] args) {

		// Creamos el scanner
		Scanner sc = new Scanner(System.in);

		// Declaramos las variables de la tirada 1 y la tirada 2
		String tirada1, tirada2;

		int num1 = 0, num2 = 0;

		// Variable booleana para saber si es valido
		boolean valido;

		// PRIMERA TIRADA

		do {

			System.out
					.print("Introduce el valor del dado en la primera tirada (UNO, DOS, TRES, CUATRO, CINCO, SEIS): ");

			tirada1 = sc.next().toUpperCase();

			valido = true;

			switch (tirada1) {

			// Pedimos la primera tirada que ponga el numero del valor del uno al seis
			case "UNO":

				num1 = 1;

				break;

			case "DOS":

				num1 = 2;

				break;

			case "TRES":

				num1 = 3;

				break;

			case "CUATRO":

				num1 = 4;

				break;

			case "CINCO":

				num1 = 5;

				break;

			case "SEIS":

				num1 = 6;

				break;

			default:

				// Si el valor no esta entre los posibles se escribe eso y guardamos false en la
				// variable valido
				System.out.println("Valor no válido, vuelve a intentarlo.");

				valido = false;

				break;

			}

			// Mientras no sea true es decir no valido se seguira pidiendo el valor de la
			// tirada
		} while (!valido);

		// SEGUNDA TIRADA

		do {

			System.out
					.print("Introduce el valor del dado en la segunda tirada (UNO, DOS, TRES, CUATRO, CINCO, SEIS): ");

			tirada2 = sc.next().toUpperCase();

			valido = true;

			switch (tirada2) {

			case "UNO":

				num2 = 1;

				break;

			case "DOS":

				num2 = 2;

				break;

			case "TRES":

				num2 = 3;

				break;

			case "CUATRO":

				num2 = 4;

				break;

			case "CINCO":

				num2 = 5;

				break;

			case "SEIS":

				num2 = 6;

				break;

			default:

				// Lo mismo que en la tirada anterior
				System.out.println("Valor no válido, vuelve a intentarlo.");

				valido = false;

				break;

			}

		} while (!valido);

		// Una vez todo correcto se suman las variables y se muestra el valor total
		int total = num1 + num2;

		System.out.println("Este es el total de valores de los dados: " + total);

		sc.close();

	}

}