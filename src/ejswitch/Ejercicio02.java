package ejswitch;

import java.util.Scanner;

public class Ejercicio02 {

	public static void main(String[] args) {
		int dia;
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Introduce el numero de dia de la semana");
		dia = sc.nextInt();
		
		switch (dia) {
		case 1:
			System.out.println("Lunes");
			break;
		case 2:
			System.out.println("Martes");
			break;
		case 3:
			System.out.println("Miércoles");
			break;
		case 4:
			System.out.println("Jueves");
			break;
		case 5:
			System.out.println("Viernes");
			break;
		case 6:
			System.out.println("Sabado");
			break;
		case 7:
			System.err.println("Domingo");
			break;
		default:
			System.out.println("Error");
			break;
		}
		
		sc.close();

	}

}
