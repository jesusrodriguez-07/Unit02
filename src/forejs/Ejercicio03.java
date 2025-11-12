package forejs;



import java.util.Scanner;



public class Ejercicio03 {



	public static void main(String[] args) {



		// Declaramos las variables para el numero y para la media de estos

		int num = 0;

		int media = 0;



		// Creamos el scanner

		Scanner sc = new Scanner(System.in);



		// Ponemos el mensaje de introducir 10 números

		System.out.println("Introduce 10 números por teclado");



		// Hacemos un bucle for para que se haga 10 veces pedir un número al usuario

		for (int contador = 1; contador <= 10; contador++) {

			System.out.println("Introduce los 10 numeros de 1 en 1");

			num = sc.nextInt();

			media += num;

		}

		// Mostramos el número total de los números que hemos introducido

		System.out.println("Este es el total de números que has introducido " + media);

		// Calculamos la media de esos números dividiendolo entre 10 que son los números

		// aqui

		media = media / 10;

		System.out.println("Eesta es la media: " + media);

		// Cerramos el scanner

		sc.close();



	}



}