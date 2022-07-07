package tema1;

import java.util.Scanner;

public class Problema11 {

	public static void main(String[] args){

		Scanner scanner = new Scanner(System.in);
		System.out.println("Escriu la base del triangle: ");

		float base = scanner.nextInt();

		System.out.println("Escriu l'altura del triangle: ");
		float altura = scanner.nextInt();

		float area = (base * altura) / 2;

		System.out.println("L'area del triangle es : " + area);
	}
}
