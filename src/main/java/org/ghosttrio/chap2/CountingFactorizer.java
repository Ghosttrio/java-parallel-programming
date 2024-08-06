package org.ghosttrio.chap2;

import net.jcip.annotations.NotThreadSafe;
import net.jcip.annotations.ThreadSafe;

import java.math.BigInteger;
import java.util.concurrent.atomic.AtomicLong;

@ThreadSafe
public class CountingFactorizer {

    private final AtomicLong count = new AtomicLong(0);

    public long getCount() {
        return count.get();
    }

    public void service(BigInteger req) {
        BigInteger value = req.abs();
        count.incrementAndGet();
        encodeResponse(value);
    }
    private void encodeResponse(BigInteger value) {
    }
}
