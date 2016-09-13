package com.simplepart.samples.trivial.sequences;

import static org.junit.Assert.*;
import org.junit.Before;
import org.junit.Test;

public class FibonacciGeneratorTestCase {

    protected SequenceGenerator generator;

    @Before
    public void setup() {
        generator = new FibonacciGenerator();
    }

    @Test
    public void shouldGenerateCorrectSequence() {

        int[] sequence = generator.generate(5);
        assertNotNull("The fibonacci sequence should never be returned as null", sequence);
        assertEquals("The generate method should return an array of the requested length", 5, sequence.length);
        assertArrayEquals("The array should contain the first n values of the fibonacci sequence", new int[] { 1, 1, 2, 3, 5 }, sequence);
    }

    @Test(expected = IllegalArgumentException.class)
    public void shouldThrowIllegalArgumentExceptionIfLengthLessThan1() {
        generator.generate(0);
    }
}
