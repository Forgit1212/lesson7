package org.example.metod;

import java.util.concurrent.atomic.AtomicInteger;

public class AtomicData {
    public static void main(String[] args) {
        AtomicInteger ai = new AtomicInteger(10);
        ai.addAndGet(5);//добавит 5, т.е ai = 15

    }
}
