package ifelse;

import java.util.Scanner;

public class Ejercicio05 {

	public static void main(String[] args) {
		
		String jugador1;
		String jugador2;
		
		Scanner sc = new Scanner(System.in);
		
		System.out.print("Jugador 1, elige (PIEDRA, PAPEL o TIJERA): ");
        jugador1 = sc.nextLine();

        System.out.print("Jugador 2, elige (PIEDRA, PAPEL o TIJERA): ");
        jugador2 = sc.nextLine();

        // No hace falta ver que haya escrito piedra papel o tijera (no estamos con raquel)
        if (!jugador1.equals ("PIEDRA") && !jugador1.equals("PAPEL") && !jugador1.equals("TIJERA") ||
            !jugador2.equals ("PIEDRA") && !jugador2.equals("PAPEL") && !jugador2.equals("TIJERA")) {
            System.out.println("Uno de los jugadores ha introducido una opción no válida.");
        } else {
            if (jugador1.equals(jugador2)) {
                System.out.println("¡Empate!");
            } else if (jugador1.equals("PIEDRA") && jugador2.equals("TIJERA") ||
                       jugador1.equals("PAPEL") && jugador2.equals("PIEDRA") ||
                       jugador1.equals("TIJERA") && jugador2.equals("PAPEL")) {
                System.out.println("¡Gana el Jugador 1!");
            } else {
                System.out.println("¡Gana el Jugador 2!");
            }
        }

		sc.close();

	}

}