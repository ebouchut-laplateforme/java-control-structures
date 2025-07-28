package com.ericbouchut.java.controlstructures;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class WordCount {

    public static void main(String[] args) {
        String[] words = {"chat", "ordinateur", "clé", "avion", "programmation"};

        System.out.println("words: ");
        for (String word: words) {
            System.out.print(word + ", ");
        }
        System.out.println();

        WordCount wordCount = new WordCount(words);
        System.out.println("Number of 4+ characters words: " + wordCount.count(4));
    }

    /**
     * The list of words.
     */
    private final List<String> words;

    /**
     * Constructs a <code>WordCount</code> with the passed-in list of words.
     *
     * @param words a <code>List</code> of words of type <code>String</code>
     */
    public WordCount(List<String> words) {
        this.words = new ArrayList<>(words);
    }

    /**
     * Constructs a <code>WordCount</code> from an array of words.
     *
     * @param words an array containing words of type <code>String</code>
     */
    public WordCount(String[] words) {
        this(Arrays.asList(words));
    }

    /**
     * Count the words whose size (i.e., length)
     * is greater than or equal to the passed-in size.
     *
     * @param minimumSize the minimum size of words to count
     * @return the number of words whose size is more than <code>minimumSize</code>
     */
    public int count(int minimumSize) {
        int count = 0;

        for (String word: words) {
            if (word.length() >= minimumSize) {
                count++;
            }
        }
        return count;
    }
}
