package com.simplepart.samples.trivial.sequences;

/**
 * SequenceGenerator implementation for a Fibonacci sequence.
 */
public class FibonacciGenerator implements SequenceGenerator {

    /**
     * Generates the first n digits of the Fibonacci sequence, where n is the value of the length parameter.
     * This method is correct for 1 <= n < 47. From the 47th number onwards, the result will overflow and
     * become negative.
     * @param length The length of the sequence to generate.
     * @return The first digits of the Fibonacci sequence.
     */
    public int[] generate(int length) {
        if (length < 1)
            throw new IllegalArgumentException("The minimum length is 1.");

        final int[] sequence = new int[length];

        for (int position = 0; position < length; position++) {
            sequence[position] = (position <= 1)
                ? 1
                : sequence[position -1] + sequence[position -2];

            // Sleep for a bit to pretend we're doing something really complex
            try {
                Thread.sleep(50);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }

        return sequence;
    }
}
