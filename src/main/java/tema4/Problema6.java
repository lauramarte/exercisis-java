package tema4;

import java.util.Scanner;

public class Problema6 {

	public static void main(String[] args){

		Scanner scanner = new Scanner(System.in);
		System.out.println("Escriu una sequencia de digits acabada en 0: ");

		int seq = scanner.nextInt();

		int negatius = 0;

		while(seq != 0){
			if(seq < 0){
				negatius = negatius + 1;
			}
			seq = scanner.nextInt();
		}

		if(negatius > 0){
			System.out.println("Te valors negatius.");
		} else {
			System.out.println("Tots son positius.");
		}

	}
}
