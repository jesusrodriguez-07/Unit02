package dowhile;

import java.util.Scanner;

public class Ejercicio05 {

	public static void main(String[] args) {

		// Creamos el scanner
		Scanner sc = new Scanner(System.in);

		// Declaramos las variables de las jugadas y de si quiere seguir jugando
		String jugador1, jugador2;

		String seguir;

		do {

			// Pedir al jugador 1

			do {

				System.out.print("Jugador 1, elige (PIEDRA, PAPEL o TIJERA): ");

				jugador1 = sc.nextLine().toUpperCase();

				// Mientras no sea igual a piedra papel o tijera se volvera a preguntar
			} while (!jugador1.equals("PIEDRA") && !jugador1.equals("PAPEL") && !jugador1.equals("TIJERA"));

			// Pedir al jugador 2

			do {

				System.out.print("Jugador 2, elige (PIEDRA, PAPEL o TIJERA): ");

				jugador2 = sc.nextLine().toUpperCase();

				// Lo mismo que en el primero
			} while (!jugador2.equals("PIEDRA") && !jugador2.equals("PAPEL") && !jugador2.equals("TIJERA"));

			// Resultado

			if (jugador1.equals(jugador2)) {

				System.out.println("¡Empate!");

			} else if (jugador1.equals("PIEDRA") && jugador2.equals("TIJERA")

					|| jugador1.equals("PAPEL") && jugador2.equals("PIEDRA")

					|| jugador1.equals("TIJERA") && jugador2.equals("PAPEL")) {

				System.out.println("¡Gana el Jugador 1!");

			} else {

				System.out.println("¡Gana el Jugador 2!");

			}

			// Preguntar si se quiere jugar otra vez

			System.out.print("¿Quieres jugar otra partida? (S/N): ");

			seguir = sc.nextLine().toUpperCase();

			// Si es igual a S se vuelve al principio
		} while (seguir.equals("S"));

		System.out.println("¡Gracias por jugar!");

		sc.close();

	}

}