package org.ghosttrio.chap1;

import net.jcip.annotations.GuardedBy;
import org.ghosttrio.util.ThreadSafe;

@ThreadSafe
public class Sequence {

    @GuardedBy("this")
    private int value;

    public synchronized int getNext() {
        return value++;
    }
}
