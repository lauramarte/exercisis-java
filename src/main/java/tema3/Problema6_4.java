package tema3;

import java.util.Scanner;

public class Problema6_4 {

	public static void main(String[] args) {

		Scanner scanner = new Scanner(System.in);
		System.out.println("Escriu un primer valor: ");

		int num1 = scanner.nextInt();

		System.out.println("Escriu un segon valor: ");
		int num2 = scanner.nextInt();

		if (num1 == 0 && num2 == 0) {
			System.out.println("El valor es 0.");
		} else {

			int producte = 1;

			for (int i = 1; i <= num2; i++) {
				producte = producte * num1;
			}

			System.out.println("El valor de la potencia es: " + producte);

		}
	}
}
