package dowhile;

import java.util.Scanner;

public class Ejercicio03 {

	public static void main(String[] args) {
		// Variable donde almacenar la suma total
		int suma = 0;
		// Contador que se le va a ir sumando a suma
		int contador = 1;
		// Numero introducido por el usuario
		int numero;

		// Creamos el scanner
		Scanner sc = new Scanner(System.in);

		// Pedimos que introduzca un numero al usuario
		System.out.println("Introduzca un numero");
		numero = sc.nextInt();

		// Hacemos que mientras contador sea menor a el número introducido a contador se
		// le sume uno
		// y se vaya sumando a suma
		do {
			suma += contador;
			contador++;
		} while (contador <= numero); // Importante poner el punto y coma final

		// Mostramos por pantalla la suma total
		System.out.println(suma);

		// Cerramos el scanner
		sc.close();

	}

}
