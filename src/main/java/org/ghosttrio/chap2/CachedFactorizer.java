package org.ghosttrio.chap2;

import net.jcip.annotations.ThreadSafe;

import java.math.BigInteger;

@ThreadSafe
public class CachedFactorizer {

    private BigInteger lastNumber;
    private BigInteger[] lastFactors;
    private long hits;
    private long cacheHits;

    public synchronized long getHits() {
        return hits;
    }

    public synchronized double getCacheHitRatio() {
        return (double) cacheHits / (double) hits;
    }

    public void service(BigInteger req) {
        BigInteger[] factors = null;
        synchronized (this) {
            ++hits;
            if (req.equals(lastNumber)) {
                ++cacheHits;
                factors = lastFactors.clone();
            }
        }
        if (factors == null) {
            factors = new BigInteger[]{req};
            synchronized (this) {
                lastNumber = req;
                lastFactors = factors.clone();
            }
        }
    }
}
