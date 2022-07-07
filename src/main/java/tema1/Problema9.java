package tema1;

import java.util.Scanner;

public class Problema9 {

	public static void main(String[] args){

		Scanner scanner = new Scanner(System.in);
		System.out.println("Escriu la base del quadrat: ");

		int base = scanner.nextInt();

		int perimetre = 4 * base;
		int area = base * base;

		System.out.println("El perimetre es: " + perimetre);
		System.out.println("L'area es: " + area);

	}
}
