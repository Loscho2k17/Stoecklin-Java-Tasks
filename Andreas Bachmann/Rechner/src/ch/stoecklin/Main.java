package ch.stoecklin;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		System.out.println("Möchten Sie den Rechner starten Y/N ");
		Scanner input = new Scanner(System.in);
		String Bestätigung = input.next();
		int nummer1 = 0;
		int nummer2 = 0;
		String operator = "";

		if(Bestätigung.equalsIgnoreCase("y") ) {
			
			System.out.println("Geben sie die erste Nummer ein. ");
			
			nummer1 = input.nextInt();
			
			System.out.println("Geben sie die zweite Nummer ein. ");
			
			nummer2 = input.nextInt();
			
			System.out.println("Geben sie den Operator ein. (+,-,*,/,%) ");
			operator = input.next();
		}else {
			System.exit(0);
		}
		System.out.println(calc(nummer1, nummer2, operator));
	}

	public static int calc(int number1, int number2, String operator) {
		int result = 0;
		switch(operator) {
			case "+":
				result = number1 + number2;
				break;
			case "-":
				result = number1 - number2;
				break;
			case "*":
				result = number1 * number2;
				break;
			case "/":
				result= number1 / number2;
				break;
			case "%":
				result = number1 % number2;
				break;
			default:
				System.out.println("Ungültiger Operator");
		}
		return result;
	}
}
