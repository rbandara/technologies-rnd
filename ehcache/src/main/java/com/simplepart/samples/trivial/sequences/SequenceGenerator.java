package com.simplepart.samples.trivial.sequences;

/**
 * Generates a sequence of integers. The sequence is entirely dependent on the implementing class.
 */
public interface SequenceGenerator {

    /**
     * Generates a sequence of integers.
     * @param length The length of the sequence to generate.
     * @return A sequence of the requested length.
     */
    int[] generate(int length);
}
