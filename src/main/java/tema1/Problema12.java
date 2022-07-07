package tema1;

import java.util.Scanner;

public class Problema12 {

	public static void main(String[] args){

		Scanner scanner = new Scanner(System.in);
		System.out.println("Escriu el radi del cercle: ");

		double radi = scanner.nextInt();

		double perimetre = 2 * Math.PI * radi;
		double area = Math.PI * (radi * radi);

		System.out.println("El perimetre es: " + perimetre);
		System.out.println("L'area es: " + area);

	}
}
