package tema3;

import java.util.Scanner;

public class Problema9 {

	public static void main(String[] args){

		Scanner scanner = new Scanner(System.in);
		System.out.println("Escriu un text acabat en punt: ");

		String text = scanner.next();

		int contador = 0;

		for(int i = 0; i < text.length(); i++){

			if(text.charAt(i) == '.'){
				contador = contador + 1;
			}
		}

		System.out.println("Hi ha " + contador + " caracters. ");
	}
}
