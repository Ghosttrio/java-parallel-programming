package org.ghosttrio.chap2;

import net.jcip.annotations.NotThreadSafe;

import java.math.BigInteger;

@NotThreadSafe
public class UnsafeCountingFactorizer {

    private long count = 0;

    public long getCount() {
        return count;
    }

    public void service(BigInteger req) {
        BigInteger value = req.abs();
        ++count;
        encodeResponse(value);
    }

    private void encodeResponse(BigInteger value) {

    }
}
