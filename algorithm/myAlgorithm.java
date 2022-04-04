package theoryJava.algorithm;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class myAlgorithm {

    /* ********************************************************************** */
    /* *************************** PRIME NUMBERS **************************** */
    /* ********************************************************************** */

    public void primeNumbers() {
        // Get input from client
        System.out.println("Please input the limit: ");
        Scanner scan = new Scanner(System.in);
        int limit = scan.nextInt();
        scan.close();

        //Start Algo
        List<Integer>   primeNumbers = new ArrayList<>();
        int numberToCheck = 2;
        int count = 0;

        System.out.println("\nThe first " + limit + " prime numbers are:");
        while (true) {
            boolean isPrime = true;
            for (int factor = 2; factor <= (numberToCheck / 2); factor++) {
                if ((numberToCheck % factor) == 0) {
                    isPrime = false;
                    break;
                }
            }
            if (isPrime) {
                primeNumbers.add(numberToCheck);
                count++;
                System.out.println("[" + count + "] - " + numberToCheck);
                if (count >= limit)
                    break;
            }
            numberToCheck++;
        }
    }
}
