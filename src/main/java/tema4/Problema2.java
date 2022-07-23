package tema4;

import java.util.Scanner;

public class Problema2 {

	public static void main(String[] args){

		Scanner scanner = new Scanner(System.in);
		System.out.println("Escriu un nombre major que 1: ");

		int number = scanner.nextInt();
		int cont = 0;

		if(number >= 1){
			for(int i = 1; i <= number; i++){
				if(number % i == 0){
					cont = cont + i;
				}
			}

			if(number == cont - 1){
				System.out.println("El valor es perfecte.");
			} else {
				System.out.println("El valor no es perfecte.");
			}

		} else {
			System.out.println("El nombre no es major a 1.");
		}
	}
}
