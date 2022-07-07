package tema1;

import java.util.Scanner;

public class Problema5 {

	public static void main (String[] args){

		Scanner scanner = new Scanner(System.in);
		System.out.println("Escriu un valor real: ");

		float number = scanner.nextFloat();

		System.out.print(number + " - " + String.format("%.2f", number) + " - " + String.format("%.0f", number));

	}
}
