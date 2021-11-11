package ch.stoecklin;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		long eingabe = input.nextLong();
		String eingabeString = String.valueOf(eingabe);
		Result result =  Digits.calc(eingabeString);	
		
		
		
		

		System.out.println(result.result1);
		System.out.println(result.result2);
		System.out.println(count(eingabe));
	}
	
	public static long count(long n) {
		long counter = 0;
		for(long i = 1; i <= n; i++) {
			
			Result tempResult = Digits.calc(String.valueOf(i));
			if(tempResult.result2 != 0 && i%tempResult.result1 == 0 && i%tempResult.result2 == 0) {
				counter++;
			}
		}
		return counter;
	}

	
}
