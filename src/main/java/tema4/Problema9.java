package tema4;

import java.util.Scanner;

public class Problema9 {

	public static void main(String[] args){

		Scanner scanner = new Scanner(System.in);
		System.out.println("Escriu una sequencia acabada en 0: ");

		int seq = scanner.nextInt();
		int contador = 0;

		while(seq != 0){
			double sqrt = Math.sqrt(seq);
			double quadrat = sqrt * sqrt;

			if(quadrat == seq){
				contador = contador + 1;
			}
			seq = scanner.nextInt();
		}

		if(contador > 0){
			System.out.println("Hi ha algun quadrat perfecte.");
		} else {
			System.out.println("No hi ha cap quadrat perfecte.");
		}
	}
}
