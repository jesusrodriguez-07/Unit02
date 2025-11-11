package forejs;

import java.util.Scanner;

public class Ejercicio08 {

	public static void main(String[] args) {
		// Declaramos las variables del numero a y del numero b
		int numA;
		int numB;

		// Creamos el scanner
		Scanner sc = new Scanner(System.in);

		// pedimos los números a y b
		System.out.println("Introduce el número A: ");
		numA = sc.nextInt();

		System.out.println("Introduce el número B: ");
		numB = sc.nextInt();

		// Hacemos un if para que si son iguales ponga que son iguales
		if (numA == numB) {
			System.out.println("Los números son iguales");
		}

		// Otro if para que si a es mayor que b empiece a contar de forma ascendente
		// desde a
		if (numA > numB) {
			for (int contador = numB; contador <= numA; contador++) {
				System.out.println(contador);
			}
		}

		// Otro if para que si a es menor que b empiece a contar de forma descendente
		// desde b
		if (numA < numB) {
			for (int contador = numB; contador >= numA; contador--) {
				System.out.println(contador);
			}
		}

		// Cerramos el scanner
		sc.close();

	}

}
