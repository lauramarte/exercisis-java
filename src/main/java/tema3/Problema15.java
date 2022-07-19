package tema3;

import java.util.Scanner;

public class Problema15 {

	public static void main(String[] args){

		Scanner scanner = new Scanner(System.in);
		System.out.println("Enter a sequence of values: ");

		float nums = scanner.nextFloat();
		float suma = 0;
		float contador = 0;

		while (nums != 0.0){
			contador = contador + 1;
			suma = suma + nums;
			nums = scanner.nextFloat();
		}

		float mitja = suma / contador;
		System.out.println(mitja);
	}
}
