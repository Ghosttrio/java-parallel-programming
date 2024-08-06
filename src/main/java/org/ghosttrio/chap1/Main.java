package org.ghosttrio.chap1;

public class Main {
    public static void main(String[] args) throws InterruptedException {
        Sequence sequence = new Sequence();
        for (int i = 0; i < 100; i++) {
            Thread thread = new Thread(sequence::getNext);
            thread.start();
        }
        Thread.sleep(10);
        int result1 = sequence.getValue();
        System.out.println(result1);

        UnsafeSequence unsafeSequence = new UnsafeSequence();
        for (int i = 0; i < 100; i++) {
            Thread thread = new Thread(unsafeSequence::getNext);
            thread.start();
        }
        Thread.sleep(10);
        int result2 = unsafeSequence.getValue();
        System.out.println(result2);

    }
}
