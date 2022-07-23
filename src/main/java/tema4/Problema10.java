package tema4;

import java.util.Scanner;

public class Problema10 {

	public static void main(String[] args) {

		Scanner scanner = new Scanner(System.in);
		System.out.println("Escriu una sequencia acabada en 0: ");

		int seq = scanner.nextInt();
		int contador = 0;
		int primer = 0;

		while (seq != 0) {
			for(int i = 1; i <= seq; i++){
				if(seq % i == 0){
					contador = contador + i;
				}
			}
			if (seq == contador - 1) {
				primer = primer + 1;
			}
			seq = scanner.nextInt();
		}
		if (primer >= 1) {
			System.out.println("Hi ha algun vlaor primer. ");
		} else {
			System.out.println("No hi ha cap.");
		}
	}
}