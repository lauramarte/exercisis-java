package tema1;

import java.util.Scanner;

public class Problema14 {

	public static void main(String[] args){

		Scanner scanner = new Scanner(System.in);
		System.out.println("Escriu la diagonal de la pantalla: ");

		float diagonalPolzades = scanner.nextFloat();
		float diagonal = (float) (diagonalPolzades * 0.0254);
		float base = (float) Math.sqrt(Math.pow(diagonal, 2) - 1);
		float area = base * 1;

		System.out.println("L'area es: " + area + "m2");
	}
}
