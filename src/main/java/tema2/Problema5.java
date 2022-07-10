package tema2;

import java.util.Scanner;

public class Problema5 {

	public static void main(String[] args){

		Scanner scanner = new Scanner(System.in);
		System.out.println("Escriu un valor hexadecimal: ");

		String digit = scanner.next();

		int hex = Integer.parseInt(digit, 16);

		char ascii = (char) hex;

		System.out.println("El valor introduit es: " + digit);
		System.out.println("El valor en decimal es: " + hex);
		System.out.println("El valor en codi ascii es: " + ascii);


	}
}
