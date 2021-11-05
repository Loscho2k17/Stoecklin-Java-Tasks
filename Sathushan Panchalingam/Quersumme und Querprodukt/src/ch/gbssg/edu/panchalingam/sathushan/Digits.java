package ch.gbssg.edu.panchalingam.sathushan;

import java.io.IOException;
import java.util.*;

public class Digits {

    private static Scanner input;

    public static void main(String[] args) throws IOException {
        long number;
        long systemTimeBefore, systemTimeAfter, systemTimeDifference;
        input = new Scanner(System.in);
        System.out.println("Bitte gebe eine Zahl ein: ");
        number = input.nextLong();
        systemTimeBefore = System.currentTimeMillis();
        querBerechnungResultat(number);
        systemTimeAfter = System.currentTimeMillis();
        systemTimeDifference = systemTimeAfter - systemTimeBefore;
        System.out.println(systemTimeDifference);
    }

    public static Result querBerechnung(long number) {
        String stringNumber;
        long solutionSum = 0, solutionProd = 1, x;

        // Long comes to String
        stringNumber = String.valueOf(number);

        // Create array and copy each digit in each field
        char[] digits = stringNumber.toCharArray();

        // Calculate result
        for (long i = 0; i < stringNumber.length(); i++) {
            x = Character.digit(digits[(int) i], 10);
            solutionSum = solutionSum + x;
            solutionProd = solutionProd * x;
        }
        // Create Map with Quersumme = solutionSum and Querprodukt = solutionProd
        Result solutions = new Result();
        solutions.sum = solutionSum;
        solutions.product = solutionProd;
        // System.out.println(solutions);
        return solutions;
    }

    public static long querBerechnungResultat(long number) {
        long querProdukt = 1, querSumme = 0, solution = 0;
        Result solutionsAbove;
        for (long i = 1; i < number; i++) {

            // Function querBerechnung assign to new Map solutionsAbove
            solutionsAbove = querBerechnung(i);

            // Check if Querprodukt 0 because 0 division
            if (solutionsAbove.product != 0) {

                // querProdukt, querSumme divisible yes/no, if both yes = solution + 1
                querProdukt = i % solutionsAbove.product;
                querSumme = i % solutionsAbove.sum;
                if ((querProdukt == 0) && (querSumme == 0)) {
                    solution++;
                }
            }
        }
        System.out.println(solution);
        return solution;
    }

}

class Result {

    long sum;
    long product;
}