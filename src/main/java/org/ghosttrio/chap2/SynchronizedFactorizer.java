package org.ghosttrio.chap2;

import net.jcip.annotations.ThreadSafe;

import java.math.BigInteger;
import java.util.concurrent.atomic.AtomicReference;

@ThreadSafe
public class SynchronizedFactorizer {

    private final AtomicReference<BigInteger> lastNumber = new AtomicReference<>();
    private final AtomicReference<BigInteger[]> lastFactors = new AtomicReference<>();

    public synchronized void service(BigInteger req) {
        if(req.equals(lastNumber.get())) {
            encodeResponse(lastFactors.get());
        } else {
            lastNumber.set(req);
            lastFactors.set(new BigInteger[]{req});
        }
    }

    private void encodeResponse(BigInteger[] value) {
    }

}
