package ch.gbssg.edu.panchalingam.sathushan;

import java.io.*;
import java.util.*;

public class Fakultät23 {

    private static Scanner input;

    public static void main(String[] args) throws IOException {
        long number;
        input = new Scanner(System.in);
        System.out.println("Bitte Wert für Fakultät eingenbe: ");
        number = input.nextInt();
        n23(number);
        System.out.println(n23(number));
    }

    public static long n23(long number) {
        long solution = 1;
        long i;

        // Faculty calculate
        for (i = 1; i <= number; i += 2) {
            if (i % 3 != 0) {
                solution = solution * i;
            }
        }
        return solution;
    }
}