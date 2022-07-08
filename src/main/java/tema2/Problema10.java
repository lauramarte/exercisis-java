package tema2;

import java.util.Scanner;

public class Problema10 {

	public static void main(String[] args){

		Scanner scanner = new Scanner(System.in);
		System.out.println("Escriu el primer valor: ");

		int num1 = scanner.nextInt();

		System.out.println("Escriu el segon valor: ");
		int num2 = scanner.nextInt();

		System.out.println("Escriu el tercer valor: " );
		int num3 = scanner.nextInt();

		if (num1 > num2 && num1 > num3){
			if(num2 > num3){
				System.out.println("Els valors ordenats de major a menor son: " + num1 + " - " + num2 + " - " + num3);
			} else {
				System.out.println("Els valors ordenats de major a menor son: " + num1 + " - " + num3 + " - " + num2);
			}
		} else if (num2 > num3 && num2 > num1){
			if(num3 > num1){
				System.out.println("Els valors ordenats de major a menor son: " + num2 + " - " + num3 + " - " + num1);
			} else {
				System.out.println("Els valors ordenats de major a menor son: " + num2 + " - " + num1 + " - " + num3);
			}
		} else {
			if(num1 > num2){
				System.out.println("Els valors ordenats de major a menor son: " + num3 + " - " + num1 + " - " + num2);
			} else {
				System.out.println("Els valors ordenats de major a menor son: " + num3 + " - " + num2 + " - " + num1);
			}
		}
	}
}
