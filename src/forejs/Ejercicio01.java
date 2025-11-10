package forejs;



import java.util.Scanner;



public class Ejercicio01 {



	public static void main(String[] args) {

		// Creamos el scanner

		Scanner sc = new Scanner(System.in);

		int num;

		int i;

		

		System.out.println("Introduce un número y contaremos hasta llegar hasta el:");

		num = sc.nextInt();

		

		for (i = 1;i <= num;i++) {

			System.out.println(i);

		}

		

		System.out.println("Felicidades has aprendido a contar");

		sc.close();



	}



}