package tema3;

import java.util.Scanner;

public class Problema14 {

	public static void main(String[] args){

		Scanner scanner = new Scanner(System.in);
		System.out.println("Enter a positive or negative numbers: ");

		int nums = scanner.nextInt();
		int positive = 0;

		while(nums != 0){

			if(nums > 0){
				positive = positive + 1;
			}
			nums = scanner.nextInt();
		}
		System.out.println("There are " + positive + " positive numbers");
	}
}
