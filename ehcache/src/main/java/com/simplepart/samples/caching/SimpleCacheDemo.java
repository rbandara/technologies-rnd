package com.simplepart.samples.caching;

import net.sf.ehcache.CacheManager;
import net.sf.ehcache.Cache;
import org.apache.log4j.Logger;
import com.simplepart.samples.trivial.sequences.SequenceGenerator;
import com.simplepart.samples.trivial.sequences.FibonacciGenerator;
import com.simplepart.samples.trivial.sequences.CachingSequenceGenerator;

import java.text.MessageFormat;

public class SimpleCacheDemo {

    private static final Logger log = Logger.getLogger(SimpleCacheDemo.class);

    public static void main(String[] args) throws Exception {

        CacheManager manager = CacheManager.create();
        
        try {
            SequenceGenerator innerGenerator = new FibonacciGenerator();
            Cache cache = manager.getCache("demo");

            SequenceGenerator generator = new CachingSequenceGenerator(innerGenerator, cache);

            execute(generator, 5);

            log.info("Twiddling thumbs for a few seconds while the cache expires...");
            Thread.sleep(6000);

            log.info("Ok, one more time...");

            execute(generator, 2);

        } finally {
            manager.shutdown();
        }

        log.info("Exiting demo.");
    }

    private static void execute(SequenceGenerator generator, int repetitions) {
        for (int repetition = 0; repetition < repetitions; repetition++) {
            long start = System.currentTimeMillis();
            int[] sequence = generator.generate(20);
            long duration = System.currentTimeMillis() - start;
            log.info(MessageFormat.format("returned sequence of length {0} in {1} milliseconds", sequence.length, duration));
        }
    }
}
