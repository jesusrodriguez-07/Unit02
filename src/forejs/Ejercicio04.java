package forejs;

public class Ejercicio04 {

	public static void main(String[] args) {
		int suma=0;
		int impar=1;
		
		for (int contador=1; contador <= 10; contador++) {
			System.out.println("Estos son los 10 primeros números impares " + impar);
			suma+=impar;
			impar+=2;
		}
		System.out.println("Esta es la suma de los primeros 10 números impares " + suma);

	}

}
