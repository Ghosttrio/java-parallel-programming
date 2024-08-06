package org.ghosttrio.chap2;

import java.math.BigInteger;

public class Main {
    public static void main(String[] args) {
        BigInteger input = BigInteger.valueOf(100);
        StatelessFactorizer statelessFactorizer = new StatelessFactorizer();
        UnsafeCountingFactorizer unsafeCountingFactorizer = new UnsafeCountingFactorizer();
        for (int i = 0; i < 100; i++) {
            Thread thread = new Thread(() -> unsafeCountingFactorizer.service(input));
            thread.start();
        }
        long result = unsafeCountingFactorizer.getCount();
        System.out.println(result);

    }
}
