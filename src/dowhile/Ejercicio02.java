package dowhile;

import java.util.Scanner;

public class Ejercicio02 {

	public static void main(String[] args) {
		// Iniciamos la variable en el primer número par
		int num = 2;

		// Creamos el scanner
		Scanner sc = new Scanner(System.in);

		// Mostramos por pantalla la variable num iniciada en el primer numero par y le
		// sumamos de dos en dos
		// Hasta que llegue a 200
		do {
			System.out.println(num);
			num = num + 2;
		} while (num <= 200);

		// Cerramos el scanner
		sc.close();

	}

}
