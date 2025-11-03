package dowhile;

import java.util.Scanner;

public class Ejercicio04 {

	public static void main(String[] args) {
		int mult = 0;
		int contador = 1;
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Introduce el número del que quieras saber su tabla de multiplicar");
		mult = sc.nextInt();

		//Iniciamos la variable debajo del scanner para que tome el valor introducido por el usuario
		int result = mult;

		do {
			System.out.println(mult + "x" + contador + "=" + result);
			contador++;
			result = mult * contador;
		} while (contador<=10);
		
		sc.close();

	}

}
