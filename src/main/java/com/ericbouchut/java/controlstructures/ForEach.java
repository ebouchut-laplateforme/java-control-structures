package com.ericbouchut.java.controlstructures;

public class ForEach {

    public static void main(String[] args) {
        int[] numbers = {1,2,3,4,5};

        // foreach loop
        //
        // This is way simpler than the regular one,
        // because we do not need to handle the index and the exit
        // condition for the loop.
        for (int number: numbers) {
            System.out.println(number);
        }

        // Regular for loop
        for (int i=0, number; i < numbers.length; i++) {
            number = numbers[i];
            System.out.println(number);
        }
    }

}
