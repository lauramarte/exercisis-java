package tema1;

import java.util.Scanner;

public class Problema13 {

	public static void main(String[] args){

		Scanner scanner = new Scanner(System.in);
		System.out.println("Escriu el perimetre del cercle: ");

		double perimetre = scanner.nextInt();

		double area = Math.PI * Math.pow((perimetre / (2 * Math.PI) ), 2);

		System.out.println("L'area es: " + area);
	}
}
