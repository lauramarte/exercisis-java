package tema4;

import java.util.Scanner;

public class Problema5 {

	public static void main(String[] args){

		Scanner scanner = new Scanner(System.in);
		System.out.println("Escriu un text: ");

		String text = scanner.next();

		int contador = 0;
		for(int i = 0; i < text.length(); i++){
			if(Character.isLowerCase(text.charAt(i))){
				contador = contador + 1;
			}
		}

		if(contador >= 1){
			System.out.println("El text no esta completament amb majuscules");
		} else {
			System.out.println("El text esta tot amb majuscules");
		}

	}
}
