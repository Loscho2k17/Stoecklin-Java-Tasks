package ch.stoecklin;

public class Digits {

	
	public static Result calc(String eingabeString) {
		long result1 = 0;
		long result2 = 1;
		for(int i = 0; i < eingabeString.length(); i++) {
			result1 = result1 + Long.parseLong(eingabeString.substring(i,i+1));
			result2 = result2 * Long.parseLong(eingabeString.substring(i,i+1));
		}
		Result result = new Result(result1, result2);
		return result;
	}
}

class Result{
	long result1;
	long result2;
	public Result(long result1, long result2) {
		this.result1 = result1;
		this.result2 = result2;
	}
}