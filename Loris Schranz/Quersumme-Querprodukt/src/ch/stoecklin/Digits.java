package ch.stoecklin;

public class Digits {
    public static int calcChecksum(int num){
        int sum = 0;
        for(char number : String.valueOf(num).toCharArray()){
            sum += Integer.parseInt(String.valueOf(number));
        }
        return sum;
    }

    public static int calcCheckproduct(int num){
        int product = 1;
        for(char number : String.valueOf(num).toCharArray()){
            product *= Integer.parseInt(String.valueOf(number));
        }
        return product;
    }
}
