package com.ericbouchut.java.controlstructures;

import java.util.Random;

/**
 * This helper class counts the even numbers in an array.
 *
 * @see EvenCounter#countEvenNumbers
 */
 public final class EvenCounter {

    public static void main(String[] args) {
        Random random = new Random();

        int[] numbers = new int[20];
        for (int i = 0; i < numbers.length; i++) {
            numbers[i] = random.nextInt(100) + 1; // Add a random number between 0 and 100 (inclusive)
        }

        System.out.print("Array of numbers: ");
        for (int number: numbers){
            System.out.print(number);
            System.out.print(", ");
        }

        System.out.println();
        System.out.println("Number of even numbers in this array: " + EvenCounter.countEvenNumbers(numbers));
    }

    /**
     * Count the even numbers in the passed-in array.
     *
     * @param numbers an array of numbers
     * @return the number even numbers in the passed-in array
     */
    public static int countEvenNumbers(int[] numbers) {
        int even_count = 0;

        for (int number: numbers) {
            if (number % 2 == 0) { // number is even (i.e., divisible by 2 and the remainder is 0)
                even_count += 1;
            }
        }
        return even_count;
    }
 }