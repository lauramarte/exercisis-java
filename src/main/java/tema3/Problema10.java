package tema3;

import java.util.Scanner;

public class Problema10 {

	public static void main(String[] args){

		Scanner scanner = new Scanner(System.in);
		System.out.println("Write a text: ");

		String text = scanner.next();

		int whiteSpace = 0;
		int letters = 0;
		int digits = 0;

		for(int i = 0; i < text.length(); i++){

			if(Character.isWhitespace(text.charAt(i))){
				whiteSpace = whiteSpace + 1;
			} else if (Character.isLetter(text.charAt(i))){
				letters = letters + 1;
			} else if(Character.isDigit(text.charAt(i))){
				digits = digits + 1;
			}

		}

		System.out.println("Digits: " + digits);
		System.out.println("Letters: " + letters);
		System.out.println("WhiteSpaces: " + whiteSpace);
	}
}
