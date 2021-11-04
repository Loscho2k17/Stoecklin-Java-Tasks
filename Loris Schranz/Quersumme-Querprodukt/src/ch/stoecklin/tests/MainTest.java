package ch.stoecklin.tests;

import ch.stoecklin.Digits;
import org.junit.jupiter.api.Test;

import static ch.stoecklin.Main.countDividers;
import static org.junit.jupiter.api.Assertions.assertEquals;

public class MainTest {
    /*
    Wo liegt das Problem bei der Berechung von f(1'000'000'000'000)? Bespreche mögliche Lösungen.
    2'147'483'647 (Biggest possible int) < 1'000'000'000'000
    9'223'372'036'854'775'807 (Biggest possible long) > 1'000'000'000'000

    Mit einem Long würde die Abfrage von f(1'000'000'000'000) funktionieren, geht aber viel zu lange
     */
    @Test
    void countDividersOf100equals12(){
        assertEquals(12, countDividers(100));
    }

    @Test
    void countDividersOf1000000equals309(){
        assertEquals(309, countDividers(1000000));
    }

    @Test
    void countDividersOf5000000equals742(){
        assertEquals(742, countDividers(5000000));
    }

    // f(1'000'000'000'000) mit long

    /*
    public static long calcChecksumLong(long num){
        long sum = 0;
        for(char number : String.valueOf(num).toCharArray()){
            sum += Long.parseLong(String.valueOf(number));
        }
        return sum;
    }

    public static long calcCheckproductLong(long num){
        long product = 1;
        for(char number : String.valueOf(num).toCharArray()){
            product *= Long.parseLong(String.valueOf(number));
        }
        return product;
    }

    public static long countDividersLong(long num){
        long count = 0;
        for (long i = 1; i<num; i++){
            if(i % calcChecksumLong(i) == 0){
                if(calcCheckproductLong(i) != 0){
                    if(i % calcCheckproductLong(i) == 0){
                        count++;
                        System.out.println(i);

                    }
                }
            }
        }
        return count;
    }

    @Test
    void countDividersLongOf1000000000000equals742(){
        assertEquals(742, countDividersLong(Long.parseLong(String.valueOf("1000000000000"))));
    }

     */
}

