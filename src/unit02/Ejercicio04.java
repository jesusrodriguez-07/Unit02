package unit02;

import java.util.Scanner;

public class Ejercicio04 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		int num1;
		int num2;
		
		System.out.println("Escribe el primer número");
		num1 = sc.nextInt();
		System.out.println("Escribe el segundo número");
		num2 = sc.nextInt();
		
		if (num1>num2) {
			System.out.println(num1);
		} else {
			System.out.println(num2);
		}
		
		sc.close();

	}

}
