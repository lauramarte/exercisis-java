package tema3;

import java.io.Console;
import java.util.Scanner;
public class Problema7 {

	public static void main(String[] args){

		Scanner scanner = new Scanner(System.in);
		System.out.println("Escriu una sequencia de digits: ");

		String val=scanner.next();
		int result = Integer.parseInt(val, 10);
		System.out.println(result);
	}

}
