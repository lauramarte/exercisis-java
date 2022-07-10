package tema2;

import java.util.Scanner;

public class Problema16 {

	public static void main(String[] args){

		Scanner scanner = new Scanner(System.in);
		System.out.println("Escriu un caracter: ");

		char c = scanner.next().charAt(0);

		if(Character.isLetter(c)){
			if(c >= 'a' && c <= 'z'){
				int position = 'a';
				int pos = c - position + 1;

				System.out.println("La posicio es: " + pos);
			} else if (c >= 'A' && c <= 'Z') {
				int position1 = 'A';
				int pos1 = c - position1 + 1;

				System.out.println("La posicio es: " + pos1);
			}

		} else {
			System.out.println(c);
		}
	}
}
