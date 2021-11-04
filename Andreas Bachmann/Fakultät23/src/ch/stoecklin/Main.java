package ch.stoecklin;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		
		Scanner input = new Scanner(System.in); 
		System.out.println(N23(input.nextInt()));

	}
	
	public static long N23(int number) {
		System.out.println(number);
		long result = 1;
		for(int i=0; i<number; i++) {
			if((i % 2 != 0)&&(i % 3 != 0)) {
				result = result * i;
				System.out.print(i);
				System.out.println(" | " + result);
			}
		}
		return result;
	}
	

}
