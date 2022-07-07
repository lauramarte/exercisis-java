package tema1;

import java.util.Scanner;

public class Problema8 {

	public static void main(String[] args){

		Scanner scanner = new Scanner(System.in);
		System.out.println("Escriu un caracter: ");

		char c = scanner.next().charAt(0);

		int ascii = (int) c;

		System.out.println("Caracter introduit: " + c + " CODI ASCII: " + ascii);

	}
}
