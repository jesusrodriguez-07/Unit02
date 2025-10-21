package unit02;

import java.util.Scanner;

public class Ejercicio03 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int num1;
		int num2;
		int suma;
		int resta;
		int mult;
		double div;
		
		System.out.println("Escribe un primer número");
		num1 = sc.nextInt();
		System.out.println("Escribe un segundo número");
		num2 = sc.nextInt();
		
		suma = num1 + num2;
		resta = num1 - num2;
		mult = num1 * num2;
		
		System.out.println(suma);
		System.out.println(resta);
		System.out.println(mult);
		
		if (num2 == 0) {
			System.out.println("Error no se puede dividir por 0");
		} else {
			div = num1 / num2;
			System.out.println(div);
		}
		

		
		sc.close();

	}

}
