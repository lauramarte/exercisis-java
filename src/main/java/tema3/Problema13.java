package tema3;

import java.util.Scanner;

public class Problema13 {

	public static void main(String[] args){

		Scanner scanner = new Scanner(System.in);
		System.out.println("Write a text: ");

		String text = scanner.next();

		char ch;

		for(int i = 0; i < text.length(); i++){
			if(Character.isLowerCase(text.charAt(i))){
				ch = Character.toUpperCase(text.charAt(i));
				System.out.print(ch);
			} else if(Character.isUpperCase(text.charAt(i))){
				ch = Character.toLowerCase(text.charAt(i));
				System.out.print(ch);
			}
		}
	}
}
