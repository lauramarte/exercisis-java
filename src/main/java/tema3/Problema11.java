package tema3;

import java.util.Scanner;

public class Problema11 {

	public static void main(String[] args){

		Scanner scanner = new Scanner(System.in);
		System.out.println("Write a text: ");

		String text = scanner.next();

		char firstCharacter = text.charAt(0);
		int count = 0;

		for(int i = 0; i < text.length(); i++){

			if(firstCharacter == text.charAt(i)){
				count = count + 1;
			}
		}

		System.out.println("There are " + count + " characters.");
	}
}
