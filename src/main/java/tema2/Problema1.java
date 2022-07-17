package tema2;

import java.util.Scanner;

public class Problema1 {

	public static void main(String[] args){

		Scanner scanner = new Scanner(System.in);
		System.out.println("Escriu un primer: ");

		int num1 = scanner.nextInt();

		System.out.println("Escriu el segon valor: ");

		int num2 = scanner.nextInt();

		int c = num1;
		num1 = num2;
		num2 = c;

		System.out.println("Els valors intercanviats son: " + num1 + " i " + num2);
	}
}
