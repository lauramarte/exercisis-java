package tema2;

import java.util.Scanner;

public class Problema7_2 {

	public static void main(String[] args){
// calcular el maxim i el minim
		Scanner scanner = new Scanner(System.in);
		System.out.println("Escriu el primer numero: ");
		int num1 = scanner.nextInt();

		System.out.println("Escriu el segon numero: ");
		int num2 = scanner.nextInt();

		System.out.println("Escriu el tercer numero: ");
		int num3 = scanner.nextInt();

		if (num1 > num2 && num1 > num3){
			if(num2 > num3){
				System.out.println("El valor maxim es: " + num1);
				System.out.println("El valor minim es: " + num3);
			} else {
				System.out.println("El valor maxim es: " + num1);
				System.out.println("El valor minim es: " + num2);
			}
		} else if (num2 > num3 && num2 > num1){
			if(num3 > num1){
				System.out.println("El valor maxim es: " + num2);
				System.out.println("El valor minim es: " + num1);
			} else {
				System.out.println("El valor maxim es: " + num2);
				System.out.println("El valor minim es: " + num3);
			}
		} else {
			if(num1 > num2){
				System.out.println("El valor maxim es: " + num3);
				System.out.println("El valor minim es: " + num2);
			} else {
				System.out.println("El valor maxim es: " + num3);
				System.out.println("El valor minim es: " + num1);
			}
		}
	}
}
