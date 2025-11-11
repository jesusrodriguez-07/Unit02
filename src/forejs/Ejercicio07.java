package forejs;

import java.util.Scanner;

public class Ejercicio07 {

	public static void main(String[] args) {

		// Declaramos la variable para que metamos el número y booleano de si es primo o
		// no
		int num;
		boolean primo = true;

		// Creamos el scanner
		Scanner sc = new Scanner(System.in);

		// Preguntamos por el número para saber si es primo y controlamos que sea
		// positivo y mayor que 0
		do {
			System.out.println("Introduce el numero del que quieres saber si es primo");
			num = sc.nextInt();
			if (num <= 0) {
				System.out.println("Error tienes que introducir un número mayor que 0");
			}
		} while (num <= 0);
		// Hacemos un for para que vea con todos los números entre 2 y el mismo num si
		// el resto es 0
		for (int contador = 2; contador < num; contador++) {
			if (num % contador == 0) {
				primo = false;
			}
		}

		// Si en alguno el resto es 0 se guarda false en primo con lo que se metera en
		// el else y imprimira que no es primo
		if (primo) {
			System.out.println("El numero es primo");
		} else {
			System.out.println("El número no es primo");
		}

		sc.close();

	}

}
