package forejs;

import java.util.Scanner;

public class Ejercicio02 {

	public static void main(String[] args) {

		int contMult = 0;
		int num;
		int contador;

		Scanner sc = new Scanner(System.in);

		System.out.println("Introduce el número del que quieres saber sus multiplos de 3");
		num = sc.nextInt();

		for (contador = 1; contador <= num; contador++) {
			if (contador % 3 == 0) {
				contMult++;
			}
		}
		System.out.println("Hay " + contMult + " múltiplos de 3 en el número " + num);

		sc.close();

	}

}
