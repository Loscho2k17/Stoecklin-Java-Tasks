package ch.stoecklin;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println(n23(input.nextInt()));
    }

    public static long n23(int number){
        long result = 1;
        for (int i = 0; i<number; i++){
            if(i%2!=0 && i%3!=0){
                result *= i;
            }
        }
        return result;
    }
}
