package ejswitch;

import java.util.Scanner;

public class Ejercicio01 {

	public static void main(String[] args) {
		int nota;

		Scanner sc = new Scanner(System.in);

		System.out.println("Introduce tu nota");
		nota = sc.nextInt();

		switch (nota) {
		case 0:
			System.out.println("Insuficiente");
			break;
		case 1:
			System.out.println("Insuficiente");
			break;
		case 2:
			System.out.println("Insuficiente");
			break;
		case 3:
			System.out.println("Insuficiente");
			break;
		case 4:
			System.out.println("Insuficiente");
			break;
		case 5:
			System.out.println("suficiente");
			break;
		case 6:
			System.out.println("bien");
			break;
		case 7:
			System.out.println("notable");
			break;
		case 8:
			System.out.println("notable");
			break;
		case 9:
			System.out.println("sobresaliente");
			break;
		case 10:
			System.out.println("sobresaliente");
			break;
		}

		sc.close();

	}

}
