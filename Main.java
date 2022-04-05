package theoryJava;

import theoryJava.algorithm.myAlgorithm;



public class Main {

    //Colors
    public static final String RESET = "\u001B[0m";
    public static final String RED = "\u001B[31m";
    public static final String GREEN = "\u001B[32m";
    public static final String YELLOW = "\u001B[33m";
    public static final String BLUE = "\u001B[34m";
    public static final String PURPLE = "\u001B[35m";
    public static final String CYAN = "\u001B[36m";
    public static void  main(String[] args) {
        myAlgorithm algo = new myAlgorithm();

        //testing Prime Numbers algorithm
        // System.out.println("\n" + RED + "~~~~~~" + GREEN + " Prime Number Algorithm" + RED + "~~~~~~\n" + RESET);
        // algo.primeNumbers();
        // System.out.println("\n\n");
        
        //testing Bubble Sort algorithm
        // System.out.println(RED + "~~~~~~" + GREEN + " Bubble Sort Algorithm" + RED + "~~~~~~\n" + RESET);
        // algo.bubbleSort();
        // System.out.println("\n\n");
        
        //testing Merge Sort algorithm
        // System.out.println(RED + "~~~~~~" + GREEN + " Merge Sort Algorithm" + RED + "~~~~~~\n" + RESET);
        // algo.mergeSort();
        // System.out.println("\n\n");

        //testing Insertion Sort algorithm
        // System.out.println(RED + "~~~~~~" + GREEN + " Insertion Sort Algorithm" + RED + "~~~~~~\n" + RESET);
        // algo.insertionSort();
        // System.out.println("\n\n");

        //testing Quick Sort algorithm
        // System.out.println(RED + "~~~~~~" + GREEN + " Quick Sort Algorithm" + RED + "~~~~~~\n" + RESET);
        // algo.quickSort();
        // System.out.println("\n\n");

        //testing Fibonacci algorithm
        System.out.println(RED + "~~~~~~" + GREEN + " Fibonacci Algorithm " + RED + "~~~~~~\n" + RESET);
        algo.fibonacci();
        System.out.println("\n\n");
    }
}
