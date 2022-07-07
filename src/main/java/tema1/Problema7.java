package tema1;

import java.util.Scanner;

public class Problema7 {

	public static void main(String[] args){

		Scanner scanner = new Scanner(System.in);
		System.out.println("Escriu un numero: ");

		float num1 = scanner.nextInt();

		System.out.println("Escriu un segon numero:");
		float num2 = scanner.nextInt();

		float suma = num1 + num2;
		float resta = num1 - num2;
		float divisio = num1 / num2;
		float producte = num1 * num2;
		float reste = num1 % num2;

		System.out.println("Suma: " + suma + " - " + String.format("%.2f", suma));
		System.out.println("Resta: " + resta + " - " + String.format("%.2f", resta));
		System.out.println("Divisio: " + divisio + " - " + String.format("%.2f", divisio));
		System.out.println("Producte: " + producte + " - " + String.format("%.2f", producte));
		System.out.println("Reste: " + reste + " - " + String.format("%.2f", reste));

	}
}
