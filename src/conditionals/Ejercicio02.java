package conditionals;

import java.util.Scanner;

public class Ejercicio02 {

	public static void main(String[] args) {
		// Declaramos la variable para el número introducido por teclado
		int num;
		// Declaramos una variable para guardar el valor absoluto final que mostraremos
		// por pantalla
		int valorA;
		// Abrimos el scanner
		Scanner sc = new Scanner(System.in);
		// Pedimos al usuario que introduzca por pantalla el número del que quiere saber
		// el valor absoluto
		System.out.println("Introduce el número del que quieres saber el valor absoluto");
		num = sc.nextInt();

		// Mediante un operador ternario Hacemos que si el número es mayor que 0 lo
		// imprimimos normalmente y si en caso contrario el número es negativo le
		// cambiamos el simbolo para que sea su valor absoluto
		valorA = (num > 0) ? num : -num;
		// Lo imprimimos por pantalla el valor absoluto final
		System.out.println("El valor absoluto de " + num + " es " + valorA);

		// Cerramos el scanner
		sc.close();

	}

}
