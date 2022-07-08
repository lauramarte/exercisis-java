package tema2;

import java.util.Scanner;

public class Problema2 {

	public static void main(String[] args){

		Scanner scanner = new Scanner(System.in);
		System.out.println("Escriu un numero de segons: ");

		int segons = scanner.nextInt();

		int sec = segons % 60;
		int minuts = segons / 60;
		minuts = minuts % 60;
		int hores = segons / 3600;

		System.out.println("Son: " + hores + " hores, " + minuts + " minuts i " + sec + " segons.");
	}
}
