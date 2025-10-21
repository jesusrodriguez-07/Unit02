package ifelse;

import java.util.Scanner;

public class Ejercicio04 {

	public static void main(String[] args) {
		int num;

		Scanner sc = new Scanner(System.in);

		System.out.println("Introduce un número entre 0 y 99999");
		num = sc.nextInt();

		if (num < 0 || num > 99999) {
			System.out.println("El número introducido no está en el rango permitido (0 - 99999).");
		} else {
			if (num < 10) {
				System.out.println("El número tiene 1 cifra.");
			} else if (num < 100) {
				System.out.println("El número tiene 2 cifras.");
			} else if (num < 1000) {
				System.out.println("El número tiene 3 cifras.");
			} else if (num < 10000) {
				System.out.println("El número tiene 4 cifras.");
			} else {
				System.out.println("El número tiene 5 cifras.");
			}
		}

		sc.close();

	}

}