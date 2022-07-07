package tema1;

import java.util.Scanner;

public class Problema6 {

	public static void main(String[] args){

		Scanner scanner = new Scanner(System.in);
		System.out.println("Escriu un numero: ");

		int num1 = scanner.nextInt();

		System.out.println("Escriu un segon numero:");
		int num2 = scanner.nextInt();

		int suma = num1 + num2;
		int resta = num1 - num2;
		int divisio = num1 / num2;
		int producte = num1 * num2;
		int reste = num1 % num2;

		System.out.println("Suma: " + suma);
		System.out.println("Resta: " + resta);
		System.out.println("Divisio: " + divisio);
		System.out.println("Producte: " + producte);
		System.out.println("Reste: " + reste);

	}
}
