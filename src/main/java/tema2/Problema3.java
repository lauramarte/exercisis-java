package tema2;

import java.util.Scanner;

public class Problema3 {

	public static void main(String[] args){

		Scanner scanner = new Scanner(System.in);
		System.out.println("Escriu un numero de segons: ");

		int segons = scanner.nextInt();

		int sec = segons % 60;
		int minuts = segons / 60;
		minuts = minuts % 60;
		int hores = segons / 3600;
		hores = hores % 60;
		int dies = segons / 86400;
		dies = dies % 24;
		int setmanes = dies / 7;

		System.out.println("Son: " + setmanes + " setmanes, " + dies + " dies, " + hores + " hores, " + minuts + " minuts i " + sec + " segons.");
	}
}
