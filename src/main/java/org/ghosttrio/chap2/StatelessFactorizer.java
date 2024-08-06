package org.ghosttrio.chap2;

import net.jcip.annotations.ThreadSafe;

import java.math.BigInteger;

@ThreadSafe
public class StatelessFactorizer {

    public void service(BigInteger req) {
        BigInteger value = req.abs();
        encodeResponse(value);
    }

    private void encodeResponse(BigInteger value) {
    }
}
