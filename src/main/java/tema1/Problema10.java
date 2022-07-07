package tema1;

import java.util.Scanner;

public class Problema10 {

	public static void main(String[] args){

		Scanner scanner = new Scanner(System.in);
		System.out.println("Escriu la base del rectangle: ");

		int base = scanner.nextInt();

		System.out.println("Escriu l'altura del rectangle: ");
		int altura = scanner.nextInt();

		int perimetre = base * 2 + altura * 2;
		int area = base * altura;

		System.out.println("El perimetre es: " + perimetre);
		System.out.println("L'area es: " + area);

	}
}
