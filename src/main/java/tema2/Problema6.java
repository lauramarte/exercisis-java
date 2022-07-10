package tema2;

import java.util.Scanner;

public class Problema6 {

	public static void main(String[] args){

		Scanner scanner = new Scanner(System.in);
		System.out.println("Introdueix un numero entre 0 i 127: ");

		int digit = scanner.nextInt();

		char ascii = (char) digit;

		System.out.println("El numero es: " + ascii);
	}
}
