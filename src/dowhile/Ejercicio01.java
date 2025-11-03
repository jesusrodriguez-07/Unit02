package dowhile;

import java.util.Scanner;

public class Ejercicio01 {

	public static void main(String[] args) {
		// Iniciamos la variable de num en 1
		int num = 1;

		// Creamos el scanner
		Scanner sc = new Scanner(System.in);

		// Hacemos que primero muestre num que esta iniciado a 1 y le va sumando hasta
		// llegar a 20
		do {
			System.out.println(num);
			num++;
		} while (num <= 20);

		// Cerramos el scanner
		sc.close();

	}

}
