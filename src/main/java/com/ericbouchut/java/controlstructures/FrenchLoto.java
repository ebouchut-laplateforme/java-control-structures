package com.ericbouchut.java.controlstructures;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;

/**
 * This class mimics the results of the <i>French Loto</i>.
 * It uses Random
 *
 * @see FrenchLoto#results()
 * @see java.util.Random
 */
public class FrenchLoto {

    /**
     * The size of draw (results 6 numbers).
     */
    public static final int RESULTS_SIZE = 6;

    private Random random;

    public static void main(String[] args) {
        FrenchLoto loto = new FrenchLoto();

        for(int i=0; i < 10; i++) {
            List<Integer> results = loto.results();

            // The shorter way to display the results List
            // System.out.println(results);

            // Display the list using a foreach loop.
            // This is a contrived example to pratice the foreach loop.
            for(Integer ball: results) {
                System.out.print(ball);
                System.out.print(", ");
            }
            System.out.println();
        }
    }

    public FrenchLoto() {
        random = new Random();
    }

    /**
     *  Returns the results of a <code>draw</code>,
     *  that is a ordered list of 6 numbers, like so:
     *  <ul>
     *    <li>5 numbers (balls) between 1 and 49 (inclusive)</li>
     *    <li>1 number (numéro chance aka. bonus ball) between 1 and 10 (inclusive)</li>
     *  </ul>
     *
     * @return the results from a draw as a list of 5 Integers
     */
    public List<Integer> results() {
        List<Integer> lotoResults = new ArrayList<Integer>(RESULTS_SIZE);

        for (int i=0; i < 5; i++) {
            lotoResults.add(newBall()); // add a random number between [1, 49]
        }
        lotoResults.add(newBonusBall()); // add a random number between [1, 10]

        return lotoResults;
    }

    /**
     * Draw a new ball that is a random number between 1 and 49 (inclusive),
     * (i.e., <code>[1, 49]</code>)
     *
     * @return a number between 1 and 49 (inclusive)
     */
    protected int newBall() {
        return random.nextInt(49) + 1;
    }

    /**
     * Draw the bonus ball, that is a random number between 1 and 10,
     * (i.e., <code>[1, 10]</code>).
     *
     * @return a random integer between 1 and 10 (inclusive)
     */
    protected int newBonusBall() {
        return random.nextInt(9) + 1;
    }
}
