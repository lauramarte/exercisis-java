package tema3;

import java.util.Scanner;

public class Problema3 {

	public static void main(String[] args){

		Scanner scanner = new Scanner(System.in);
		System.out.println("Escriu el primer valor: ");

		int num1 = scanner.nextInt();

		System.out.println("Escriu el segon valor: ");
		int num2 = scanner.nextInt();

		if(num1 >= 0 && num2 >= 0){

			int resultat = 0;

			for(int i = 0; i < num2; i++){
				resultat = num1 + resultat;
			}

			System.out.println("El resultat es: " + resultat);

		} else {
			System.out.println("Escriu nomes numeros positius.");
		}
	}
}
