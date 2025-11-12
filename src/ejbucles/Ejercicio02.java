package ejbucles;



import java.util.Scanner;



public class Ejercicio02 {



	public static void main(String[] args) {

		// Declaramos las variables para conteo de numeros y el numero en si

		int conteo = 1;

		int num;



		// Abrimos el scanner

		Scanner sc = new Scanner(System.in);



		// Pedimos el primero de los números para entrar en el bucle while

		System.out.println("Introduce el primero de los números: ");

		num = sc.nextInt();



		// Bucle while para que mientras el número sea mayor que 0 se añada uno al valor

		// de conteo para saber cuantos números se han introducido

		while (num > 0) {

			System.out.println("Introduce números positivos: ");

			num = sc.nextInt();

			conteo++;

		}

		// Se muestra el valor de conteo

		System.out.println("Este es el total de números que has introducido: " + conteo);



		// Se cierra el scanner

		sc.close();



	}



}