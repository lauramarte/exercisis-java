package tema2;

import java.util.Scanner;

public class Problema15 {

	public static void main(String[] args){

		Scanner scanner = new Scanner(System.in);
		System.out.println("Escriu un caracter: ");

		char c = scanner.next().charAt(0);

		if(Character.isLowerCase(c)){
			System.out.println(Character.toUpperCase(c));
		} else if(Character.isUpperCase(c)){
			System.out.println(Character.toLowerCase(c));
		} else if(Character.isDigit(c)){
			int ascii = (int) c;
			System.out.println(ascii);
		} else if(Character.isWhitespace(c)){
			System.out.println("Simbol delimitador.");
		} else {
			System.out.println(c);
		}
	}
}
