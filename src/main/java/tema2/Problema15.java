package tema2;

import java.util.Scanner;

public class Problema15 {

	public static void main(String[] args){

		Scanner scanner = new Scanner(System.in);
		System.out.println("Escriu un caracter: ");

		char c = scanner.next().charAt(0);

		if(c == Character.toLowerCase(c)){
			System.out.println(Character.toUpperCase(c));
		} else if(c == Character.toUpperCase(c)){
			System.out.println(Character.toLowerCase(c));
		} else if(Character.isDigit(c)){

			// FALTA CODI ASCII

			System.out.println(c);
		} else if(Character.isWhitespace(c)){
			System.out.println("Simbol delimitador.");
		} else {
			System.out.println(c);
		}
	}
}
