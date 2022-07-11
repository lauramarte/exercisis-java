package tema3;

import java.util.Scanner;

public class Problema2 {

	public static void main(String[] args){

		Scanner scanner = new Scanner(System.in);
		System.out.println("Escriu el primer valor: ");

		int num1 = scanner.nextInt();

		System.out.println("Escriu el segon valor: ");
		int num2 = scanner.nextInt();

		int suma = 0;

		if(num1 >= 0 && num2 >= 0){
			for(int i = num1; i <= num2; i++){
				suma = suma + i;
			}
			System.out.println("La suma del interval es: " + suma);

		} else {
			System.out.println("Escriu numeros positius.");
		}

	}
}
