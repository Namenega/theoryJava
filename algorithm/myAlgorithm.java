package theoryJava.algorithm;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;
import java.util.Random;

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


    /* ********************************************************************** */
    /* **************************** BUBBLE SORT ***************************** */
    /* ********************************************************************** */
    
    public void bubbleSort() {
        // Get input from client
        System.out.println("Please input the limit (max 100.000): ");
        Scanner scan = new Scanner(System.in);
        int limit = scan.nextInt();
        scan.close();

        if (limit > 100000) {
            System.out.println("Input is bigger than 100.000.\nFixed at 100.000.\n");
            limit = 100000;
        }
        
        //Get random values
        Random rand = new Random();
        int[] numbers = new int[limit];
        
        for (int i = 0; i < numbers.length; i++) {
            numbers[i] = rand.nextInt(1000000);
        }
        
        //Print non sorted value
        System.out.println("\nBefore:\n");
        printArray(numbers);
        
        //Start Algo
        boolean swapped = true;

        while (swapped) {
            if (swapped)
            swapped = false;
            for (int i = 0; i < numbers.length - 1; i++) {
                if (numbers[i] > numbers[i + 1]) {
                    swapped = true;
                    int tmp = numbers[i];
                    numbers[i] = numbers[i + 1];
                    numbers[i + 1] = tmp;
                }
            }
        }
        
        //Print sorted value
        System.out.println("\nAfter:\n");
        printArray(numbers);
    }


    /* ********************************************************************** */
    /* ***************************** MERGE SORT ***************************** */
    /* ********************************************************************** */

    public void mergeSort() {
        // Get input from client
        System.out.println("Please input the limit (max 100.000): ");
        Scanner scan = new Scanner(System.in);
        int limit = scan.nextInt();
        scan.close();
        
        if (limit > 100000) {
            System.out.println("Input is bigger than 100.000.\nFixed at 100.000.\n");
            limit = 100000;
        }
                
        //Get random values
        Random rand = new Random();
        int[] numbers = new int[limit];
                
        for (int i = 0; i < numbers.length; i++) {
            numbers[i] = rand.nextInt(1000000);
        }
                
        //Print non sorted value
        System.out.println("\nBefore:\n");
        printArray(numbers);
        
        //Start Algo
        mergeSortAlgoRecursively(numbers);
        
        //Print sorted value
        System.out.println("\nAfter:\n");
        printArray(numbers);
    }

    private static void mergeSortAlgoRecursively(int[] inputArray) {
        int inputLength = inputArray.length;
        
        // If already sorted
        if (inputLength < 2)
            return ;
        
        int     midIndex = inputLength / 2;
        int[]   leftHalf = new int[midIndex];
        int[]   rightHalf = new int[inputLength - midIndex];

        // Fill left half
        for (int i = 0; i < midIndex; i++)
            leftHalf[i] = inputArray[i];

        // Fill right half
        for (int i = midIndex; i < inputLength; i++)
            rightHalf[i - midIndex] = inputArray[i];
        
        // Recursivity
        mergeSortAlgoRecursively(leftHalf);
        mergeSortAlgoRecursively(rightHalf);

        // Merge
        merge(inputArray, leftHalf, rightHalf);
    }

    private static void merge(int[] inputArray, int[] leftHalf, int[] rightHalf) {
        int i = 0, j = 0, k = 0;
        int leftSize = leftHalf.length;
        int rightSize = rightHalf.length;

        // Merge and refill
        while (i < leftSize && j < rightSize) {
            if (leftHalf[i] <= rightHalf[j]) {
                inputArray[k] = leftHalf[i];
                i++;
            } else {
                inputArray[k] = rightHalf[j];
                j++;
            }
            k++;
        }

        // Clean up the rest of values
        while (i < leftSize) {
            inputArray[k] = leftHalf[i];
            i++;
            k++;
        }
        while (j < rightSize) {
            inputArray[k] = rightHalf[j];
            j++;
            k++;
        }
    }


    /* ********************************************************************** */
    /* ******************************* UTILS ******************************** */
    /* ********************************************************************** */

    private static void printArray(int[] numbers) {
        for (int i = 0; i < numbers.length; i++) {
            System.out.println(numbers[i]);
        }
    }
 }
    