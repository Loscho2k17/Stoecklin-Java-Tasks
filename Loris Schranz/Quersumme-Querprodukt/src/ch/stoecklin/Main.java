package ch.stoecklin;

public class Main {
    public static void main(String[] args) {
        System.out.println(Digits.calcChecksum(234));
        System.out.println(Digits.calcCheckproduct(234));
        System.out.println(countDividers(100));
    }

    public static int countDividers(int num){
        int count = 0;
        for (int i = 1; i<num; i++){
            if(i % Digits.calcChecksum(i) == 0 && Digits.calcCheckproduct(i) != 0 && i % Digits.calcCheckproduct(i) == 0){
                count++;
            }
        }
        return count;
    }
}
