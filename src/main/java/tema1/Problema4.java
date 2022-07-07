package tema1;

import java.util.Scanner;

public class Problema4 {

	public static void main(String[] args){

		Scanner scanner = new Scanner(System.in);
		System.out.println("Escriu un valor en decimal: ");

		int number = scanner.nextInt();

		String octal = Integer.toOctalString(number);

		String hex = Integer.toHexString(number);

		System.out.println("Decimal: " + number + ". Octal: " + octal + ". Hexadecimal: " + hex);

	}
}
