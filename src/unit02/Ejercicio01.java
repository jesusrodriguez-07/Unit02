package unit02;

import java.util.Scanner;

public class Ejercicio01 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int edad;
		
		System.out.println("Escribe tu edad: ");
		edad = sc.nextInt();
		if (edad >= 18) {
			System.out.println("Eres mayor de edad chavalito eres muy mayor");
		} 		
		
		sc.close();

	}

}
