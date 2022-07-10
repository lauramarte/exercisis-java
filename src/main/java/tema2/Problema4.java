package tema2;

import java.util.Scanner;

public class Problema4 {

	public static void main(String[] args){

		Scanner scanner = new Scanner(System.in);
		System.out.println("Escriu un digit en decimal: ");

		char digit = scanner.next().charAt(0);

		int ascii = (int) digit;

		System.out.println("Valor introduit: " + digit);
		System.out.println("Valor en CODI ASCII: " + ascii);
	}
}
