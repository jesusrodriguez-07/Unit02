package forejs;

import java.util.Scanner;

public class Ejercicio06 {

	public static void main(String[] args) {
		// Declaramos la variables para las notas y los suspensos
		int notas;
		int suspenso = 0;

		// Creamos el scanner
		Scanner sc = new Scanner(System.in);

		// Hacemos el bucle for en el que se repite 5 veces que introduczas las notas y
		// se comprueba si las notas son menor que 5 y si es menos que 5 sumamos uno a
		// la variable suspensos
		for (int contador = 1; contador <= 5; contador++) {
			System.out.println("Introduce la notas: ");
			notas = sc.nextInt();

			if (notas < 10 && notas > 0) {
				if (notas < 5 ){
					suspenso++;
				}
			} else {
				System.out.println("Nota no valida.");
				contador--;
			}
		}
		// Se muestra el número de suspensos
		System.out.println("hay " + suspenso + " suspensos");

		sc.close();

	}

}
