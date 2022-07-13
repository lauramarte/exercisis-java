package tema3;

import java.util.Scanner;

public class Problema6_5 {

	public static void main(String[] args){

		Scanner scanner = new Scanner(System.in);
		System.out.println("Escriu el primer numero: ");

		int num1 = scanner.nextInt();

		System.out.println("Escriu el segon numero: ");
		int num2 = scanner.nextInt();

		if(num2 == 0){
			System.out.println("Error.");
		} else {
			int quocient = 0;
			while(num1 >= num2){
				quocient++;
				num1 = num1 - num2;
			}
			System.out.println("Quocient: " + quocient);
			System.out.println("Reste: " + num1);
		}
	}
}
