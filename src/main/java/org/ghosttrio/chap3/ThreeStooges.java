package org.ghosttrio.chap3;

import net.jcip.annotations.Immutable;

import java.util.HashSet;
import java.util.Set;

@Immutable
public final class ThreeStooges {

    private final Set<String> stooges = new HashSet<>();

    public ThreeStooges() {
        stooges.add("MOE1");
        stooges.add("MOE2");
        stooges.add("MOE3");
    }

    public boolean isStooge(String name) {
        return stooges.contains(name);
    }
}
