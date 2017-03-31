package com.experience.service;

import java.time.LocalDateTime;

public class ThreadWaitTest extends Thread {
    public static void main(String[] args) {
        ThreadWaitTest test = new ThreadWaitTest();
        test.testWaitMethod();
    }

    public void testWaitMethod() {
        try {
            for (int i = 0; i < 10; i++) {
                System.out.println("time: " + LocalDateTime.now() + " , i:" + i);
                wait(1000);
            }
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }
}
