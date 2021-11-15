package ch.stoecklin;




import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.util.HashMap;
import java.util.Map;
//import java.util.Scanner;

public class Main {

	public static void main(String[] args)throws IOException {
		//Scanner input = new Scanner(System.in);
		//String eingabe = input.nextLine().toLowerCase();
		String eingabe2 = Files.readString(Path.of("src\\ch\\stoecklin\\Testtext.txt"));
		String[] split  = eingabe2.split(" ");
		Map<String, Integer > test1 = new HashMap<String, Integer>();
		for(String a: split) {
		
	
			test1.put(a,test1.get(a) == null ? 1 : test1.get(a) + 1);
		}
		test1.forEach((k,v) -> System.out.println(k + " (" + v + "), "));
		
		String[] split2 = eingabe2.split("");
		Map<String, Integer> test2 = new HashMap<String, Integer>();
		for(String a: split2) {
			test2.put(a,test2.get(a) == null ? 1 : test2.get(a) + 1);
		}
		test2.forEach((k,v) -> System.out.println(k+" ("+ v +"),"));
	}
	


}
