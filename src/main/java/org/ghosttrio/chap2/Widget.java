package org.ghosttrio.chap2;

public class Widget {
    public synchronized void doSomething() {
    }
}

class LogginWidget extends Widget {
    public synchronized void doSomething() {
        super.doSomething();
    }
}