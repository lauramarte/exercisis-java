package tema4;

import java.util.Scanner;

public class Problema8 {

	public static void main(String[] args){

		Scanner scanner = new Scanner(System.in);
		System.out.println("Escriu una sequencia acabada en 0: ");

		int seq = scanner.nextInt();
		int multiple = 0;

		while(seq != 0){

			if(seq % 3 == 0){
				multiple = multiple + 1;
			}
			seq = scanner.nextInt();
		}

		if(multiple > 0){
			System.out.println("Si que hi ha algun valor multiple de 3");
		} else {
			System.out.println("No hi ha cap valor multiple de 3");
		}
	}
}
