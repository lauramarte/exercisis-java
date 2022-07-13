package tema2;

import java.util.Scanner;

public class Problema1 {

	public static void main(String[] args){

		Scanner scanner = new Scanner(System.in);
		System.out.println("Escriu un valor a: ");

		char a = scanner.next().charAt(0);

		System.out.println("Escriu un valor b: ");
		char b = scanner.next().charAt(0);

		char c = a;
		a = b;
		b = c;
		System.out.println("Els valors intercanviats son: " + a + " i " + b);

	}
}
