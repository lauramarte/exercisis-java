package tema2;

import java.util.Scanner;

public class Problema8 {

	public static void main(String[] args){

		Scanner scanner = new Scanner(System.in);
		System.out.println("Escriu el primer numero: ");

		int num1 = scanner.nextInt();

		System.out.println("Escriu un segon numero: ");
		int num2 = scanner.nextInt();

		System.out.println("Escriu un tercer numero: ");
		int num3 = scanner.nextInt();

		int mitja = (num1 + num2 + num3) / 3;

		System.out.println("La part sencera del valor mig es: " + mitja);
	}
}
