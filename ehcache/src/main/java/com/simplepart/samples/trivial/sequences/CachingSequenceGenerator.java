package com.simplepart.samples.trivial.sequences;

import net.sf.ehcache.Ehcache;
import net.sf.ehcache.Element;
import org.apache.log4j.Logger;


public class CachingSequenceGenerator implements SequenceGenerator {

    private static final Logger log = Logger.getLogger(CachingSequenceGenerator.class);
    
    private SequenceGenerator generator;
    private Ehcache cache;

    public CachingSequenceGenerator(SequenceGenerator generator, Ehcache cache) {
        this.generator = generator;
        this.cache = cache;
    }

    public int[] generate(int length) {

        Integer key = Integer.valueOf(length);
        Element element = cache.get(key);

        if (element != null) {
            log.info("Element found in cache; returning cached element.");
            return (int[])element.getValue();
        }

        log.info("Element not in cache; generating new.");
        int[] sequence = generator.generate(length);

        log.info("Adding element to cache.");
        cache.put(new Element(key, sequence));
        
        return sequence;
    }
}
