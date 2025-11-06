package dowhile;

import java.util.Scanner;

public class Ejercicio05 {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);

		String jugador1, jugador2;

		String seguir;

		do {

			// Pedir al jugador 1

			do {

				System.out.print("Jugador 1, elige (PIEDRA, PAPEL o TIJERA): ");

				jugador1 = sc.nextLine().toUpperCase();

			} while (!jugador1.equals("PIEDRA") && !jugador1.equals("PAPEL") && !jugador1.equals("TIJERA"));

			// Pedir al jugador 2

			do {

				System.out.print("Jugador 2, elige (PIEDRA, PAPEL o TIJERA): ");

				jugador2 = sc.nextLine().toUpperCase();

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

		} while (seguir.equals("S"));

		System.out.println("¡Gracias por jugar!");

		sc.close();

	}

}