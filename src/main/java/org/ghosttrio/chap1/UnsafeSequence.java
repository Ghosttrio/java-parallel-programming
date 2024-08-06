package org.ghosttrio.chap1;

import org.ghosttrio.util.NotThreadSafe;

@NotThreadSafe
public class UnsafeSequence {

    private int value;

    public int getNext() {
        return value++;
    }
}
