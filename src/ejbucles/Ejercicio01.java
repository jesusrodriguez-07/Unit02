package ejbucles;



import java.util.Scanner;



public class Ejercicio01 {



	public static void main(String[] args) {

		int num = 0;

		int suma = 0;

		Scanner sc = new Scanner(System.in);

		
		System.out.println("Introduce el número que quieras sumar");

		num = sc.nextInt();

		

		while (num >=0) {

			System.out.println("Introduce el número que quieras sumar");

			num = sc.nextInt();

			suma += num;	

			System.out.println(suma);
			}

		

		

		

		sc.close();



	}



}