package ejswitch;

import java.util.Scanner;

public class Ejercicio03 {

	public static void main(String[] args) {
		int num1, num2, suma, resta, mult;
		String calc; // Importante poner String en mayuscula la primera
		double div;

		Scanner sc = new Scanner(System.in);

		System.out.println("Introduce el primer número de la operación");
		num1 = sc.nextInt();
		System.out.println("Introduce el segundo número de la operación");
		num2 = sc.nextInt();

		System.out.println("A: Suma los números");
		System.out.println("B: Resta los números");
		System.out.println("C: Multiplica los números");
		System.out.println("D: Divide los números");
		calc = sc.next();

		switch (calc) {
		case "A":
			suma = (num1 + num2);
			System.out.println(suma);
			break;
		case "B":
			resta = (num1 - num2);
			System.out.println(resta);
			break;
		case "C":
			mult = (num1 * num2);
			System.out.println(mult);
			break;
		case "D":
			if (num1 == 0) {
				System.out.println("Error. No se puede dividir por 0");
				break;
			} else if (num2 == 0) {
				System.out.println("Error. No se puede dividir por 0");
				break;
			} else {
				div = (num1 / num2);
				System.out.println(div);
			}
			break;
		default:
			System.out.println("Error");
		}

		sc.close();

	}

}
