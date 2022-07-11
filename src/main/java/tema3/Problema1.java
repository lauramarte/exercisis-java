package tema3;

import javax.print.attribute.standard.PresentationDirection;
import java.sql.PreparedStatement;
import java.util.Scanner;

public class Problema1 {

	public static void main(String[] args){

		Scanner scanner = new Scanner(System.in);
		System.out.println("Escriu un numero: ");

		int numero = scanner.nextInt();

		int factorial = 1;
		for(int i = 1; i <= numero; i++){
			factorial = factorial * i;
		}

		System.out.println("Factorial: " + factorial);
	}
}
