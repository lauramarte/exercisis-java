package tema2;

import java.util.Scanner;

public class Problema11 {

	public static void main(String[] args){

		Scanner scanner = new Scanner(System.in);
		System.out.println("Escriu el primer numero: ");

		int num1 = scanner.nextInt();

		System.out.println("Escriu el segon numero: ");
		int num2 = scanner.nextInt();

		if(num2 == 0){
			System.out.println("Error");
		} else if (num1 >= 0 && num2 > 0){
			int quocient = num1/num2;
			int reste = num1 % num2;
			System.out.println("Quocient: " + quocient);
			System.out.println("Reste: " + reste);
		} else {
			System.out.println("Escriu valors positius.");
		}
	}
}
