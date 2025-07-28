package com.ericbouchut.java.controlstructures;

import java.util.Scanner;

/**
 * This helper class contains a method to compute a grade from a score.
 */
public final class Grade {

    /**
     * REPL that asks for a grade then compute and display
     * the corresponding score.
     */
    public static void main(String[] args) {
        int score;
        char grade;
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter a score (i.e., a number >= 0, or EXIT to quit): ");
        while(scanner.hasNextInt()) {
            score = scanner.nextInt();
            grade = Grade.from(score);

            System.out.println("Corresponding grade is " + grade);
            System.out.print("Enter a score (i.e., a number >= 0, or EXIT to quit): ");
        }
    }

    /**
     * Compute a grade from a <code>score</code> using this conversion table:
     * <ul>
     *     <li>score 80 or more: grade A</li>
     *     <li>score 70 to 79: grade B</li>
     *     <li>score 60 to 69: C</li>
     *     <li>score 50 to 59: D</li>
     *     <li>score 40 to 49: grade E</li>
     *     <li>score from 30 to 39: grade F</li>
     *     <li>score less then 30: grade G</li>
     * </ul>
     *
     * @param score the score
     * @return a boolean false, if the core is not within the required range
     */
    public static char from(int score) {
        char grade = ' ';

        if (score < 0) {
            System.err.println("Invalid score: " + score + " must be >= 0");
            return grade;
        }

        if (score >= 80) {
            grade = 'A';
        } else if (score >= 70 && score <= 79) {
            grade = 'B';
        } else if (score >= 60 && score <= 69) {
            grade = 'C';
        } else if (score >= 50 && score <= 59) {
            grade = 'D';
        } else if (score >= 40 && score <= 49) {
            grade = 'E';
        } else if (score >= 30 && score <= 39) {
            grade = 'F';
        } else { // if (score >= 0) {
            grade = 'G';
        }
        return grade;
    }
}
