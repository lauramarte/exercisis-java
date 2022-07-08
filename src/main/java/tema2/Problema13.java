package tema2;

import java.util.Scanner;

public class Problema13 {

	public static void main(String[] args){

		Scanner scanner = new Scanner(System.in);
		System.out.println("Escriu el primer valor: ");

		double num1 = scanner.nextFloat();

		System.out.println("Escriu el segon valor: ");
		double num2 = scanner.nextFloat();

		System.out.println("Escriu el tercer valor: ");
		double num3 = scanner.nextFloat();

		double arrel = Math.sqrt((Math.pow(num2, 2)) - (4 * num1 * num3));
		double positiu = (- num2 + arrel) / (2 * num1);
		double negatiu = (- num2 - arrel) / (2 * num1);

		if(negatiu == positiu){
			System.out.println("Les solucions son: " + positiu);
		} else {
			System.out.println("Solucio 1: " + positiu);
			System.out.println("Solucio 2: " + negatiu);
		}
	}
}
