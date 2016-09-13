package com.simplepart.samples.trivial.sequences;

import net.sf.ehcache.Ehcache;
import net.sf.ehcache.Element;
import static org.junit.Assert.assertArrayEquals;
import org.junit.Test;
import org.mockito.InOrder;
import static org.mockito.Mockito.*;
import com.simplepart.samples.trivial.sequences.SequenceGenerator;
import com.simplepart.samples.trivial.sequences.CachingSequenceGenerator;

public class CachingSequenceGeneratorTestCase {

    @Test
    public void shouldQueryCacheWhenRequested() {

        final Integer length = Integer.valueOf(5);
        final int[] sequence = new int[] { 1, 1, 2, 3, 5 }; 

        final Ehcache cache = mock(Ehcache.class);
        final SequenceGenerator innerGenerator = mock(SequenceGenerator.class);

        // Return null the first time, simulating an empty cache. Then return a populated element.
        when(cache.get(length)).thenReturn(null, new Element(length, sequence));
        when(innerGenerator.generate(length)).thenReturn(sequence);

        // Execute the method:
        SequenceGenerator generator = new CachingSequenceGenerator(innerGenerator, cache);

        // First call should hit inner generator and populate cache.
        final int[] returnValue = generator.generate(5);

        // Second call should be served from cache.
        generator.generate(5);

        assertArrayEquals(
            "CachingSequenceGenerator should return the sequence as it is given by the inner generator",
            sequence, returnValue);

        // Confirm the order of events:
        InOrder executionOrder = inOrder(cache, innerGenerator);

        // The first time the sequence is requested, it will not be in the cache, so
        // the cache will return null.
        executionOrder.verify(cache).get(length);

        // Since the cache didn't come up with a result, we have to ask the generator to
        // create it for us. This should only happen once per length.
        executionOrder.verify(innerGenerator).generate(length);

        // Once the generator gives us a sequence, we should cache it for future use.
        executionOrder.verify(cache).put(any(Element.class));

        // The second time round, the result will be cached, so we return the element.
        executionOrder.verify(cache).get(length);
    }
}
