package theoryJava.algorithm;

import java.util.ArrayList;
import java.util.List;

// A prime number is a whole number greater than 1 that has only two factors:
// 1 and the number itself.

public class findPrimeNumbers {
    public static void main(String[] args) {
        List<Integer>   primeNumbers = new ArrayList<>();

        for (int numberToCheck = 2; numberToCheck <= 1000; numberToCheck++) {
            boolean isPrime = true;
            for (int factor = 2; factor <= (numberToCheck / 2); factor++) {
                if ((numberToCheck % factor) == 0) {
                    isPrime = false;
                    break;
                }
            }
            if (isPrime) {
                primeNumbers.add(numberToCheck);
            }
        }
        System.out.println("Prime numbers from 1 to 1000 are:\n");
        for (int number : primeNumbers) {
            System.out.println(number);
        }
    }
}