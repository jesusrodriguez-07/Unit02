package forejs;

import java.util.Scanner;

public class Ejercicio05 {

	public static void main(String[] args) {
		// Declaramos la variable para el numero en el que queremos acabar el contador
		int num;
		// Declaramos la variable para guardar las multiplicaciones del factorial
		int fact = 1;

		// Creamos el scanner
		Scanner sc = new Scanner(System.in);

		// Pedimos el numero del que queremos saber el factorial
		System.out.println("Introduce el número del que quieres saber su factorial: ");
		num = sc.nextInt();

		// Hacemos el bucle for para que empiece en 1 y que acabe en el num introducido
		// por teclado multiplicando en cada fase del contador un numero mas hasta
		// llegar al num asi sabiendo cual es el resultado de multiplicar desde el 1
		// hasta el factorial
		for (int contador = 1; contador <= num; contador++) {
			fact *= contador;
			System.out.print(contador);
			if (contador !=num) {
				System.out.print("*");
			}
		}
		// Mostramos por pantalla el resultado del factorial
		System.out.println(" = " + fact);

		// Cerramos el scanner
		sc.close();

	}

}
