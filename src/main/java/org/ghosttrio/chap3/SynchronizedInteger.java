package org.ghosttrio.chap3;

import net.jcip.annotations.ThreadSafe;

@ThreadSafe
public class SynchronizedInteger {
    private int value;

    public synchronized int getValue() {
        return value;
    }

    public synchronized void setValue(int value) {
        this.value = value;
    }
}
