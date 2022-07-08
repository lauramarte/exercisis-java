package tema2;

import java.util.Scanner;

public class Problema7_1 {

	public static void main(String[] args){

		Scanner scanner = new Scanner(System.in);
		System.out.println("Introdueix un numero: ");

		int number = scanner.nextInt();

		if(number < 0){
			System.out.println("El valor es negatiu.");
		} else if(number == 0){
			System.out.println("El valor es 0.");
		} else {
			System.out.println("El valor es positiu.");
		}
	}
}
