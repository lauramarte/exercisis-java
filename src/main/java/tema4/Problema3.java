package tema4;

import java.util.Scanner;

public class Problema3 {

	public static void main(String[] args){

		Scanner scanner = new Scanner(System.in);
		System.out.println("Escriu un text: ");

		String text = scanner.next();
		int contador = 0;

		for(int i = 0; i < text.length(); i++){
			if(Character.isDigit(text.charAt(i))){
				contador = contador + 1;
			}
		}

		if(contador >= 1){
			System.out.println("El text conte digits.");
		} else {
			System.out.println("El text no conte digits.");
		}
	}
}
