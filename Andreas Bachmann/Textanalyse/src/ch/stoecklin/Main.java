package ch.stoecklin;


import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		String eingabe = input.nextLine().toLowerCase();
		String[] split  = eingabe.split(" ");
		Map<String, Integer > test1 = new HashMap<String, Integer>();
		for(String a: split) {
		
	
			test1.put(a,test1.get(a) == null ? 1 : test1.get(a) + 1);
		}
		test1.forEach((k,v) -> System.out.println(k + " (" + v + "), "));
	}
	


}
