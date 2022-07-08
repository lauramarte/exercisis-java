package tema2;

import java.util.Scanner;

public class Problema12 {

	public static void main(String[] args){

		Scanner scanner = new Scanner(System.in);
		System.out.println("Escriu un valor: ");

		float num1 = scanner.nextFloat();

		System.out.println("Escriu un segon valor: ");
		float num2 = scanner.nextFloat();

		if(num2 == 0){
			System.out.println("Error");
		} else {
			float quocient = num1 / num2;
			float reste = num1 % num2;
			System.out.println("Quocient: " + quocient);
			System.out.println("Reste: " + reste);
		}
	}
}
