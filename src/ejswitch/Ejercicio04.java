package ejswitch;

import java.util.Scanner;

public class Ejercicio04 {

	public static void main(String[] args) {
		int total;
		String tirada1;
		String tirada2;
		int num1 = 0;
		int num2 = 0;

		Scanner sc = new Scanner(System.in);

		System.out.println("Introduce el valora de el dado en la primera tirada");
		tirada1 = sc.next();

		switch (tirada1) {
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
			System.out.println("Fake");
			break;
		}

		System.out.println("Introduce el valor de el dado en la segunda tirada");
		tirada2 = sc.next();

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
			System.out.println("Fake");
			break;
		}
		
		total = (num1 + num2);

		System.out.println("Este es el total de valores de los dados: " + total);
		sc.close();

	}

}
