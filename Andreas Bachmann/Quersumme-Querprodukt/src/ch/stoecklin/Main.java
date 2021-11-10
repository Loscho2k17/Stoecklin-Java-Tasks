package ch.stoecklin;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		int eingabe = input.nextInt();
		String eingabeString = String.valueOf(eingabe);
		Result result =  Digits.calc(eingabeString);
				

		System.out.println(result.result1);
		System.out.println(result.result2);
	}
	

	
}
