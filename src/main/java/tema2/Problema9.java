package tema2;

import java.util.Scanner;

public class Problema9 {

	public static void main(String[] args){

		Scanner scanner = new Scanner(System.in);
		System.out.println("Escriu un primer valor: ");

		float num1 = scanner.nextFloat();

		System.out.println("Escriu el segon valor: ");
		float num2 = scanner.nextFloat();

		System.out.println("Escriu el tercer valor: ");
		float num3 = scanner.nextFloat();

		float resultat = (num1 + num2 + num3) / 3;

		System.out.println("El resultat es: " + resultat);
	}
}
