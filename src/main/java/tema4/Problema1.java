package tema4;

import java.util.Scanner;

public class Problema1 {

	public static void main(String[] args){

		Scanner scanner = new Scanner(System.in);
		System.out.println("Escriu un valor enter: ");

		int number = scanner.nextInt();

		double sqrt = Math.sqrt(number);
		double quadrat = sqrt * sqrt;

		if(number >= 0){
			if(quadrat == number){
				System.out.println("El quadrat es perfecte.");
			} else {
				System.out.println("El quadrat no es perfecte.");
			}
		} else {
			System.out.println("Introdueix nomes valors positius");
		}


	}
}
