package tema4;

import java.util.Scanner;

public class Problema4 {

	public static void main(String[] args){

		Scanner scanner = new Scanner(System.in);
		System.out.println("Escriu un text: ");

		String text = scanner.next();

		char primer = text.charAt(0);

		int contador = 0;
		for(int i = 0; i < text.length(); i++){
			if(primer == text.charAt(i)){
				contador = contador + 1;
			}
		}

		if(contador > 1){
			System.out.println("El primer caracter es repeteix.");
		} else {
			System.out.println("El caracter no es repeteix.");
		}
	}
}
