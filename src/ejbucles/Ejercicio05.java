package ejbucles;



import java.util.Scanner;



public class Ejercicio05 {

    public static void main(String[] args) {

        // Se crea el objeto Scanner para leer datos del teclado

        Scanner sc = new Scanner(System.in);



        // Variable para guardar la edad introducida

        int edad;              

        // Suma total de las edades

        int suma = 0;          

        // Número total de alumnos

        int contador = 0;      

        // Contador de mayores de edad (>=18)

        int mayoresEdad = 0;   



        // Se pide la primera edad

        System.out.print("Introduce una edad (negativa para terminar): ");

        edad = sc.nextInt();   



        // Mientras la edad sea positiva, se siguen introduciendo datos

        while (edad >= 0) {

            // Se suma la edad al total

            suma += edad;          

            // Se cuenta un alumno más

            contador++;            



            // Si el alumno es mayor de edad

            if (edad >= 18) {      

                // Se suma al contador de mayores

                mayoresEdad++;     

            }



            // Se pide la siguiente edad

            System.out.print("Introduce una edad (negativa para terminar): ");

            edad = sc.nextInt();   

        }



        // Si se introdujo al menos una edad válida

        if (contador > 0) {

            // Se calcula la media de las edades

            double media = (double) suma / contador;  

            // Se muestran los resultados

            System.out.println("\n--- Resultados ---");

            System.out.println("Suma de edades: " + suma);

            System.out.println("Número de alumnos: " + contador);

            System.out.println("Media de edades: " + media);

            System.out.println("Mayores de edad: " + mayoresEdad);

        } 

        // Si no se introdujeron edades válidas

        else {

            System.out.println("No se introdujeron edades válidas.");

        }



        // Se cierra el Scanner

        sc.close(); 

    }

}