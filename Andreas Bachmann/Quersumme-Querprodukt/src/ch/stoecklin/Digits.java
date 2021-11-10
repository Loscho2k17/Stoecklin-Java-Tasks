package ch.stoecklin;

public class Digits {

	
	public static Result calc(String eingabeString) {
		int result1 = 0;
		int result2 = 1;
		for(int i = 0; i < eingabeString.length(); i++) {
			result1 = result1 + Integer.parseInt(eingabeString.substring(i,i+1));
			result2 = result2 * Integer.parseInt(eingabeString.substring(i,i+1));
		}
		Result result = new Result(result1, result2);
		return result;
	}
}

class Result{
	int result1;
	int result2;
	public Result(int result1, int result2) {
		this.result1 = result1;
		this.result2 = result2;
	}
}