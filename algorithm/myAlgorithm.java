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
        int limit = getInput();

        // Start Algo
        List<Integer> primeNumbers = new ArrayList<>();
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
    /* ***************************** FIBONACCI ****************************** */
    /* ********************************************************************** */

    private static long[]   fibonacciCache;

    public void fibonacci() {
        // Get input from client
        int limit = getInput();

        fibonacciCache = new long[limit + 1];

        // Start Algo
        for (int i = 0; i <= limit; i++) {
            if (fibonacciAlgo(i) > 2147483647 || fibonacciAlgo(i) < -2147483648)
                System.out.println("Out of 'long' type range.");
            else
                System.out.println("Result: " + fibonacciAlgo(i));
        }

    }

    private static long fibonacciAlgo(int n) {
        if (n <= 1)
            return (n);
        if (fibonacciCache[n] != 0)
            return (fibonacciCache[n]);
        long fibonacciNumber = fibonacciAlgo(n - 1) + fibonacciAlgo(n - 2);
        fibonacciCache[n] = fibonacciNumber;
        return (fibonacciNumber);
    }


    /* ********************************************************************** */
    /* **************************** BUBBLE SORT ***************************** */
    /* ********************************************************************** */

    public void bubbleSort() {
        // Get input from client
        int limit = getInput();

        // Get random values
        int[] numbers = getRandomValues(limit);

        // Print non sorted value
        System.out.println("\nBefore:\n");
        printArray(numbers);

        // Start Algo
        boolean swapped = true;

        while (swapped) {
            if (swapped)
                swapped = false;
            for (int i = 0; i < numbers.length - 1; i++) {
                if (numbers[i] > numbers[i + 1]) {
                    swapped = true;
                    swap(numbers, i, i + 1);
                }
            }
        }

        // Print sorted value
        System.out.println("\nAfter:\n");
        printArray(numbers);
    }


    /* ********************************************************************** */
    /* ***************************** MERGE SORT ***************************** */
    /* ********************************************************************** */

    public void mergeSort() {
        // Get input from client
        int limit = getInput();

        // Get random values
        int[] numbers = getRandomValues(limit);

        // Print non sorted value
        System.out.println("\nBefore:\n");
        printArray(numbers);

        // Start Algo
        mergeSortAlgoRecursively(numbers);

        // Print sorted value
        System.out.println("\nAfter:\n");
        printArray(numbers);
    }

    private static void mergeSortAlgoRecursively(int[] inputArray) {
        int inputLength = inputArray.length;

        // If already sorted
        if (inputLength < 2)
            return;

        int midIndex = inputLength / 2;
        int[] leftHalf = new int[midIndex];
        int[] rightHalf = new int[inputLength - midIndex];

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
    /* *************************** INSERTION SORT *************************** */
    /* ********************************************************************** */

    public void insertionSort() {
        // Get input from client
        int limit = getInput();

        // Get random values
        int[] numbers = getRandomValues(limit);

        // Print non sorted value
        System.out.println("\nBefore:\n");
        printArray(numbers);

        // Start Algo
        insertionSortAlgo(numbers);

        // Print sorted value
        System.out.println("\nAfter:\n");
        printArray(numbers);
    }

    private static void insertionSortAlgo(int[] inputArray) {
        for (int i = 1; i < inputArray.length; i++) {
            int currentValue = inputArray[i];
            int j = i - 1;
            while (j >= 0 && inputArray[j] > currentValue) {
                inputArray[j + 1] = inputArray[j];
                j--;
            }
            inputArray[j + 1] = currentValue;
        }
    }


    /* ********************************************************************** */
    /* ***************************** QUICK SORT ***************************** */
    /* ********************************************************************** */

    public void quickSort() {
        // Get input from client
        int limit = getInput();

        // Get random values
        int[] numbers = getRandomValues(limit);

        // Print non sorted value
        System.out.println("\nBefore:\n");
        printArray(numbers);

        // Start Algo
        quickSortAlgo(numbers);

        // Print sorted value
        System.out.println("\nAfter:\n");
        printArray(numbers);
    }

    private static void quickSortAlgo(int[] array) {
        quickSortAlgo(array, 0, array.length - 1);
    }

    private static void quickSortAlgo(int[] array, int lowIndex, int highIndex) {
        if (lowIndex >= highIndex)
            return;

        // Get random pivot
        int pivotIndex = new Random().nextInt(highIndex - lowIndex) + lowIndex;
        int pivot = array[pivotIndex];
        swap(array, pivotIndex, highIndex);

        // Order and Swap
        int leftPointer = quickSortAlgo(array, lowIndex, highIndex, pivot);

        // Recursivity
        quickSortAlgo(array, lowIndex, leftPointer - 1);
        quickSortAlgo(array, leftPointer + 1, highIndex);
    }

    private static int quickSortAlgo(int[] array, int lowIndex, int highIndex, int pivot) {
        int leftPointer = lowIndex;
        int rightPointer = highIndex;

        while (leftPointer < rightPointer) {
            while (array[leftPointer] <= pivot && leftPointer < rightPointer)
                leftPointer++;
            while (array[rightPointer] >= pivot && leftPointer < rightPointer)
                rightPointer--;
            swap(array, leftPointer, rightPointer);
        }
        swap(array, leftPointer, highIndex);
        return leftPointer;
    }


    /* ********************************************************************** */
    /* ******************************* UTILS ******************************** */
    /* ********************************************************************** */

    private static void printArray(int[] numbers) {
        for (int i = 0; i < numbers.length; i++) {
            System.out.println(numbers[i]);
        }
    }

    private static int getInput() {
        System.out.println("Please input the limit: ");
        Scanner scan = new Scanner(System.in);
        int limit = scan.nextInt();
        // scan.close();

        if (limit > 100000) {
            System.out.println("Input is bigger than 100.000.\nFixed at 100.000.\n");
            limit = 100000;
        }
        return (limit);
    }

    private static int[] getRandomValues(int limit) {
        Random rand = new Random();
        int[] numbers = new int[limit];

        for (int i = 0; i < numbers.length; i++) {
            numbers[i] = rand.nextInt(1000000);
        }
        return (numbers);
    }

    private static void swap(int[] array, int index1, int index2) {
        int tmp = array[index1];
        array[index1] = array[index2];
        array[index2] = tmp;
    }
}
