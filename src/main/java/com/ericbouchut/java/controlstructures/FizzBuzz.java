package com.ericbouchut.java.controlstructures;

/**
 * This helper class contains a method to compute the FizzBuzz of a number.
 */
public final class FizzBuzz {

    public static void main(String[] args) {
        // Compute fizzbuzz for numbers from 1 up to 100.
        for (int i = 1; i <= 100; i++) {
            System.out.println("FizzBuz(" + i + ") ==> " + fizzbuzz(i));
        }
    }

    /**
     * Return the FizzBuzz string for the passed in number:
     * <ul>
     *     <li>>if number is multiple of 3, return "Fizz",</li>
     *     <li>if number is multiple of 5, return "Buzz",</li>
     *     <li>if number is multiple of 3 <b>and</b> 5, return "FizzBuzz",</li>
     *     <li>Otherwise, return the number as a String.</li>
     * </ul
     *
     * @param number the number to check
     * @return a String built according to the above rules
     */
    public static String fizzbuzz(int number) {
        boolean multipleOfThree = number % 3 == 0;
        boolean multipleOfFive  = number % 5 == 0;

        if (multipleOfThree) {
            if (multipleOfFive) {
                return "FizzBuzz";
            }
            return "Fizz";
        } else if (multipleOfFive) {
            return "Buzz";
        } else {
            return String.valueOf(number);
        }
    }
}
