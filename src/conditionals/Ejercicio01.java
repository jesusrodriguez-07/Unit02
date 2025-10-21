package conditionals;

import java.util.Scanner;

public class Ejercicio01 {

	public static void main(String[] args) {
		// Definimos la variable para el número introducido
		int num;
		// Definimos la variable para saber si es capicua o no
		boolean esCapicua;
		// Creamos el scanner
		Scanner sc = new Scanner(System.in);
		// Pedimos al usuario que introduzca el número comprendido en los valores del
		// enunciado
		System.out.println("Introduce un número entre 0 y 9999: ");
		num = sc.nextInt();
		// hacemos que si no esta entre esos valores se acabe la ejecución del programa
		if (num < 0 || num > 9999) {
			System.out.println("Error, el número introducido es inválido"); // Ahora sacamos los valores de cada
																			// posicion del número
		} else {
			// Guardamos en cada variable el valor de el dígito de cada posición
			int unidades = num % 10;
			int decenas = (num / 10) % 10;
			int centenas = (num / 100) % 10;
			int miles = (num / 1000) % 10;

			// Comparamos dependiendo de si el número es menor de 10 y asi sucesivamente
			// comparando
			// los valores necesarios en cada caso
			if (num < 10) {
				esCapicua = true;
			} else if (num < 100) {
				esCapicua = (unidades == decenas);
			} else if (num < 1000) {
				esCapicua = (unidades == centenas);
			} else {
				// En este tenemos que comparar ambos números no solo el primero y el último
				esCapicua = (unidades == miles) && (decenas == centenas);
			}

			// Con un if hacemos que si la variable esCapicua es true pues imprima que si es
			// capicúa
			if (esCapicua) {
				System.out.println("El número " + num + " es capicúa.");
			} else {
				System.out.println("El número " + num + " no es capicúa.");
			}
		}

		sc.close();
	}

}
