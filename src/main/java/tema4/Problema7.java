package tema4;

import java.util.Scanner;

public class Problema7 {

	public static void main(String[] args){

		Scanner scanner = new Scanner(System.in);
		System.out.println("Escriu una sequencia acabada en 0: ");

		int seq = scanner.nextInt();
		int parell = 0;

		while(seq != 0){
			if(seq % 2 == 0){
				parell = parell + 1;
			}
			seq = scanner.nextInt();
		}

		if(parell > 0){
			System.out.println("Hi ha algun valor parell.");
		} else {
			System.out.println("No hi ha cap nombre parell.");
		}
	}
}
